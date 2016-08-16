<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>eBooks</title>
<link rel="icon" type="image/png" href="/Quiz_Generator/images/icon.gif" />
<link rel="stylesheet" type="text/css" href="/Quiz_Generator/jsp/style.css">
</head>

<body background="/Quiz_Generator/images/bg2" width="1020">   <div id="center">
<header>
    
    <a href="/Quiz_Generator/jsp/index.jsp">    <img src="/Quiz_Generator/images/icon.gif" height="150" width="150" align="middle"/></a>
 <font style="" size="18"color="white">VIRTUAL CLASSROOM</font>
 <img src="/Quiz_Generator/images/virtual-classroom.png" height="150" width="150" align="right"/>

</header>   </div>
    <form>
	<div class="dropdown">
            <button class="dropbtn">About Us</button>
            <div class="dropdown-content">
               <a href="/Quiz_Generator/jsp/aboutus.jsp">About Us</a>
            </div>
        </div>
        <div class="dropdown">
                <button class="dropbtn" >Career</button>
                <!-- <div class="dropdown-content">
                    <a href="#">Video</a>
                    <a href="#">eBook</a>
                    <a href="#">Documents</a>
                    <a href="#">Practical</a>
                </div> -->
	</div>
         <div class="dropdown">
            <button class="dropbtn">Admission</button>
            <!-- <div class="dropdown-content">
                <a href="#">Overview</a>
                <a href="#">Apply online</a>
                <a href="#">Demo Class</a>
                <a href="#">Tuition and Fees</a>
                <a href="#">Scholarships</a>  
            </div> -->
        </div>
        <div class="dropdown">
            <button class="dropbtn" >Activity</button>
            <!-- <div class="dropdown-content">
                <a href="#">Sports</a>
                <a href="#">Quiz</a>
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
                <a href="/Quiz_Generator/FacultyLogoutServlet">User Logout</a>    
            </div>
        </div>
        
</form>

<h1>EBook Library</h1>
<span style="color:red;">${errorMsg}</span>    
<form action="/Quiz_Generator/StudentLoginServlet" method="POST"> 
        <div id="left">
        <ul>
		<li><a href="https://www.mkyong.com/featured/top-5-free-java-ebooks/">JAVA EBook</a></li>
		<li><a href="http://onlinevideolecture.com/ebooks/?subject=PHP">PHP EBook</a></li>
		<li><a href="http://onlinevideolecture.com/ebooks/?subject=HTML">HTML EBook</a></li>
		<li><a href="http://onlinevideolecture.com/ebooks/?subject=C-Plus-Plus-Programming">C++ EBook</a></li>
		<li><a href="http://onlinevideolecture.com/ebooks/?subject=Database">DATABASE EBook</a></li>
		</ul>
        </div>
        <footer>
        <center>    © 2016 Virtual Classroom Center. All Rights Reserved, Designed by ... </center>
    </footer>     
    </form> 
</body>
</html>