<%@page import="com.as.business.StudentPortalVO"%>
<%@ page import="com.as.business.GetMarksVO"%>
<%@ page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>student registration</title>
<link rel="icon" type="image/png" href="/Quiz_Generator/images/icon.gif" />
<link rel="stylesheet" type="text/css"
	href="/Quiz_Generator/jsp/style.css">
</head>

<body background="/Quiz_Generator/images/bg2" width="1020">
	<div id="center">
		<header> <a href="/Quiz_Generator/jsp/index.jsp"> <img
			src="/Quiz_Generator/images/icon.gif" height="150" width="150"
			align="middle" /></a> <font style="" size="18" color="white">VIRTUAL
			CLASSROOM</font> <img src="/Quiz_Generator/images/virtual-classroom.png"
			height="150" width="150" align="right" /> </header>
	</div>
	<form>
		<div class="dropdown">
			<button class="dropbtn">Home</button>
			<div class="dropdown-content">
				<!-- <a href="/Quiz_Generator/jsp/ProfessorPortal.jsp">Home</a> -->
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
			<button class="dropbtn">Activity</button>
			<!-- <div class="dropdown-content">
				<a href="#">Sports</a> <a href="/Quiz_Generator/jsp/TakeQuiz.jsp">Quiz</a>
				<a href="#">Club Activity</a>
			</div> -->
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
	<br/>
	<br/>
	<table border="1" align="center">
		<tr>
			<th>Course</th>
			<th>Quiz</th>
			<th>Marks</th>
		</tr>
		<%
			ArrayList<GetMarksVO> al = new ArrayList<>();
			al = (ArrayList<GetMarksVO>) session.getAttribute("marks");

			for (int i = 0; i < al.size(); i++) {
		%>
		<tr>
			<th><%=al.get(i).getCourse()%></th>
			<th>quiz<%=i %></th>
			<th><%=al.get(i).getMarks()%></th>
		</tr>
		<%
			}
		%>
	</table>