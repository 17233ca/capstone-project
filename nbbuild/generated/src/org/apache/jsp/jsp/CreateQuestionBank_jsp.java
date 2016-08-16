package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CreateQuestionBank_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Create Question bank</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"nivo-slider.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body background=\"/images/bg2\" width=\"1020\">   <div id=\"center\">\r\n");
      out.write("<header>\r\n");
      out.write("    \r\n");
      out.write("    <a href=\"index.jsp\">    <img src=\"/images/icon.gif\" height=\"150\" width=\"150\" align=\"middle\"/></a>\r\n");
      out.write(" <font style=\"\" size=\"18\"color=\"white\">VIRTUAL CLASSROOM CENTER</font>\r\n");
      out.write(" <img src=\"/images/virtual-classroom.png\" height=\"150\" width=\"150\" align=\"right\"/>\r\n");
      out.write("\r\n");
      out.write("</header>   </div>\r\n");
      out.write("    <form>\r\n");
      out.write("\t<div class=\"dropdown\">\r\n");
      out.write("            <button class=\"dropbtn\">About Us</button>\r\n");
      out.write("            <div class=\"dropdown-content\">\r\n");
      out.write("               <a href=\"#\">About Us</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"dropdown\">\r\n");
      out.write("                <button class=\"dropbtn\" >Career</button>\r\n");
      out.write("                <div class=\"dropdown-content\">\r\n");
      out.write("                    <a href=\"#\">Video</a>\r\n");
      out.write("                    <a href=\"#\">eBook</a>\r\n");
      out.write("                    <a href=\"#\">Documents</a>\r\n");
      out.write("                    <a href=\"#\">Practical</a>\r\n");
      out.write("                </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("         <div class=\"dropdown\">\r\n");
      out.write("            <button class=\"dropbtn\">Admission</button>\r\n");
      out.write("            <div class=\"dropdown-content\">\r\n");
      out.write("                <a href=\"#\">Overview</a>\r\n");
      out.write("                <a href=\"#\">Apply online</a>\r\n");
      out.write("                <a href=\"#\">Demo Class</a>\r\n");
      out.write("                <a href=\"#\">Tuition and Fees</a>\r\n");
      out.write("                <a href=\"#\">Scholarships</a>  \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"dropdown\">\r\n");
      out.write("            <button class=\"dropbtn\" >Activity</button>\r\n");
      out.write("            <div class=\"dropdown-content\">\r\n");
      out.write("                <a href=\"#\">Sports</a>\r\n");
      out.write("                <a href=\"#\">Quiz</a>\r\n");
      out.write("                <a href=\"#\">Club Activity</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"dropdown\">\r\n");
      out.write("            <button class=\"dropbtn\">Contact Us</button>\r\n");
      out.write("            <div class=\"dropdown-content\">\r\n");
      out.write("               <a href=\"#\">Address</a>\r\n");
      out.write("               <a href=\"#\">Email</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"dropdown\">\r\n");
      out.write("\t\t<button class=\"dropbtn\">Login</button>\r\n");
      out.write("\t\t    <div class=\"dropdown-content\">\r\n");
      out.write("                        <a href=\"AdminLogin.jsp\">Admin</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("                </div>\r\n");
      out.write("        <div class=\"dropdown\">\r\n");
      out.write("            <button class=\"dropbtn\">New User</button>\r\n");
      out.write("            <div class=\"dropdown-content\">\r\n");
      out.write("                <a href=\"#\">Registration</a>    \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("</form>\r\n");
      out.write("    <form method=\"post\">\r\n");
      out.write("<h1>Create Question Bank</h1>\r\n");
      out.write("        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${label}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("        \r\n");
      out.write("            <table border=\"1\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Select Course</td>\r\n");
      out.write("                    <td>             <select name=\"course_select\">\r\n");
      out.write("                                        <option value=\"java\">java</option>\r\n");
      out.write("                                        <option value=\"php\">php</option>\r\n");
      out.write("                                        <option value=\"c++\">c++</option>\r\n");
      out.write("                                        <option value=\"html\">html</option>\r\n");
      out.write("                                        <option value=\"dbms\">dbms</option>\r\n");
      out.write("                                    </select></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("\r\n");
      out.write("                       \r\n");
      out.write("                    \r\n");
      out.write("                \r\n");
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("\r\n");
      out.write("                    <td> Question:</td>\r\n");
      out.write("                     <td><input type=\"text\" name=\"question_txt\" size=\"50\"></td>\r\n");
      out.write("\r\n");
      out.write("                </tr>\r\n");
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("                <td>a.<input type=\"text\" name=\"optionA_txt\"></td>\t\r\n");
      out.write("                <td>b.<input type=\"text\" name=\"optionB_txt\"></td>\r\n");
      out.write("                </tr>   \t\r\n");
      out.write("                 \t<td>c.<input type=\"text\" name=\"optionC_txt\"></td>\t\r\n");
      out.write("                        <td>d.<input type=\"text\" name=\"optionD_txt\"></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                                \t\r\n");
      out.write("                <tr>\r\n");
      out.write("                    \r\n");
      out.write("                    <td>correct answer.</td>\r\n");
      out.write("                    <td>&nbsp;<input type=\"text\" name=\"correctAns_txt\"></td>\r\n");
      out.write("                    \r\n");
      out.write("                                \t</tr> \r\n");
      out.write("                                        </table>\r\n");
      out.write("                \r\n");
      out.write("                 <input type=\"Submit\" name=\"createQuest_submit\" value=\"Submit\" onclick=\"form.action = 'CreateQuestionBankServlet';\">\r\n");
      out.write("             \r\n");
      out.write("            \r\n");
      out.write("        </form>\r\n");
      out.write(" <footer>\r\n");
      out.write("        <center>    © 2016 Virtual Classroom Center. All Rights Reserved, Designed by ... </center>\r\n");
      out.write("    </footer>     \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
