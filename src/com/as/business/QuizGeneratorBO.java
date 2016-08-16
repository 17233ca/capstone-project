package com.as.business;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.as.dao.QuizGeneratorDAO;
import com.as.servlet.RandomNumber;

public class QuizGeneratorBO {

	private static int randomIndex;
	private static int counter;
	private static HashSet<Integer> set = new HashSet<>();

	public String checkLoginAdmin(LoginVO loginvo) {

		String userName = loginvo.getUserName();
		String password = loginvo.getPassword();
		String error = QuizGeneratorDAO.getDataLogin(userName, password);
		if (error != "") {
			return error;
		} else
			return "";

	}

	public String checkLoginStudent(LoginVO loginvo) {

		String userName = loginvo.getUserName();
		String password = loginvo.getPassword();
		String error = QuizGeneratorDAO.getStudentDataLogin(userName, password);
		if (error != "") {
			return error;
		} else
			return "";
	}

	// questions inserted by professor
	public StringBuffer insertQuestion(QuestionsVO questionVOO, String correctAns, String course) {

		StringBuffer message = new StringBuffer();
		HashMap<QuestionsVO, String> hm = new HashMap<>();

		switch (course) {
		case "java":
			System.out.println("hello java");
			hm.put(questionVOO, correctAns);
			message = QuizGeneratorDAO.insertQuestionJava(hm);
			break;
		case "php":
			System.out.println("hello php");
			hm.put(questionVOO, correctAns);
			message = QuizGeneratorDAO.insertQuestionPhp(hm);
			break;
		case "c":
			hm.put(questionVOO, correctAns);
			message = QuizGeneratorDAO.insertQuestionCPlusPlus(hm);
			break;
		case "html":
			hm.put(questionVOO, correctAns);
			message = QuizGeneratorDAO.insertQuestionHtml(hm);
			break;
		case "dbms":
			hm.put(questionVOO, correctAns);
			message = QuizGeneratorDAO.insertQuestionDbms(hm);
			break;
		}

		return message;

	}

	public StudentPortalVO studentPortalDetails(LoginVO loginvo) {
		String userName = loginvo.getUserName();
		StudentPortalVO studentCompleteData = QuizGeneratorDAO.getStudentDataPortal(userName);
		return studentCompleteData;
	}

	/**************************************
	 * get quiz
	 **********************************************************/

	public static HashMap<Integer, QuestionsVO> getQuestion(String course) {
		QuizGeneratorDAO quizGeneratorDAO = new QuizGeneratorDAO();
		HashMap<Integer, QuestionsVO> hm = new HashMap<>();

		// total size of the table
		int sizeOfTable = quizGeneratorDAO.sizeOfQuestionBankTable(course);

		//QuizGeneratorBO quizGenerator = new QuizGeneratorBO();
		while (randomIndex == 0 || set.contains(randomIndex)) {

			randomIndex = RandomNumber.randomNumber(sizeOfTable);
		}
		System.err.println("random:" + randomIndex);
		System.err.println("set:"+set);
		set.add(randomIndex);
		System.err.println("after set:"+set);
		hm = quizGeneratorDAO.getQuestionsDAO(course, randomIndex);

		System.err.println("Quiz Over!!!!");

		return hm;
		/* } */

		/* HashMap<Integer,QuestionsVO> hm = */

		/*
		 * for(Map.Entry<Integer,QuestionsVO> m : hm.entrySet()){
		 * System.out.println(m.getKey()+" "+m.getValue().getQuestion());
		 */
	}
	/* return hm; */

	/**************************************
	 * quiz verification
	 ********************************************************************/

	public static int quizVerificationBO(int submittedIndex, String ansRadio, String submittedCourse,
			HttpServletRequest request) {

		/*
		 * if(counter>10){ counter = 0; }
		 */
		HttpSession session = request.getSession();

		if (session.isNew()) {
			System.err.println("new session" + session.getId());
			counter = 0;
		}
		System.out.println("session inside verification quizGeneratorBO:" + session.getId());

		String correctAnswer = QuizGeneratorDAO.quizVerificationDAO(submittedIndex, submittedCourse);

		if (ansRadio.equals(correctAnswer)) {
			counter++;
		}

		System.err.println("points:" + counter);

		return counter;
	}

	public static void postAssignment(AssignmentUploadFacultyVO assignmentUploadFacultyVOO) {

		System.out.println("hey");
		if (assignmentUploadFacultyVOO != null) {
			QuizGeneratorDAO.postAssignmentDB(assignmentUploadFacultyVOO);
		} else
			System.out.println("error");

	}

	public static void postRegistration(RegistrationVO registrationVO) {
		QuizGeneratorDAO.postRegistrationDB(registrationVO);
		System.out.println("helloBO");
	}

	/***********************************
	 * send mail to student
	 ***************************************/
	public static void mailBO(String userName, String eMail, String regPassword) {

		String uniqueUserName = userName.toString();
		final String username = "npuvirtualclassroom@gmail.com";
		final String password = "npu123456789";

		Properties props = new Properties();
		/*
		 * props.put("mail.smtp.auth", "true");
		 * props.put("mail.smtp.starttls.enable", "true");
		 * props.put("mail.smtp.host", "smtp.gmail.com");
		 * props.put("mail.smtp.port", "587");
		 */

		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");

		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("npuvirtualclassroom@gmail.com"));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(eMail));
			message.setSubject("new userID");
			message.setText("Hello your new userId is:" + uniqueUserName + "\n your password is:" + regPassword);

			Transport.send(message);

			System.out.println("Done");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	} // main

	public static StringBuffer userNameGenerator(String fName, String lName) {

		StringBuffer stringIndexNo = new StringBuffer();
		int indexNo = QuizGeneratorDAO.extractIndexNumber();
		System.out.println("indexNo:" + indexNo);

		char firstNameInit = fName.charAt(0);
		char lastNameInit = lName.charAt(0);

		// converting character to string
		String fNameChar = Character.toString(firstNameInit);
		String lNameChar = Character.toString(lastNameInit);

		// appending index and name initials of the student
		stringIndexNo.append(indexNo);
		stringIndexNo.append(fNameChar);
		stringIndexNo.append(lNameChar);
		System.out.println("userID:" + stringIndexNo);

		return stringIndexNo;
	}

	/**********************************
	 * get assignments from db
	 ***************************************************/

	public static ArrayList<AssignmentVO> getAssignmentBO() {

		ArrayList<AssignmentVO> assignmentVOO = QuizGeneratorDAO.getAssignmentDAO();
		return assignmentVOO;
	}

	/***********************************
	 * video upload by faculty
	 **********************************************************************************/

	public static void videoUploadBO(VideoUploadFacultyVO videoUploadFacultyVOO) {

		QuizGeneratorDAO.videoUploadFacultyDAO(videoUploadFacultyVOO);
	}

	/************************************
	 * video retrival
	 **************************************************************************/
	public static ArrayList<VideoUploadFacultyVO> getVideoBO(String course) {

		ArrayList<VideoUploadFacultyVO> videoAL = QuizGeneratorDAO.getVideoDAO(course);

		return videoAL;
	}

	/*************************************
	 * store marks in db
	 ********************************************************************************/
	public static void setMarksBO(SetMarksVO setMarksVOO) {
		System.err.println("inside setMarksBO");
		System.err.println("user ID:" + setMarksVOO.getUserId());
		System.err.println("course:" + setMarksVOO.getCourse());
		System.err.println("marks:" + setMarksVOO.getMarks());

		QuizGeneratorDAO.setMarksDAO(setMarksVOO);

	}

	/***************************************
	 * get the marks from DB
	 *****************************************************************************/
	public static ArrayList<GetMarksVO> getMarksBO(String userName, String course) {
		ArrayList<GetMarksVO> getMarksVOO = QuizGeneratorDAO.getMarksDAO(course, userName);
		return getMarksVOO;

	}

	/***************************************
	 * contact us
	 *****************************************************************************/
	public static void contactUsSendMailBO(ContactUsVO contactUsVOO) {

		final String username = "npunoreply@gmail.com";
		final String password = "npunoreply123456789";

		Properties props = new Properties();
		/*
		 * props.put("mail.smtp.auth", "true");
		 * props.put("mail.smtp.starttls.enable", "true");
		 * props.put("mail.smtp.host", "smtp.gmail.com");
		 * props.put("mail.smtp.port", "587");
		 */

		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");

		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("npunoreply@gmail.com"));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("npuvirtualclassroom@gmail.com"));
			message.setSubject("Inquire!!");
			message.setText("Email:" + contactUsVOO.getEmail() + "\n First name:" + contactUsVOO.getFirstName()
					+ "\n last name:" + contactUsVOO.getLastName() + "\n city:" + contactUsVOO.getCity() + "\n state:"
					+ contactUsVOO.getState() + "\n country:" + contactUsVOO.getCountry() + "\n comment:"
					+ contactUsVOO.getComment());

			Transport.send(message);

			System.out.println("Done");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}

	}
}
