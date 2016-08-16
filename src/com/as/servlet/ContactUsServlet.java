package com.as.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.as.business.ContactUsVO;
import com.as.business.QuizGeneratorBO;

/**
 * Servlet implementation class ContactUsServlet
 */
@WebServlet("/ContactUsServlet")
public class ContactUsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ContactUsVO contactUsVOO = new ContactUsVO();
		contactUsVOO.setFirstName(request.getParameter("firstName_txt"));
		contactUsVOO.setLastName(request.getParameter("lastName"));
		contactUsVOO.setEmail(request.getParameter("email"));
		contactUsVOO.setCity(request.getParameter("city"));
		contactUsVOO.setState(request.getParameter("state"));
		contactUsVOO.setCountry(request.getParameter("country"));
		contactUsVOO.setZip(request.getParameter("zip"));
		contactUsVOO.setComment(request.getParameter("comment"));
		
		QuizGeneratorBO.contactUsSendMailBO(contactUsVOO);
		
		response.sendRedirect("/Quiz_Generator/jsp/contact.jsp");
		
		
	}

}
