<%@page import="com.as.business.StudentPortalVO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Portal</title>
<link rel="icon" type="image/png" href="/Quiz_Generator/images/icon.gif" />
<link rel="stylesheet" type="text/css" href="/Quiz_Generator/jsp/style.css">
</head>

<body background="/Quiz_Generator/images/bg2" width="1020">  
<div id="center">
<header>
    
    <a href="/Quiz_Generator/jsp/index.jsp">    <img src="/Quiz_Generator/images/icon.gif" height="150" width="150" align="middle"/></a>
 <font style="" size="18"color="white">VIRTUAL CLASSROOM</font>
 <img src="/Quiz_Generator/images/virtual-classroom.png" height="150" width="150" align="right"/>

</header>   </div>
    <form>
	<div class="dropdown">
			<button class="dropbtn">Home</button>
			<div class="dropdown-content">
				<a href="/Quiz_Generator/jsp/ProfessorPortal.jsp">Home</a>
			</div>
		</div>
        <div class="dropdown">
                <button class="dropbtn" >Career</button>
                <div class="dropdown-content">
                    <a href="#">Video</a>
                    <a href="#">eBook</a>
                    <a href="#">Documents</a>
                    <a href="#">Practical</a>
                </div>
	</div>
         <div class="dropdown">
            <button class="dropbtn">Admission</button>
            <div class="dropdown-content">
                <a href="#">Overview</a>
                <a href="#">Apply online</a>
                <a href="#">Demo Class</a>
                <a href="#">Tuition and Fees</a>
                <a href="#">Scholarships</a>  
            </div>
        </div>
        <div class="dropdown">
            <button class="dropbtn" >Activity</button>
            <div class="dropdown-content">
                <a href="/Quiz_Generator/jsp/CreateQuestionBank.jsp">Create Question Bank</a>
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
<form action="/Quiz_Generator/StudentSearchServlet" method="post">
<table border="1" align="center">
	<tr>
		<th>Student Id:</th><th><input type="text" name="studentSearch"></th>
	</tr>
	<tr>
	<td>
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
                </td>
	</tr>
	<tr>
		<td colspan="2" align="center"><input type="submit" value="submit"></td>
	</tr>
</table>
</form>
</body>