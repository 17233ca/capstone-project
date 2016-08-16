package com.as.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.as.business.QuizGeneratorBO;
import com.as.business.VideoUploadFacultyVO;

/**
 * Servlet implementation class VideoUploadFacultyServlet
 */
@WebServlet("/VideoUploadFacultyServlet")
public class VideoUploadFacultyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		VideoUploadFacultyVO videoUploadFacultyVOO = new VideoUploadFacultyVO();
		videoUploadFacultyVOO.setCourse(request.getParameter("selectCourseVideo")); 
		videoUploadFacultyVOO.setTitle(request.getParameter("title"));
		videoUploadFacultyVOO.setLink(request.getParameter("link"));
		videoUploadFacultyVOO.setDescriptor(request.getParameter("desc"));
		
		QuizGeneratorBO.videoUploadBO(videoUploadFacultyVOO);
		
		response.sendRedirect("/Quiz_Generator/jsp/VideoUploadFaculty.jsp");
		/*request.getRequestDispatcher("/Quiz_Generator/jsp/VideoUploadFaculty.jsp").forward(request, response);*/
	}

}
