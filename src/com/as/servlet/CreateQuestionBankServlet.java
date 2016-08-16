package com.as.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.as.business.QuestionsVO;
import com.as.business.QuizGeneratorBO;

/**
 * Servlet implementation class CreateQuestionBankServlet
 */
@WebServlet("/CreateQuestionBankServlet")
public class CreateQuestionBankServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String course = request.getParameter("course_select");
		
		String question = request.getParameter("question_txt");
		
		String optionA = request.getParameter("optionA_txt");
		String optionB = request.getParameter("optionB_txt");
		String optionC = request.getParameter("optionC_txt");
		String optionD = request.getParameter("optionD_txt");
		
		String correctAnswer = request.getParameter("correctAns_txt");
		
		QuestionsVO questionVOO = new QuestionsVO();
		questionVOO.setQuestion(question);
		questionVOO.setOptionA(optionA);
		questionVOO.setOptionB(optionB);
		questionVOO.setOptionC(optionC);
		questionVOO.setOptionD(optionD);
		
		QuizGeneratorBO quizGeneratorBO = new QuizGeneratorBO();
		String getString = quizGeneratorBO.insertQuestion(questionVOO, correctAnswer, course).toString();
		
		//create label and keeps the jsp page for entering question
		request.setAttribute("label", getString);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/CreateQuestionBank.jsp");
		dispatcher.forward(request, response);
		
		
	}

}
