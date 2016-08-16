<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Select Course</title>
<link rel="icon" type="image/png" href="/Quiz_Generator/images/icon.gif" />
<link rel="stylesheet" type="text/css" href="style.css">
</head>

<body background="/Quiz_Generator/images/bg2" width="1020">
	<div id="center">
		<header> <a href="/Quiz_Generator/jsp/index.jsp"> <img
			src="/Quiz_Generator/images/icon.gif" height="150" width="150"
			align="middle" /></a> <font style="" size="18" color="white">VIRTUAL
			CLASSROOM</font> <img
			src="/Quiz_Generator/images/virtual-classroom.png" height="150"
			width="150" align="right" /> </header>
	</div>
	<form>
		<div class="dropdown">
            <button class="dropbtn">Home</button>
            <div class="dropdown-content">
               <a href="/Quiz_Generator/jsp/StudentPortal.jsp">Home</a>
            </div>
          </div>
            
            <div class="dropdown">
            <button class="dropbtn">About Us</button>
            <div class="dropdown-content">
               <a href="/Quiz_Generator/jsp/aboutus.jsp">About Us</a>
            </div>
        </div> 
		<div class="dropdown">
			<button class="dropbtn">Career</button>
			<div class="dropdown-content">
				<a href="/Quiz_Generator/jsp/enotes.jsp">eBook</a> 
			</div>
		</div>
		<div class="dropdown">
			<button class="dropbtn">Admission</button>
			<!-- <div class="dropdown-content">
				<a href="#">Overview</a> <a href="#">Apply online</a> <a href="#">Demo
					Class</a> <a href="#">Tuition and Fees</a> <a href="#">Scholarships</a>
			</div> -->
		</div>
		<div class="dropdown">
			<button class="dropbtn">Activity</button>
			<div class="dropdown-content">
				<a href="/Quiz_Generator/jsp/enotes.jsp">eNotes</a>
                <a href="/Quiz_Generator/jsp/TakeQuiz.jsp">Quiz</a>
                <a href="/Quiz_Generator/jsp/SelectMarks.jsp">Quiz Marks</a>
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
                <a href="/Quiz_Generator/StudentLogoutServlet">User Logout</a>    
            </div>
        </div>
	</form>
	<%
	System.out.println("hello aniket");
	if(session.isNew()){
	System.out.println("welcome new user");
	}else{
	System.out.println("you are old user!"+session.getId());
	}%>
	<h1>Select Course</h1>
	<form action="/Quiz_Generator/SelectVideoServlet" method="post">
		<table border="0">
                <tr style="height: 100%%">
                	<td style="width: 50%%">
                		<table>
                			<tr style="height: 20%">
                				<td style="width: 50%">java</td> <td style="width: 50%"><input type="radio" name="course_select" value="java"></td>
                			</tr>
                			
                			<tr style="height: 20%">
                				<td style="width: 50%">php</td> <td style="width: 50%"><input type="radio" name="course_select" value="php"></td>
                			</tr>
                			
                			<tr style="height: 20%">
                				<td style="width: 50%">C++</td> <td style="width: 50%"><input type="radio" name="course_select" value="c++"></td>
                			</tr>
                			
                			<tr style="height: 20%">
                				<td style="width: 50%">html</td> <td style="width: 50%"><input type="radio" name="course_select" value="html"></td>
                			</tr>
                			
                			<tr style="height: 20%">
                				<td style="width: 50%">dbms</td> <td style="width: 50%"><input type="radio" name="course_select" value="dbms"></td>
                			</tr>
                		</table>
                		<input type="Submit" name="createQuest_submit" value="Submit">
                	</td>
                </tr>
            </table>

	</form>
</body>
</html>