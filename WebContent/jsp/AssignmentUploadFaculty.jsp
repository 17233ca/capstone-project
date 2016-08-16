<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Assignment upload</title>
<link rel="icon" type="image/png" href="/Quiz_Generator/images/icon.gif" />
<link rel="stylesheet" type="text/css"
	href="/Quiz_Generator/jsp/style.css">
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.0/themes/base/jquery-ui.css">
<link rel="stylesheet" href="/resources/demos/style.css">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.0/jquery-ui.js"></script>
<script>
	$(function() {
		$("#datepicker").datepicker();
	});
</script>

<script type="text/javascript">
	function alertFilename() {
		var thefile = document.getElementById('thefile');
		/* alert(thefile.value); */
		document.getElementById('output').style.display = "inline-block";
	}
</script>
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
	<div class="clear"></div>
	<!-- <div class="main"> -->
		<form action="/Quiz_Generator/AssignmentUploadFacultyServlet" enctype="multipart/form-data" method="post">
		<br/>
		<br/>
		<br/>
			<table border="1" align="center">
				<tr style="height: 100%">
					<td style="width: 100%">
						<table>
						<tr style="height: 20%">
								<td colspan="3" align="center">
									<select name="assignmentCourse">
										<option>java</option>
										<option>html</option>
										<option>php</option>
										<option>dbms</option>
									</select>
								</td>
							</tr>
							<tr style="height: 20%">
								<td style="width: 50%; text-align: right;" colspan="2"><font color="whitesmoke"><input
										type="file" align="right" name="assignmentFile"
										/></font></td>
								<td style="width: 50%; text-align: left;" colspan="0"><h6>
										<font color="red">* Upload document in pdf, doc only</font>
									</h6></td>

							</tr>
							<tr style="height: 20%">
								<td style="width: 40%">Due Date:
									<p>
										<input type="text" name="datepicker" style="height: 20px; width: 80px"
											id="datepicker">
									</p>
								</td>
								<td style="width: 40%; text-align: right;">Time:
									<p>
										<input type="text" name="time" style="height: 20px; width: 100px">
									</p>
								</td>
								<td style="width: 20%; text-align: left;">
									<p>
										<select name="dayTime" style="height: 50px; width: 50px">
											<option>AM</option>
											<option>PM</option>
										</select>
									</p>
								</td>
							</tr>
							<tr style="height: 20%">
								<td colspan="3" align="center">
									<input type="submit" value="submit">
								</td>
							</tr>
							
						</table>
					</td>
				</tr>
			</table>
		</form>
	<!-- </div> -->
</body>
</html>