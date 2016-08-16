<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Login</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>

<body background="/images/bg2" width="1020">   <div id="center">
<header>
    
    <a href="index.jsp">    <img src="/images/icon.gif" height="150" width="150" align="middle"/></a>
 <font style="" size="18"color="white">VIRTUAL CLASSROOM CENTER</font>
 <img src="/images/virtual-classroom.png" height="150" width="150" align="right"/>

</header>   </div>
    <form>
	<div class="dropdown">
            <button class="dropbtn">About Us</button>
            <div class="dropdown-content">
               <a href="#">About Us</a>
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
                <a href="#">Sports</a>
                <a href="#">Quiz</a>
                <a href="#">Club Activity</a>
            </div>
        </div>
        <div class="dropdown">
            <button class="dropbtn">Contact Us</button>
            <div class="dropdown-content">
               <a href="#">Address</a>
               <a href="#">Email</a>
            </div>
        </div>
        <div class="dropdown">
		<button class="dropbtn">Login</button>
		    <div class="dropdown-content">
                        <a href="AdminLogin.jsp">Admin</a>
		</div>
                </div>
        <div class="dropdown">
            <button class="dropbtn">New User</button>
            <div class="dropdown-content">
                <a href="#">Registration</a>    
            </div>
        </div>
</form>
    
    <form action="POST"> 
        <div id="left">
            <table border="1">
<h1>Student Login</h1>
<tr> 
    <td>User Name:</td>
    <td> <input type="text" name="userName_txt"></td>
</tr>
<tr>
    <td>Password:</td>
    <td><input type="text" name="password_txt"></td>
</tr>
<tr>
    <td></td>
    <td><input type="Submit" name="student_submit" value="Submit" onclick="form.action='LoginServlet';"></td>           
</tr>
            </table>
        </div>
        <footer>
        <center>    © 2016 Virtual Classroom Center. All Rights Reserved, Designed by ... </center>
    </footer>     
    </form> 
</body>
</html>