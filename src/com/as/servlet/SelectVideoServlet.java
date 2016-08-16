package com.as.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.as.business.QuizGeneratorBO;
import com.as.business.VideoUploadFacultyVO;

/**
 * Servlet implementation class SelectVideoServlet
 */
@WebServlet("/SelectVideoServlet")
public class SelectVideoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		ArrayList<VideoUploadFacultyVO> videoAL = QuizGeneratorBO.getVideoBO(request.getParameter("course_select"));
		/*request.setAttribute("video", videoAL);*/
		session.setAttribute("video", videoAL);
		System.err.println("under request.setAttribute(video)");
		/*request.getRequestDispatcher("/Quiz_Generator/jsp/DisplayVideo.jsp").forward(request, response);*/
		response.sendRedirect("/Quiz_Generator/jsp/DisplayVideo.jsp");
	}

}
