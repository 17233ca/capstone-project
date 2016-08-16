package com.as.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.as.business.LoginVO;
import com.as.business.QuizGeneratorBO;

/**
 * Servlet implementation class QuizControllerServlet
 */
@WebServlet("/QuizControllerServlet")
public class QuizControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//QuizGeneratorBO quizGeneratorBO = new QuizGeneratorBO();
		
		/***************check session******************************************/
		LoginVO loginVO = new LoginVO();
		HttpSession session = request.getSession();
		loginVO = (LoginVO)session.getAttribute("credentials");
		System.out.println(loginVO.getUserName());
		/*********************************************************/
		
		System.out.println("hello1"+request.getParameter("course_select"));
		
		session.setAttribute("question", QuizGeneratorBO.getQuestion(request.getParameter("course_select")));
		response.sendRedirect("/Quiz_Generator/jsp/Quiz.jsp");
		//request.getRequestDispatcher("/jsp/Quiz.jsp").forward(request, response);
		
	}

}
