<%@page import="com.as.business.StudentPortalVO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>student registration</title>
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
            <button class="dropbtn">Home</button>
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
                <a href="/Quiz_Generator/jsp/TakeQuiz.jsp">Quiz</a>
                <a href="#">Club Activity</a>
            </div>
        </div>
        <div class="dropdown">
            <button class="dropbtn">Contact Us</button>
            <div class="dropdown-content">
               <a href="/Quiz_Generator/jsp/contact.jsp">Address</a>
            </div>
        </div>
        <div class="dropdown">
		<button class="dropbtn">Login</button>
		    <div class="dropdown-content">
                        <a href="AdminLogin.jsp">Admin</a>
		</div>
                </div>
        
            
       <div class="dropdown">
            <button class="dropbtn">About Us</button>
            <div class="dropdown-content">
               <a href="#">About Us</a>
            </div>
        </div>     
</form>
<br/>
<br/>
<form action="/Quiz_Generator/RegistrationServlet" method="Post" enctype="multipart/form-data">
<br/>

	<table  width="400px" align="center" border="3">
		<tr style="height: 100%">
			<td style="width: 100%">
				<table>
					<tr style="height: 18%">
						<td style="width: 50%">First Name</td> <td style="width: 50%"><input type="text" name="fName_txt"></td>
					</tr>
					<tr style="height: 18%">
						<td style="width: 50%">Last Name</td> <td style="width: 50%"><input type="text" name="lName_txt"></td>
					</tr>
					<tr style="height: 18%">
						<td style="width: 50%">Gender</td> <td style="width: 50%"><select name="registrationGender">
							<option>male</option>
							<option>female</option>
						</select></td>
					</tr>
					<tr style="height: 18%">
						<td style="width: 50%">Address1</td> <td style="width: 50%"><input type="text" name="registrationAddress1"></td>
					</tr>
					<tr style="height: 18%">
						<td style="width: 50%">Address2</td> <td style="width: 50%"><input type="text" name="registrationAddress2"></td>
					</tr>
					<tr style="height: 18%">
						<td style="width: 50%">City</td> <td style="width: 50%"><input type="text" name="registrationCity"></td>
					</tr>
					<tr style="height: 18%">
						<td style="width: 50%">State</td> <td style="width: 50%"><input type="text" name="registrationState"></td>
					</tr>
					<tr style="height: 18%">
						<td style="width: 50%">Phone</td> <td style="width: 50%"><input type="text" name="phone"></td>
					</tr>
					<tr style="height: 18%">
						<td style="width: 50%">Email</td> <td style="width: 50%"><input type="text" name="email_txt"></td>
					</tr>
					<tr style="height: 18%">
						<td style="width: 50%">Password</td> <td style="width: 50%"><input type="text" name="password_txt"></td>
					</tr>
					<tr style="height: 18%">
						<td style="width: 50%">upload photo</td> <td style="width: 50%"><input type="file" name="file_txt"></td>
					</tr>
					<tr style="height: 10%">
						<td colspan="2" align="center"><input type="submit" value="submit"></td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
</form>
</body>
</html>