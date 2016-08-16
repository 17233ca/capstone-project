package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<title>VCC</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"nivo-slider.css\" type=\"text/css\" media=\"screen\" />\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body background=\"/images/bg2\" width=\"1020\">  \r\n");
      out.write("    \r\n");
      out.write("    <div id=\"center\">\r\n");
      out.write("<header>\r\n");
      out.write("    \r\n");
      out.write("    <a href=\"index.jsp\">  <img src=\"/images/icon.gif\" height=\"150\" width=\"150\" align=\"middle\"/></a>\r\n");
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
      out.write("\t\t\t<a href=\"StudentLogin.jsp\">Student</a> \r\n");
      out.write("                        <a href=\"AdminLogin.jsp\">Admin</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("                </div>\r\n");
      out.write("        <div class=\"dropdown\">\r\n");
      out.write("            <button class=\"dropbtn\">New User</button>\r\n");
      out.write("            <div class=\"dropdown-content\">\r\n");
      out.write("                <a href=\"#\">Registration</a>    \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <div id=\"right\" class=\"column\">\r\n");
      out.write("            <h2><font color=\"green\"> News Updates</font></h2>\r\n");
      out.write("            \r\n");
      out.write("             \r\n");
      out.write("            <p><font color=\"white\">Here you can find news, updates and more...</font> </p>\r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("<div id=\"left\" class=\"column\"> \r\n");
      out.write("  <h2><font color=\"green\">Virtual Classroom Center</font></h2> \r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("  <p><font color=\"white\">Here bachelor's, master's and doctoral degree programs are designed to prepare students for the practice of engineering, computer science, and business administration at a professional level. In addition to courses teaching the fundamentals, each degree curriculum is designed to be connected to Silicon Valley's major industries in electronics, computer engineering, information technology, enterprise management, and global business development.</font></p> \r\n");
      out.write("  <img src=\"/images/home2.jpg\" alt=\"home\" height=\"350\" width=\"100%\"/> \r\n");
      out.write(" </div> \r\n");
      out.write("         <footer>\r\n");
      out.write("        <center>    © 2016 Virtual Classroom Center. All Rights Reserved, Designed by ... </center>\r\n");
      out.write("    </footer>     \r\n");
      out.write("</form>   \r\n");
      out.write("    \r\n");
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
