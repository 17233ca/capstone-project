<%@page import="java.util.Map"%>
<%@page import="com.as.business.QuestionsVO"%>
<%@page import="java.util.HashMap"%>
<%@ page import="com.as.business.LoginVO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Take Quiz</title>
<link rel="icon" type="image/png" href="/Quiz_Generator/images/icon.gif" />
<!-- <link rel="stylesheet" type="text/css" href="/Quiz_Generator/jsp/style.css"> -->
<link rel="stylesheet" type="text/css" href="/Quiz_Generator/jsp/IndexStyle.css">

<frame>
<script language="javascript">
var Timer;
var TotalSeconds;

function CreateTimer(TimerID, Time) 
{
    Timer = document.getElementById(TimerID);
    TotalSeconds = Time;
    UpdateTimer()
    window.setTimeout("Tick()", 1000);
}

function Tick() 
{
    TotalSeconds -= 1;
    if(TotalSeconds ==-1)
      {
    alert("Time Up");
    // Show alert Plus redirect any other page
    window.location.reload();
    

      }
   else
     {
    UpdateTimer()
    window.setTimeout("Tick()", 1000);
     }
}

function UpdateTimer() {
    Timer.innerHTML = TotalSeconds;
}
</script>
</frame>
</head>

<body background="/Quiz_Generator/images/bg2" width="1020">
	
	<%LoginVO loginVO = new LoginVO();
	loginVO = (LoginVO)session.getAttribute("credentials");
	%>
	<%=loginVO.getUserName()%>
	
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
			<button class="dropbtn">About Us</button>
			<div class="dropdown-content">
				<a href="#">About Us</a>
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
				<a href="#">Sports</a> <a href="/Quiz_Generator/">Quiz</a> <a
					href="#">Club Activity</a>
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
	
	<!-- test session -->
	<%
	System.out.println("hello aniket");
	if(session.isNew()){
	System.out.println("welcome new user");
	}else{
	System.out.println("you are old user!"+session.getId());
	}%>

	<!-- count hit counts -->
	<%
    Integer hitsCount = 
      (Integer)request.getSession().getAttribute("hitCounter");
    if( hitsCount ==null || hitsCount == 0 ){
       /* First visit */
       out.println("Time counter:");
       hitsCount = 1;
    }else{
       /* return visit */
       out.println("Welcome back to my website!");
       hitsCount += 1;
     } 
     if( hitsCount == 11){
    	session.invalidate();
    	
    }
    session.setAttribute("hitCounter", hitsCount);
    
%>
	<!-- retrive questions and options -->
	<%
		HashMap<Integer, QuestionsVO> hm = new HashMap<>();
		hm = (HashMap<Integer, QuestionsVO>) session.getAttribute("question");
		for (Map.Entry<Integer, QuestionsVO> entry : hm.entrySet()) {

			QuestionsVO questionsVO = entry.getValue();
	%>
	<br/>
	<br/>
	
	<div id='timer' />
	<script type="text/javascript">/* window.onload =  */CreateTimer("timer", 60);</script>
	</div>
	
	<form action="/Quiz_Generator/QuizVerificationServlet" method="post">
		<table border="0">
		<tr style="height: 20%">
			<td style="width: 100%"><input type="hidden" name="hitscount" value="<%=hitsCount%>"><h1><%=hitsCount%></h1></td>
		</tr>
			<tr style="height: 40%">
				<td style="width: 50%"><%=questionsVO.getQuestion()%></td>
				<td style="width: 50%"><input type="hidden" name="submittedIndex" value="<%=entry.getKey()%>"></td>
				<td style="width: 50%"><input type="hidden" name="submittedCourse" value="<%=questionsVO.getCourse()%>"></td>
			</tr>
			<tr style="height: 40%">
				<td style="width: 100%">
					<table border="1">
						<tr style="height: 40%">
							<td style="width: 50%"><input type="radio" name="ansRadio"
								value="<%=questionsVO.getOptionA()%>"> <%=questionsVO.getOptionA()%></td>
							<td style="width: 50%"><input type="radio" name="ansRadio"
								value="<%=questionsVO.getOptionB()%>"> <%=questionsVO.getOptionB()%></td>
						</tr>

						<tr style="height: 40%">
							<td style="width: 50%"><input type="radio" name="ansRadio"
								value="<%=questionsVO.getOptionC()%>"> <%=questionsVO.getOptionC()%></td>
							<td style="width: 50%"><input type="radio" name="ansRadio"
								value="<%=questionsVO.getOptionD()%>"> <%=questionsVO.getOptionD()%></td>
						</tr>
						<tr style="height: 20%">
							<td style="width: 100%" colspan="2" align="center"><input type="submit" value="submit"></td>
						</tr>
						<%
							}
						%>
					</table>
				</td>
			</tr>

		</table>

	</form>

</body>
</html>