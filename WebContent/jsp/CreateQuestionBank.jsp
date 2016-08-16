<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Question bank</title>
<link rel="stylesheet" type="text/css" href="/Quiz_Generator/jsp/style.css">

<!-- <script type="text/javascript">
	function validateForm(){
		var QuestionField = document.getElementsByName("question_txt")[0].value;
		var OptionA = document.getElementsByName("optionA_txt")[0].value;
		var OptionB = document.getElementsByName("optionB_txt")[0].value;
		var OptionC = document.getElementsByName("optionC_txt")[0].value;
		var OptionD = document.getElementsByName("optionD_txt")[0].value;
		var CorrectAnswerField = document.getElementsByName("correctAns_txt")[0].value;
		
		
		if (QuestionField == null || QuestionField == "") {
        alert("QuestionField must be filled out");
        return false;
	}else if(OptionA == null || OptionA == ""){
		alert("OptionA must be filled out");
        return false;
	}else if(OptionB == null || OptionB == ""){
		alert("OptionB must be filled out");
        return false;
	}else if(OptionC == null || OptionC == ""){
		alert("OptionC must be filled out");
        return false;
	}else if(OptionD == null || OptionD == ""){
		alert("OptionD must be filled out");
        return false;
	}else if(CorrectAnswerField == null || CorrectAnswerField == ""){
		alert("CorrectAnswerField must be filled out");
        return false;
	}
</script> -->

</head>
<body background="/Quiz_Generator/images/bg2" width="1020">
	<div id="center">
		<header> <a href="/Quiz_Generator/jsp/index.jsp"> <img src="/Quiz_Generator/images/icon.gif"
			height="150" width="150" align="middle" /></a> <font style="" size="18"
			color="white">VIRTUAL CLASSROOM</font> <img
			src="/Quiz_Generator/images/virtual-classroom.png" height="150" width="150"
			align="right" /> </header>
	</div>
	<form>
		<div class="dropdown">
			<button class="dropbtn">Home</button>
			<div class="dropdown-content">
				<a href="/Quiz_Generator/jsp/ProfessorPortal.jsp">Home</a>
			</div>
		</div>
		<div class="dropdown">
			<button class="dropbtn">Career</button>
			<!-- <div class="dropdown-content">
				<a href="#">Video</a> <a href="#">eBook</a> <a href="#">Documents</a>
				<a href="#">Practical</a>
			</div> -->
		</div>
		<div class="dropdown">
			<button class="dropbtn">Admission</button>
			<!-- <div class="dropdown-content">
				<a href="#">Overview</a> <a href="#">Apply online</a> <a href="#">Demo
					Class</a> <a href="#">Tuition and Fees</a> <a href="#">Scholarships</a>
			</div> -->
		</div>
		<div class="dropdown">
            <button class="dropbtn" >Activity</button>
            <div class="dropdown-content">
            	<a href="/Quiz_Generator/jsp/enotes.jsp">eNotes</a>
                <a href="/Quiz_Generator/jsp/SearchStudent.jsp">Marks of the student</a>
            </div>
        </div>
		<div class="dropdown">
			<button class="dropbtn">Contact Us</button>
			<div class="dropdown-content">
				<a href="/Quiz_Generator/jsp/contact.jsp">Address</a>
			</div>
		</div>
		<div class="dropdown">
            <button class="dropbtn">Logout</button>
            <div class="dropdown-content">
                <a href="/Quiz_Generator/FacultyLogoutServlet">User Logout</a>    
            </div>
        </div>
		
	</form>
	<br/>
	<br/>
	${label}
        <form method="post" action="/Quiz_Generator/CreateQuestionBankServlet" name="questionBankFrom" onsubmit="return validateForm()">
            <table border="1">
                <tr>
                    <td style="width: 50%">
                        <table>
                            <tr style="height: 100">
                                <td style="width: 100%">
                                    <select name="course_select">
                                        <option value="java">java</option>
                                        <option value="php">php</option>
                                        <option value="c">c</option>
                                        <option value="html">html</option>
                                        <option value="dbms">dbms</option>
                                    </select></td>
                            </tr>

                        </table>
                    </td>
                </tr>

                <tr>

                    <td style="width: 50%">
                        <table>
                            <tr style="height: 100%">
                                <td style="width: 50%">Question:</td>
                                <td style="width: 50%" align="left"><input type="text" name="question_txt" size="50" required></td>

                            </tr>
                        </table>
                    </td>

                </tr>

                <tr>
                    <td style="width: 50%">
                        <table>
                            <tr style="height: 50%">
                            	<td style="width: 100%">
                            	<table>
                                	<tr style="height: 40%">
                                		<td style="width: 50%">a.<input type="text" name="optionA_txt" required></td>	
                                		<td style="width: 50%">b.<input type="text" name="optionB_txt" required></td>
                                	</tr>
                                	
                                	<tr style="height: 40%">
                                		<td style="width: 50%">c.<input type="text" name="optionC_txt" required></td>	
                                		<td style="width: 50%">d.<input type="text" name="optionD_txt" required></td>
                                	</tr>
                                	
                                	<tr style="height: 20%">
                                		<td style="width: 100%" align="center" colspan="2">correct answer.<input type="text" name="correctAns_txt" required></td>
                                	</tr>
                                </table>
                            	</td>
                            </tr>
                        </table>
                    </td>
                </tr>

                <tr>
                    <td style="width: 100%" align="center">
                    <input type="Submit" name="createQuest_submit"></td>
                </tr>
            </table>




        </form>
	<footer>
	<center>© 2016 Virtual Classroom Center. All Rights Reserved,
		Designed by ...</center>
	</footer>
</body>
</html>