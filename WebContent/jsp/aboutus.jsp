<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>About Us</title>
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
            <button class="dropbtn"><a href="#">About Us</a></button>
            <div class="dropdown-content">
            
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
        <!-- <div class="dropdown">
		<button class="dropbtn">Login</button>
		    <div class="dropdown-content">
                        <a href="/Quiz_Generator/jsp/AdminLogin.jsp">Admin</a>
		</div>
                </div> -->
        
</form>
<font style="color: blue;">
<h1 >About Us</h1></font>
<span style="color:red;">${errorMsg}</span>    
<form action="/Quiz_Generator/StudentLoginServlet" method="POST"> 
        <div id="center">
        <b>
       <p>A web application which provides a virtual classroom scenario. A student can register him/her self and enroll in the program. The student can access weekly lecture videos, has to solve weekly assignments and
       <p> upload them to the portal and can take online quiz. Similarly, a faculty member can upload assignments, lecture videos and quiz.</p>
       <p> This application is purely based on the classic Model-View-Controller (MVC) design paradigm.
			 Designed and developed the front end using HTML, JavaScript, JSP. Designed the pages using CSS and did front end validations using JavaScript.</p>
       <p> Developed and implemented the application using Eclipse.</p>
       <p> Worked on CSS, HTML, JSP and GUI.</p>
       <p> Create documentation.</p>
       <p> Used JDBC, MySQL for database connectivity and storage.</p>
       </b>
        </div>
        <footer>
        <center>    © 2016 Virtual Classroom Center. All Rights Reserved, Designed by ... </center>
    </footer>     
    </form> 
    
    <!-- Twitter Bird start ewtnet.com -->
<script src='http://yourjavascript.com/1523826141/Flying twitter bird.js' type='text/javascript'></script>
<script type='text/javascript'>
var twitterAccount = "anikettherockma";
var tweetThisText = " <data:blog.pageTitle/>: <data:blog.url/> ";
tripleflapInit();
</script>
<span style='font-size:11px;position:absolute;'/><!--<a href='http://www.ewtnet.com/2014/01/add-twitter-flying-bird-to-your.html' target='_blank' rel="nofollow" >Twitter Bird Gadget</a>-->
<!-- Twitter Bird end ewtnet.com--></span>

</body>
</html>