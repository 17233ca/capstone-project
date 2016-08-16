<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Videos</title>
<link rel="stylesheet" type="text/css" href="style.css">
<link rel="stylesheet" href="nivo-slider.css" type="text/css"
	media="screen" />
</head>
<body background="/Quiz_Generator/images/bg2" width="1020">
	<div id="center">
		<header> <a href="/Quiz_Generator/jsp/index.jsp"> <img src="/Quiz_Generator/images/icon.gif"
			height="150" width="150" align="middle" /></a> <font style="" size="18"
			color="white">VIRTUAL CLASSROOM CENTER</font> <img
			src="/Quiz_Generator/images/virtual-classroom.png" height="150" width="150"
			align="right" /> </header>
	</div>
	<form>
	<div class="dropdown">
			<button class="dropbtn">Home</button>
			<div class="dropdown-content">
				<a href="/Quiz_Generator/jsp/ProfessorPortal.jsp">home</a>
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
                <a href="/Quiz_Generator/jsp/CreateQuestionBank.jsp">Create Question Bank</a>
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
<body>
	<form action="/Quiz_Generator/VideoUploadFacultyServlet" method="POST">
		<div id="left">
		</br>
		<label style="color: red;font-size: 18px;font-style: italic;">Enter the Video Tutorials</label>
			<table border="4">
				<tr>
					<td><lable>Course:</lable></td>
					<td><select name="selectCourseVideo">
							<!-- <option value="java">SELECT ANY ONE </option> -->
							<option value="java">JAVA</option>
							<option value="php">PHP</option>
							<option value="c++">C++</option>
							<option value="html">HTML</option>
							<option value="db">DATABASE</option>
							<option value="other">OTHER</option>
					
					</select> 
					
				</tr>
				<tr>
					<td><label>Title:</label></td>
					<td><input type="text" name="title" required/></td>
				</tr>
				<tr>
					<td><label>Link:</label></td>
					<td><input type="text" name="link"  required/></td>
				</tr>
				<tr>
					<td><label>Description:</label></td>
					<td><textarea  rows="5" name="desc" required></textarea></td>
				</tr>
				<tr>
				<td></td>
				<td><input type="submit" name="submit" value="Submit"/>
				<input type="reset" name="clear" value="Clear"/></td>
				</tr>
			</table>
		</div>
		
		
		<footer>
		<center>© 2016 Virtual Classroom Center. All Rights Reserved,
			Designed by ...</center>
		</footer>
	</form>

</body>
</html>