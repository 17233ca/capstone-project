<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

          <title>Contact Us</title>
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
        <!-- <div class="dropdown">
		<button class="dropbtn">Login</button>
		    <div class="dropdown-content">
                        <a href="AdminLogin.jsp">Admin</a>
		</div>
                </div> -->
        <div class="dropdown">
            <button class="dropbtn">New User</button>
            <div class="dropdown-content">
                <a href="#">Registration</a>    
            </div>
        </div>
</form>
    
    <form action="/Quiz_Generator/ContactUsServlet" method="POST"> 
        <div id="left">
            <table border="1">
<h1 style="color: red;"><font face="cooper black">Contact Us</font></h1>

<tr> 
    <td>First Name:</td>
    <td> <input type="text" name="firstName_txt"></td>
</tr>
<tr>
    <td>Last Name:</td>
    <td><input type="text" name="lastName"></td>
</tr>
<tr>
    <td>Email Id:</td>
    <td><input type="text" name="email"></td>
</tr>
<tr>
    <td>City:</td>
    <td><input type="text" name="city"></td>
</tr>
<tr>
    <td>State:</td>
    <td><input type="text" name="state"></td>
</tr>
<tr>
    <td>Country:</td>
    <td><input type="text" name="country"></td>
</tr>
<tr>
    <td>Zip Code:</td>
    <td><input type="text" name="zip"></td>
</tr>
<tr>
    <td>Comment:</td>
    <td><textarea cols="30" rows="5" name="comment"></textarea></td>
</tr>
<tr>
    <td></td>
    <td><input type="Submit" name="submit" value="Submit">           
    	<input type="reset" name="reset" value="Clear"></td>           
</tr>
            </table>
            
        </div>
        
         <div id="center">
         </br>
         <table border="2">
         	<tr style="height: 50px">
         		<td style="width: 50px">
         		
         			<table>
         			
         				<tr style="height: 20px"> 
         					<td style="width: 100px"><h1 style="color: red;" align="left"><font face="cooper black">Direction</font></h1></td>
         				</tr>
         				<tr style="height: 80px"> 
         					<td style="width: 100px"><div style="width:525px;overflow:hidden;height:300px;max-width:600px;"><div id="google-maps-canvas" style="height:100%; width:100%;max-width:100%;"><iframe style="height:100%;width:100%;border:0;" frameborder="0" src="https://www.google.com/maps/embed/v1/place?q=Northwestern+Polytechnic+University,+Westinghouse+Drive,+Fremont,+CA,+United+States&key=AIzaSyAN0om9mFmy1QN6Wf54tXAowK4eT0ZUPrU"></iframe></div><a class="google-code" href="https://www.hostingreviews.website/compare/hostgator-vs-bluehost" id="enable-map-data">bluehost vs hostgator</a><style>#google-maps-canvas .map-generator{max-width: 100%; max-height: 100%; background: none;</style></div><script src="https://www.hostingreviews.website/google-maps-authorization.js?id=50103be2-8b71-66b2-d0c0-33e81b6e9730&c=google-code&u=1469853644" defer="defer" async="async"></script></td>
         				</tr>
         			
         			</table>
         		
         		</td>
         	</tr>
         
         </table>
         
          
          <header><hr>
          <div id="right">
          </br>
	<a href="https://www.facebook.com/"><img src="/Quiz_Generator/images/fb.png" height="50px" width="50px"></img></a>	
	<a href="https://www.twitter.com/"><img src="/Quiz_Generator/images/twitter.png" height="50px" width="50px"></img></a>	
	<a href="https://plus.google.com/u/4/?hl=en/"><img src="/Quiz_Generator/images/gp.png" height="50px" width="50px"></img></a>	
	<a href="https://www.instagram.com/"><img src="/Quiz_Generator/images/ig.png" height="50px" width="50px"></img></a>	
	</div>
         <h3 style="color: red;">Northwestern Polytechnic University</h3>
   		<dl style="color: white;"> 
   		<dd>47671 Westinghouse Drive,</dd> 
   		<dd>Fremont, CA 94539, USA</dd> 
   		<dd>Tel:  (510)592-9688</dd> 
   		<dd>Fax:  (510)657-8975</dd> 
   		<dd>Email: npuvirtualclassroom@gmail.com</dd> 
	</dl>
	</br>
	</br>
	</header>
        </br>
        
        
       
         </br>
         
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