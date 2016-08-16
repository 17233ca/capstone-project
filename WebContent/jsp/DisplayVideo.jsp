<%@page import="java.util.ArrayList"%>
<%@page import="com.as.business.VideoUploadFacultyVO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Video</title>
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
<body>
	<%
	ArrayList<VideoUploadFacultyVO> videoArrayList = new ArrayList<>();
	videoArrayList = (ArrayList)session.getAttribute("video"); 
	
	for(int i=0; i<videoArrayList.size();i++){
	VideoUploadFacultyVO videoUploadFacultyVOO = videoArrayList.get(i);
	%>
	<form action="" method="">
		<div id="center">
			<table border="1" align="center">
				
				</br>
				<tr>
					<td align="center"><h1><label style="color: blue; font-family: cursive;">Title</label></h1></td>
					<td align="center"><h1><label style="color: blue; font-family: cursive;" >Video</label></h1></td>
					<td align="center"><h1><label style="color: blue; font-family: cursive;">Description</label></h1></td>
				</tr>
				<tr>
					<td><h2><%= videoUploadFacultyVOO.getTitle()%>   </h2> </td>
					<td><iframe height="200px" width="320px"  src="<%=videoUploadFacultyVOO.getLink()%>" frameborder="1" allowfullscreen></iframe></td>
					<td><h3><%=videoUploadFacultyVOO.getDescriptor() %>   </h3></td>
				</tr>
				<%}%>
			</table>
		</div>
		
		
		<footer>
		<center>© 2016 Virtual Classroom Center. All Rights Reserved,
			Designed by ...</center>
		</footer>
	</form>

</body>
</html>