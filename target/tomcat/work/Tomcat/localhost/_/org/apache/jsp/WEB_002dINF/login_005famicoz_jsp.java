/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-04-23 05:24:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_005famicoz_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t<title>Amicoz</title>\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("\t<link href=\"libs/bootstrap-3.3-2.4-dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\t<link href='https://fonts.googleapis.com/css?family=PT+Sans' rel='stylesheet' type='text/css'>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("  <div id=\"header\">\r\n");
      out.write("    <div id=\"logo\" class=\"loginreg\">Amicoz</div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <div id=\"formbox\">\r\n");
      out.write("  <div id=\"userInput\">\r\n");
      out.write("\t<form action=\"/login_amicoz\" method=\"POST\">\r\n");
      out.write("\t<div id=\"userInput1\">\r\n");
      out.write("\t<input type=\"text\" name=\"username\" placeholder=\"Username (your email id)\"><br>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"userInput2\">\r\n");
      out.write("\t<input type=\"password\" name=\"password\" placeholder=\"Password\"><br>\r\n");
      out.write("\t<label id=\"message\"><font color=\"red\" >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${errorMessage}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</font></label><hr>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"userInput3\">\r\n");
      out.write("\t<input type=\"submit\" value=\"Login\" ><br>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<p>\r\n");
      out.write("\t<a href=\"/forgot_username_1\" style=\"\">Forgot your username?</a>\r\n");
      out.write("\t<a href=\"/forgot_password_1\"  style=\"\">Forgot your password?</a>\r\n");
      out.write("\t</p>\r\n");
      out.write("\t<div id=\"join\" style=\"margin-top: 20px;\">\r\n");
      out.write("\tDo not have an account? \r\n");
      out.write("\t<a href=\"/register\">Join now</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("  </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
