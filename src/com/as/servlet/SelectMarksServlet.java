package com.as.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.as.business.GetMarksVO;
import com.as.business.LoginVO;
import com.as.business.QuizGeneratorBO;

/**
 * Servlet implementation class SelectMarksServlet
 */
@WebServlet("/SelectMarksServlet")
public class SelectMarksServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String course = request.getParameter("course_select");
		
		LoginVO loginVO = new LoginVO();
		HttpSession session = request.getSession();
		loginVO = (LoginVO)session.getAttribute("credentials");
		String userName = loginVO.getUserName();
		
		ArrayList<GetMarksVO> getMarksVOO = QuizGeneratorBO.getMarksBO(userName, course);
		session.setAttribute("marks", getMarksVOO);
		response.sendRedirect("/Quiz_Generator/jsp/DisplayMarks.jsp");
		
		
		
	}

}
