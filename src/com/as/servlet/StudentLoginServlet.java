package com.as.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.as.business.LoginVO;
import com.as.business.QuizGeneratorBO;

/**
 * Servlet implementation class StudentLoginServlet
 */
@WebServlet("/StudentLoginServlet")
public class StudentLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String strTargetUrl = "jsp/StudentPortal.jsp";
		if(request.getMethod().equalsIgnoreCase("POST")){
			HttpSession session = request.getSession(true); 
			
			synchronized(session){
			
				LoginVO loginVO = new LoginVO();
				loginVO.setUserName(request.getParameter("userName_txt"));
				loginVO.setPassword(request.getParameter("password_txt"));
				
				session.setAttribute("credentials", loginVO);
				
				QuizGeneratorBO quizGeneratorBO = new QuizGeneratorBO();
				String error = quizGeneratorBO.checkLoginStudent(loginVO);
				//test
				System.err.println("test");
				System.out.println(error);
				if(error.length()!=0){
					request.setAttribute("errorMsg", error);
					RequestDispatcher dis = request.getRequestDispatcher("jsp/StudentLogin.jsp");
                    dis.forward(request, response);
				}else
					System.out.println("hello redirected to the url");
					/*request.getRequestDispatcher(strTargetUrl).forward(request, response);*/
					session.setAttribute("studentPortalData", quizGeneratorBO.studentPortalDetails(loginVO));
					session.setAttribute("assignment", QuizGeneratorBO.getAssignmentBO()); 
					response.sendRedirect(strTargetUrl);
			}
			
			/*//request forward
			RequestDispatcher dispatcher = request.getRequestDispatcher(strTargetUrl);
			dispatcher.forward(request, response);*/
		}
	}
	}


