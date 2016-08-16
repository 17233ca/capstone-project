package com.as.dao;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.as.business.AssignmentUploadFacultyVO;
import com.as.business.AssignmentVO;
import com.as.business.GetMarksVO;
import com.as.business.QuestionsVO;
import com.as.business.RegistrationVO;
import com.as.business.SetMarksVO;
import com.as.business.StudentPortalVO;
import com.as.business.VideoUploadFacultyVO;

public class QuizGeneratorDAO {

	// QuizGeneratorDAO daoObject = new QuizGeneratorDAO();

	// basic jdbc connection
	public static Connection connection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("problem in the sql driver" + e.getMessage());
		}

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/question_bank", "root", "");
		} catch (SQLException e) {
			System.out.println("jdbc url problem in dao" + e.getMessage());
		}

		return con;
	}

	/**********************************
	 * Faculty login
	 ***********************************************************/
	// get data from data base and check password
	public static String getDataLogin(String userName, String password) {
		System.err.println("i am in getDataLogin");
		PreparedStatement statement;

		try {
			// test
			System.out.println(userName);
			statement = connection().prepareStatement("select user_name, password from admin_login");
			ResultSet rs = statement.executeQuery();

			// extract result
			while (rs.next()) {
				// rs.absolute(3);
				System.out.println(rs.getString(1));

				String userNameFromDB = rs.getString("user_name");
				String passwordFromDB = rs.getString("password");
				// test
				System.out.println(password);
				if (password.equals(passwordFromDB) && userName.equals(userNameFromDB)) {

					return "";
				} else {
					return "invalid username or password";
				}

			}
		} catch (SQLException e) {
			System.out.println("error creating a statement or in ResultSet" + e.getMessage());
		}
		return "";
	}

	/*
	 * public void checkData(String dataFromDB, String password) {
	 * 
	 * }
	 */
	/***********************************************************************************************************/
	/**********************************
	 * Student login
	 ***********************************************************/
	// get data from data base and check password
	public static String getStudentDataLogin(String userName, String password) {
		PreparedStatement statement;

		try {
			// test
			System.out.println(userName);
			statement = connection().prepareStatement("select password from registration where user_name = ?");
			statement.setString(1, userName);

			ResultSet rs = statement.executeQuery();

			// extract result
			while (rs.next()) {
				// rs.absolute(3);
				System.out.println(rs.getString(1));

				String passwordFromDB = rs.getString(1);
				// test
				System.out.println(password);
				if (password.equals(passwordFromDB)) {

					return "";
				} else {
					return "invalid username or password";
				}

			}
		} catch (SQLException e) {
			System.out.println("error creating a statement or in ResultSet" + e.getMessage());
		}
		return "";
	}

	public void checkData(String dataFromDB, String password) {

	}

	/***********************************************************************************************************/
	/***************************insert question in question bank********************************************************************************/
	
	// insert questions in different course tables
	public static StringBuffer insertQuestionJava(HashMap<QuestionsVO, String> hm) {
		PreparedStatement statement;
		StringBuffer sBuffer = new StringBuffer();

		/* Object hmObj = (Object)hm; */
		try {
			statement = connection().prepareStatement("insert into java values(default,?,?,?,?,?,?)");
			for (Map.Entry<QuestionsVO, String> m : hm.entrySet()) {
				System.out.println(
						m.getKey().getQuestion() + " " + m.getKey().getOptionA() + " " + m.getKey().getOptionB() + " "
								+ m.getKey().getOptionC() + " " + m.getKey().getOptionD() + " " + m.getValue());
				statement.setString(1, m.getKey().getQuestion());
				statement.setString(2, m.getKey().getOptionA());
				statement.setString(3, m.getKey().getOptionB());
				statement.setString(4, m.getKey().getOptionC());
				statement.setString(5, m.getKey().getOptionD());
				statement.setString(6, m.getValue());
				statement.execute();
				sBuffer.append("successfully inserted the data");
				System.out.println("successfully inserted the java object");
			}

			// statement.updateQuery();
		} catch (SQLException e) {
			sBuffer.append("failed to insert the data");
			System.out.println("problem in inserting java object" + e.getMessage());
		}

		return sBuffer;

	}

	public static StringBuffer insertQuestionPhp(HashMap<QuestionsVO, String> hm) {
		PreparedStatement statement;
		StringBuffer sBuffer = new StringBuffer();

		/* Object hmObj = (Object)hm; */
		try {
			statement = connection().prepareStatement("insert into php values(default,?,?,?,?,?,?)");
			for (Map.Entry<QuestionsVO, String> m : hm.entrySet()) {
				System.out.println(
						m.getKey().getQuestion() + " " + m.getKey().getOptionA() + " " + m.getKey().getOptionB() + " "
								+ m.getKey().getOptionC() + " " + m.getKey().getOptionD() + " " + m.getValue());
				statement.setString(1, m.getKey().getQuestion());
				statement.setString(2, m.getKey().getOptionA());
				statement.setString(3, m.getKey().getOptionB());
				statement.setString(4, m.getKey().getOptionC());
				statement.setString(5, m.getKey().getOptionD());
				statement.setString(6, m.getValue());
				statement.execute();
				sBuffer.append("successfully inserted the data");
				System.out.println("successfully inserted the java object");
			}

			// statement.updateQuery();
		} catch (SQLException e) {
			sBuffer.append("failed to insert the data");
			System.out.println("problem in inserting java object" + e.getMessage());
		}

		return sBuffer;
	}

	public static StringBuffer insertQuestionCPlusPlus(HashMap<QuestionsVO, String> hm) {
		PreparedStatement statement;
		StringBuffer sBuffer = new StringBuffer();

		/* Object hmObj = (Object)hm; */
		try {
			statement = connection().prepareStatement("insert into c values(default,?,?,?,?,?,?)");
			for (Map.Entry<QuestionsVO, String> m : hm.entrySet()) {
				System.out.println(
						m.getKey().getQuestion() + " " + m.getKey().getOptionA() + " " + m.getKey().getOptionB() + " "
								+ m.getKey().getOptionC() + " " + m.getKey().getOptionD() + " " + m.getValue());
				statement.setString(1, m.getKey().getQuestion());
				statement.setString(2, m.getKey().getOptionA());
				statement.setString(3, m.getKey().getOptionB());
				statement.setString(4, m.getKey().getOptionC());
				statement.setString(5, m.getKey().getOptionD());
				statement.setString(6, m.getValue());
				statement.execute();
				sBuffer.append("successfully inserted the data");
				System.out.println("successfully inserted the java object");
			}

			// statement.updateQuery();
		} catch (SQLException e) {
			sBuffer.append("failed to insert the data");
			System.out.println("problem in inserting java object" + e.getMessage());
		}

		return sBuffer;
	}

	public static StringBuffer insertQuestionHtml(HashMap<QuestionsVO, String> hm) {
		PreparedStatement statement;
		StringBuffer sBuffer = new StringBuffer();

		/* Object hmObj = (Object)hm; */
		try {
			statement = connection().prepareStatement("insert into html values(default,?,?,?,?,?,?)");
			for (Map.Entry<QuestionsVO, String> m : hm.entrySet()) {
				System.out.println(
						m.getKey().getQuestion() + " " + m.getKey().getOptionA() + " " + m.getKey().getOptionB() + " "
								+ m.getKey().getOptionC() + " " + m.getKey().getOptionD() + " " + m.getValue());
				statement.setString(1, m.getKey().getQuestion());
				statement.setString(2, m.getKey().getOptionA());
				statement.setString(3, m.getKey().getOptionB());
				statement.setString(4, m.getKey().getOptionC());
				statement.setString(5, m.getKey().getOptionD());
				statement.setString(6, m.getValue());
				statement.execute();
				sBuffer.append("successfully inserted the data");
				System.out.println("successfully inserted the java object");
			}

			// statement.updateQuery();
		} catch (SQLException e) {
			sBuffer.append("failed to insert the data");
			System.out.println("problem in inserting java object" + e.getMessage());
		}

		return sBuffer;
	}

	public static StringBuffer insertQuestionDbms(HashMap<QuestionsVO, String> hm) {
		PreparedStatement statement;
		StringBuffer sBuffer = new StringBuffer();

		/* Object hmObj = (Object)hm; */
		try {
			statement = connection().prepareStatement("insert into dbms values(default,?,?,?,?,?,?)");
			for (Map.Entry<QuestionsVO, String> m : hm.entrySet()) {
				System.out.println(
						m.getKey().getQuestion() + " " + m.getKey().getOptionA() + " " + m.getKey().getOptionB() + " "
								+ m.getKey().getOptionC() + " " + m.getKey().getOptionD() + " " + m.getValue());
				statement.setString(1, m.getKey().getQuestion());
				statement.setString(2, m.getKey().getOptionA());
				statement.setString(3, m.getKey().getOptionB());
				statement.setString(4, m.getKey().getOptionC());
				statement.setString(5, m.getKey().getOptionD());
				statement.setString(6, m.getValue());
				statement.execute();
				sBuffer.append("successfully inserted the data");
				System.out.println("successfully inserted the java object");
			}

			// statement.updateQuery();
		} catch (SQLException e) {
			sBuffer.append("failed to insert the data");
			System.out.println("problem in inserting java object" + e.getMessage());
		}

		return sBuffer;
	}
/***********************************************************************************************************/
	// get student data for the portal
	public static StudentPortalVO getStudentDataPortal(String userName) {
		PreparedStatement statement;
		StudentPortalVO studentPortalVO = null;
		try {
			FileOutputStream fos = null;
			/*statement = connection().createStatement();*//*
														 * prepareStatement(
														 * "select student_name from student_login where user_name=?"
														 * );
														 */
			/*String query = "select first_name, phone, address1, email, reg_image from registration where user_name="+" "+userName;*/

			statement = connection().prepareStatement("select * from registration where user_name=?");
			statement.setString(1, userName);
			ResultSet rs = statement.executeQuery();	/*executeQuery(query);*/

			while (rs.next()) {
				String student_name = rs.getString("first_name");
				// print
				System.out.println("fetching data of the student");
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
				System.out.println(rs.getBlob(5));

				/*studentPortalVO = new StudentPortalVO();
				studentPortalVO.setName(rs.getString(1));
				studentPortalVO.setPhone(rs.getInt(2));
				studentPortalVO.setEmail(rs.getString(3));
				studentPortalVO.setLocalAddress(rs.getString(4));
				studentPortalVO.setImage(rs.getBlob(5));*/

				studentPortalVO = new StudentPortalVO();
				studentPortalVO.setFirstName(rs.getString(2));
				studentPortalVO.setLastName(rs.getString(3));
				studentPortalVO.setGender(rs.getString(4));
				studentPortalVO.setAddress1(rs.getString(5));
				studentPortalVO.setAddress2(rs.getString(6));
				studentPortalVO.setCity(rs.getString(7));
				studentPortalVO.setState(rs.getString(8));
				studentPortalVO.setPhone(rs.getString(9));
				studentPortalVO.setEmail(rs.getString(10));
				studentPortalVO.setUserName(rs.getString(11));
				studentPortalVO.setPassword(rs.getString(12));
				/*registrationVO.setImgFile(rs.getBlob(12));*/
				
				Blob b = rs.getBlob(13);
				fos = new FileOutputStream(
						"C:/java/j2ee workspace/Quiz_Generator/WebContent/portal_image/" + student_name + ".jpg");
				int len = (int) b.length();
				byte[] buf = b.getBytes(1, len);
				fos.write(buf, 0, len);
				fos.close();
			}
		} catch (SQLException e) {
			System.out.println("error while fetching data for student portal from DB" + e.getMessage());
		} catch (FileNotFoundException e) {
			System.out.println("can not transfer photo to local machine");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return studentPortalVO;
	}

	/***********************************
	 * get questions from database
	 **************************************************************/

	public HashMap<Integer, QuestionsVO> getQuestionsDAO(String course, int randomIndex) {
		System.out.println("course name in DAO:" +course);
		System.out.println("index number in DAO:" +randomIndex);

		HashMap<Integer, QuestionsVO> hm = new HashMap<>();
		QuestionsVO questionVO;
		Statement statement;
		try {
			statement = connection().createStatement();
			String query = "select id,question, option_A, option_B, option_C, option_D from" + " " + course + " " +"where id="+randomIndex; 
			ResultSet rs = statement.executeQuery(query);
			while (rs.next()) {
				System.out.println("course"+course);
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
				System.out.println(rs.getString(5));
				System.out.println(rs.getString(6));

				questionVO = new QuestionsVO();
				int id = Integer.parseInt(rs.getString(1));
				questionVO.setCourse(course);
				questionVO.setQuestion(rs.getString(2));
				questionVO.setOptionA(rs.getString(3));
				questionVO.setOptionB(rs.getString(4));
				questionVO.setOptionC(rs.getString(5));
				questionVO.setOptionD(rs.getString(6));
				hm.put(id, questionVO);
			
		} 
			}catch (SQLException e) {
			System.out.println("error in fetching questions from db; connection.createStatement()" + e.getMessage());
			e.printStackTrace();
		}
		return hm;
	}

/********************************************fetch the size of the question bank table*********************************************************************/

	public int sizeOfQuestionBankTable(String course){
		Statement statement;
		int number = 0;
		try {
			statement = connection().createStatement();
			String query = "select count(*) from "+course;
			ResultSet rs = statement.executeQuery(query);
			while(rs.next()){
				number = rs.getInt(1);
				System.out.println(number);
			}
		} catch (SQLException e) {
			System.out.println("error in getting count from the db table");
			e.printStackTrace();
		}
		
		return number;
		
	}


	/*****************************************
	 * put assignment in db
	 *************************************************************/

	public static void postAssignmentDB(AssignmentUploadFacultyVO assignmentUploadFacultyVOO) {
		System.out.println("im in db");
		
		try {
			PreparedStatement preparedStatement = connection().prepareStatement("INSERT INTO assignment values (default,?, ?, ?, ?, ?)");
			preparedStatement.setString(1, assignmentUploadFacultyVOO.getAssignmentCourse());
			preparedStatement.setBlob(2, assignmentUploadFacultyVOO.getFilePath());
			preparedStatement.setString(3, assignmentUploadFacultyVOO.getDueDate());
			preparedStatement.setString(4, assignmentUploadFacultyVOO.getTime());
			preparedStatement.setString(5, assignmentUploadFacultyVOO.getDayTime());
			preparedStatement.execute();
		} catch (SQLException e) {
			System.out.println("problem in inserting assignment into db"+e.getMessage());
		}
	}	
/************************************registration*********************************************************************/		
		public static void postRegistrationDB(RegistrationVO registrationVO){
			System.err.println("welcome");
			try {
				PreparedStatement preparedStatement = connection().prepareStatement("INSERT INTO registration values(default,?,?,?,?,?,?,?,?,?,?,?,?)");
				preparedStatement.setString(1, registrationVO.getFirstName());
				preparedStatement.setString(2, registrationVO.getLastName());
				preparedStatement.setString(3, registrationVO.getGender());
				preparedStatement.setString(4, registrationVO.getAddress1());
				preparedStatement.setString(5, registrationVO.getAddress2());
				preparedStatement.setString(6, registrationVO.getCity());
				preparedStatement.setString(7, registrationVO.getState());
				preparedStatement.setString(8, registrationVO.getPhone());
				preparedStatement.setString(9, registrationVO.getEmail());
				preparedStatement.setString(10, registrationVO.getUserName());
				preparedStatement.setString(11, registrationVO.getPassword());
				preparedStatement.setBlob(12, registrationVO.getImgFile());
				preparedStatement.execute();
			} catch (SQLException e) {
				System.out.println("Error in inserting registration details in db"+e.getMessage());
			}
		
	}
		
/***************************extract index numbers from the registration page***********************************************************************/		

		public static int extractIndexNumber(){
			ResultSet rs;
			try {
				Statement statement = connection().createStatement();
				String query = "SELECT `index` FROM registration ORDER BY `index` DESC LIMIT 1";
				rs = statement.executeQuery(query);
				while (rs.next()){
					System.out.println(rs.getString(1));
					return rs.getInt(1);
				}
				
			} catch (SQLException e) {
				System.out.println("error in fetching the index from registration table");
				e.printStackTrace();
			}
			
			return 0;
		}
		
/*******************************extract assignment from db***********************************************/
		
		public static ArrayList<AssignmentVO> getAssignmentDAO(){
			AssignmentVO assignmentVOO = null;
			ArrayList<AssignmentVO> al=new ArrayList<>();;
			int number=0;
			int i = 0;
			
			try {
				FileOutputStream fos = null;
				Statement statement1 = connection().createStatement();
				String query1 = "select count(*) from assignment";
				ResultSet rs1 = statement1.executeQuery(query1);
				while(rs1.next()){
					number = rs1.getInt(1);
					System.out.println(number);
				}
				
				
				Statement statement = connection().createStatement();
				String query = "select * from assignment";
				ResultSet rs = statement.executeQuery(query);
				while (rs.next()){
					System.out.println(rs.getInt(1));
					System.out.println(rs.getString(2));
					//System.out.println(rs.getString(3));
					System.out.println(rs.getString(4));
					System.out.println(rs.getString(5));
					System.out.println(rs.getString(6));
				
					assignmentVOO = new AssignmentVO();
					assignmentVOO.setIndex(rs.getString(1));
					assignmentVOO.setCourse(rs.getString(2));
					assignmentVOO.setFile(rs.getBlob(3));
					assignmentVOO.setDueDate(rs.getString(4));
					assignmentVOO.setTime(rs.getString(5));
					assignmentVOO.setDayTime(rs.getString(6));
					assignmentVOO.setNumber(number);
					
					al.add(assignmentVOO);
					
					Blob b = rs.getBlob(3);
					fos = new FileOutputStream(
							"C:/java/j2ee workspace/Quiz_Generator/WebContent/assignment/assignment" + ++i + ".pdf");
					int len = (int) b.length();
					byte[] buf = b.getBytes(1, len);
					fos.write(buf, 0, len);
					System.out.println("successfully writen the file on local drive");
					System.out.println("i:"+i);
					
					//}
					/*return assignmentVOO;*/
					
					fos.close();
			}
					
				
			} catch (SQLException e) {
				System.out.println("error extracting assingment from db"+e.getMessage());
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				System.out.println("problem in fos while saving the pdf in target location");
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("problem in writhing the buffer in fos while writing a pdf");
				e.printStackTrace();
			}
			
			//System.out.println("course is"+al.get(0).getCourse());
			
			return al;
		}
		
/***********************************************quiz verification ******************************************************************/
	
		public static String quizVerificationDAO(int submittedIndex, String submittedCourse){
			
			try {
				PreparedStatement statement = connection().prepareStatement("select correct_answer from"+" "+submittedCourse+" "+"where id=?");
				//statement.setString(1, submittedCourse);
				statement.setInt(1, submittedIndex);
				ResultSet rs = statement.executeQuery();
				
				while(rs.next()){
					System.out.println("correct ans for index"+submittedIndex+" is "+rs.getString("correct_answer"));
					return rs.getString("correct_answer");
				}
			} catch (SQLException e) {
				System.out.println("error in fetching correct answer from DB"+e.getMessage());
				e.printStackTrace();
			}
			
			return null;
		}
		
/*************************************************video upload in DB****************************************************************************************/
		
		public static void videoUploadFacultyDAO(VideoUploadFacultyVO videoUploadFacultyVOO){
			System.err.println(videoUploadFacultyVOO.getCourse());
			try {
				PreparedStatement statement = connection().prepareStatement("insert into video values(default,?,?,?,?)");
				statement.setString(1, videoUploadFacultyVOO.getCourse());
				statement.setString(2, videoUploadFacultyVOO.getTitle());
				statement.setString(3, videoUploadFacultyVOO.getLink());
				statement.setString(4, videoUploadFacultyVOO.getDescriptor());
				statement.execute();
			} catch (SQLException e) {
				System.err.println("error inserting video into DB"+e.getMessage());
			}
		}
/****************************************************retrive video from DB*******************************************************************************************/
		
		public static ArrayList<VideoUploadFacultyVO> getVideoDAO(String course){
			System.err.println("inside getVideoDAO");
			ArrayList<VideoUploadFacultyVO> videoAL = new ArrayList<>();
			try {
				PreparedStatement statement = connection().prepareStatement("select title, link, description from video where course = ?");
				statement.setString(1, course);
				
				ResultSet rs = statement.executeQuery();
				
				while(rs.next()){
					VideoUploadFacultyVO videoUploadFacultyVOO = new VideoUploadFacultyVO();
					videoUploadFacultyVOO.setTitle(rs.getString(1));
					videoUploadFacultyVOO.setLink(rs.getString(2));
					videoUploadFacultyVOO.setDescriptor(rs.getString(3));
					//videoAL = new ArrayList<>();
					videoAL.add(videoUploadFacultyVOO);
				}
			} catch (SQLException e) {
				System.out.println("error fetching videos from db"+e.getMessage());
			} 
			
			return videoAL;
		}
/********************************************set marks*************************************************************************************/
		public static void setMarksDAO(SetMarksVO setMarksVOO){
			System.err.println("inside setMarksDAO");
			try {
				PreparedStatement statement = connection().prepareStatement("insert into marks values(default,?,?,?)");
				statement.setString(1, setMarksVOO.getUserId());
				statement.setString(2, setMarksVOO.getCourse());
				statement.setInt(3, setMarksVOO.getMarks());
				statement.execute();
			} catch (SQLException e) {
				System.out.println("error while inserting the values in marks"+e.getMessage());
			}
		}
		
		/********************************************get marks*************************************************************************************/
		
		public static ArrayList<GetMarksVO> getMarksDAO(String course, String userName){
			
			ArrayList<GetMarksVO> al = new ArrayList<>();
			try {
				PreparedStatement statement = connection().prepareStatement("select * from marks where course=? AND userid=?");
				statement.setString(1, course);
				statement.setString(2, userName);
				ResultSet rs = statement.executeQuery();
				
				while(rs.next()){
					GetMarksVO getMarksVOO = new GetMarksVO();
					getMarksVOO.setCourse(rs.getString("course"));
					getMarksVOO.setMarks(rs.getString("marks"));
					
					al.add(getMarksVOO);
				}
			} catch (SQLException e) {
				System.out.println("problem in fetching marks from DB"+e.getMessage());
			}
			
			return al;
		}
}
