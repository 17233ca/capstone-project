package com.as.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.as.business.QuizGeneratorBO;
import com.as.business.RegistrationVO;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServlet")
@MultipartConfig(maxFileSize = 16177215)
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		InputStream stream = null;
		Part filePart = request.getPart("file_txt");
		stream = filePart.getInputStream();
		RegistrationVO registrationVO = new RegistrationVO();
		registrationVO.setFirstName(request.getParameter("fName_txt"));
		registrationVO.setLastName(request.getParameter("lName_txt"));
		registrationVO.setGender(request.getParameter("registrationGender"));
		registrationVO.setAddress1(request.getParameter("registrationAddress1"));
		registrationVO.setAddress2(request.getParameter("registrationAddress2"));
		registrationVO.setCity(request.getParameter("registrationCity"));
		registrationVO.setState(request.getParameter("registrationState"));
		registrationVO.setPhone(request.getParameter("phone"));
		registrationVO.setEmail(request.getParameter("email_txt"));
		registrationVO.setPassword(request.getParameter("password_txt"));
		registrationVO.setImgFile(stream);
		
		StringBuffer userNameStringBuffer = QuizGeneratorBO.userNameGenerator(registrationVO.getFirstName(),registrationVO.getLastName());
		String userName = userNameStringBuffer.toString();
		registrationVO.setUserName(userName);
		
		QuizGeneratorBO.postRegistration(registrationVO);
		
		QuizGeneratorBO.mailBO(registrationVO.getUserName(), registrationVO.getEmail(), registrationVO.getPassword());
		/*request.setAttribute("userName", registrationVO.getUserName());
		request.setAttribute("password",registrationVO.getPassword());*/
		System.out.println("hello");
		/*request.getRequestDispatcher("/Quiz_Generator/jsp/RegistrationSuccess.jsp").forward(request, response);*/
		request.getSession().setAttribute("userName", registrationVO.getUserName());
		request.getSession().setAttribute("password",registrationVO.getPassword());
		response.sendRedirect("/Quiz_Generator/jsp/RegistrationSuccess.jsp");
		
	}
}
