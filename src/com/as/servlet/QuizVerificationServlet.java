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
import com.as.business.SetMarksVO;

/**
 * Servlet implementation class QuizVerification
 */
@WebServlet("/QuizVerificationServlet")
public class QuizVerificationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/**************** session verification **************************************************/
		HttpSession session = request.getSession();
		if (session == null) {
			System.out.println("session not created");
		} else {
			System.out.println("session created in servlet" + session.getId());
		}
		/******************************************************************************************/

		int hitscount = Integer.parseInt(request.getParameter("hitscount"));
		String submittedCourse = request.getParameter("submittedCourse");
		String ansRadio = request.getParameter("ansRadio");
		int submittedIndex = Integer.parseInt(request.getParameter("submittedIndex"));
		// test
		System.out.println(
				"submitted answer:" + request.getParameter("ansRadio") + " " + request.getParameter("submittedIndex"));

		//quiz verification
		int score = QuizGeneratorBO.quizVerificationBO(submittedIndex, ansRadio, submittedCourse, request);

		//QuizGeneratorBO quizGeneratorBO = new QuizGeneratorBO();
		if(hitscount<10){
			//get questions
		session.setAttribute("question", QuizGeneratorBO.getQuestion(submittedCourse));
		response.sendRedirect("/Quiz_Generator/jsp/Quiz.jsp");
		//request.getRequestDispatcher("/jsp/Quiz.jsp").forward(request, response);
		}else{
			SetMarksVO setMarksVOO = new SetMarksVO();
			LoginVO loginVOO = new LoginVO();
			loginVOO = (LoginVO)session.getAttribute("credentials");
			setMarksVOO.setUserId(loginVOO.getUserName());
			setMarksVOO.setCourse(submittedCourse);
			setMarksVOO.setMarks(score);
			
			System.err.println("test");
			QuizGeneratorBO.setMarksBO(setMarksVOO);
			
			session.setAttribute("myScore", score);
			response.sendRedirect("/Quiz_Generator/jsp/QuizOver.jsp");
			/*request.getRequestDispatcher("/Quiz_Generator/jsp/QuizOver.jsp").forward(request, response);*/
		}

	}

}
