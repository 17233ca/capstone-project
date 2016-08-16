<%@page import="java.util.Iterator"%>
<%@page import="com.as.business.AssignmentVO"%>
<%@page import="com.as.business.StudentPortalVO"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.as.business.LoginVO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Portal</title>
<link rel="icon" type="/Quiz_Generator/image/png" href="/Quiz_Generator/images/icon.gif" />
<link rel="stylesheet" type="text/css" href="style.css">
</head>

<body background="/Quiz_Generator/images/bg2" width="1020">   <div id="center">
<header>
    
    <a href="/Quiz_Generator/jsp/index.jsp">    <img src="/Quiz_Generator/images/icon.gif" height="150" width="150" align="middle"/></a>
 <font style="" size="18"color="white">VIRTUAL CLASSROOM CENTER</font>
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
                <div class="dropdown-content">
                    <a href="/Quiz_Generator/jsp/SelectVideo.jsp">Video</a>
                    <a href="/Quiz_Generator/jsp/enotes.jsp">eBook</a>
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
</br>
</br>
<form>
<div id="left">
	<table border="1">
	<% StudentPortalVO studentPortalVO = new StudentPortalVO(); 
								 
	studentPortalVO = (StudentPortalVO)session.getAttribute("studentPortalData"); 
	String url = "/Quiz_Generator/portal_image/"+studentPortalVO.getFirstName()+".jpg";%>
		<tr style="height: 100%">
			<td style="50%">
				<table border="5">
					<tr style="height: 100%">
						<td style="width: 30%"><img border="1" src="<%=url %>" height="160" width="160"/></td>
						<td style="70%">
							<table border="1">
								<tr style="25%">
									<td style="width: 50%">First Name:</td> <td style="width: 50%"><%=studentPortalVO.getFirstName()%></td>
								</tr>
								<tr style="25%">
									<td style="width: 50%">Last Name:</td> <td style="width: 50%"><%=studentPortalVO.getLastName()%></td>
								</tr>
								<tr style="25%">
									<td style="width: 50%">Gender:</td> <td style="width: 50%"><%=studentPortalVO.getGender()%></td>
								</tr>
								<tr style="25%">
									<td style="width: 50%">Address1:</td> <td style="width: 50%"><%=studentPortalVO.getAddress1()%></td>
								</tr>
								<tr style="25%">
									<td style="width: 50%">Address2:</td> <td style="width: 50%"><%=studentPortalVO.getAddress2()%></td>
								</tr>
								<tr style="25%">
									<td style="width: 50%">City:</td> <td style="width: 50%"><%=studentPortalVO.getCity()%></td>
								</tr>
								<tr style="25%">
									<td style="width: 50%">State:</td> <td style="width: 50%"><%=studentPortalVO.getState()%></td>
								</tr>
								<tr style="25%">
									<td style="width: 50%">Phone</td> <td style="width: 50%"><%=studentPortalVO.getPhone()%></td>
								</tr>
								
							</table>
						</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
</div>	
	
	<div id="center">
	<table border="1">
		<tr style="height: 50%">
			<td style="width: 100%">
				<table border="5">
					<tr>
						<th style="30%">Course</th>
						<th style="30%">Assignment</th>
						<th style="20%">Due Date</th>
						<th style="20%" colspan="2">Time</th>
						<!-- <th style="20%">Upload</th> -->
					</tr>
					<%
					int i=0;
					AssignmentVO assignmentVOO = new AssignmentVO();
					ArrayList<AssignmentVO> al = (ArrayList)session.getAttribute("assignment");
					System.out.println("size:"+al.size());
					Iterator it = al.iterator();
					/* for(int j=1;j<=assignmentVOO.getNumber();j++){ */
					while(it.hasNext()){
					assignmentVOO = (AssignmentVO)it.next();
					String assignmentUrl = "/Quiz_Generator/assignment/assignment"+ ++i +".pdf"; 
					%>
					<tr>
					
						<td><%= assignmentVOO.getCourse() %></td>
						<td><a href="<%=assignmentUrl%>" ><font color="red"><%= assignmentVOO.getCourse() + i %></font></a></td>
						<td><%=assignmentVOO.getDueDate() %></td>
						<td><%=assignmentVOO.getTime() %></td>
						<td><%=assignmentVOO.getDayTime() %></td>
						<!-- <td><input type="file" name="studentAssignmentUpload_file"></td> -->		
					</tr>
					<%}%>
				</table>
			</td>
		</tr>
	</table>
	</div>
	</form>
</body>
</html>