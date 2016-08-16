package com.as.servlet;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.as.business.AssignmentUploadFacultyVO;
import com.as.business.QuizGeneratorBO;

/**
 * Servlet implementation class AssignmentIploadFacultyServlet
 */
@WebServlet("/AssignmentUploadFacultyServlet")
@MultipartConfig(maxFileSize = 16177215)
public class AssignmentUploadFacultyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("hello");
		// obtains the upload file part in this multipart request
        Part filePart = request.getPart("assignmentFile");
        InputStream inputStream = null; // input stream of the upload file
        if (filePart != null) {
            // prints out some information for debugging
        	System.out.println(filePart.getName());
            System.out.println(filePart.getSize());
            System.out.println(filePart.getContentType());
             
        	/*String fileName = filePart.getContentType();*/
            // obtains input stream of the upload file
            inputStream = filePart.getInputStream();
            
            System.out.println(inputStream);
        }
        
        AssignmentUploadFacultyVO assignmentUploadFacultyVOO = new AssignmentUploadFacultyVO();
        assignmentUploadFacultyVOO.setFilePath(inputStream);
		assignmentUploadFacultyVOO.setAssignmentCourse(request.getParameter("assignmentCourse")); 
		assignmentUploadFacultyVOO.setDueDate(request.getParameter("datepicker"));
		assignmentUploadFacultyVOO.setTime(request.getParameter("time"));
		assignmentUploadFacultyVOO.setDayTime(request.getParameter("dayTime"));
		
		/*HttpSession session = request.getSession();
		session.setAttribute("x", "assignmentUploadFacultyVOO");*/
		System.out.println(assignmentUploadFacultyVOO.getTime());
		QuizGeneratorBO.postAssignment(assignmentUploadFacultyVOO);
		System.out.println("bye");
		
		response.sendRedirect("/Quiz_Generator/jsp/ProfessorPortal.jsp");
		System.out.println("bye");
		
		
	}
	
}
