package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Regusersresult_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"Ramya\">\n");
      out.write("\n");
      out.write("        <title>Speak Up! </title>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap Core CSS -->\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Custom CSS -->\n");
      out.write("        <link href=\"css/landing-page.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/searchcss.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- Custom Fonts -->\n");
      out.write("        <link href=\"font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <link href=\"css/regres.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <link href=\"http://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <!-- Navigation -->\n");
      out.write("        <nav class=\"navbar navbar-default navbar-fixed-top topnav\" role=\"navigation\">\n");
      out.write("            <div class=\"container topnav\">\n");
      out.write("                <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <a class=\"navbar-brand topnav\" href=\"#\">Speak Up!</a>\n");
      out.write("                </div>\n");
      out.write("                <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"index.html\">Logout</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"offline.html\">Offline Support</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <!-- /.navbar-collapse -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /.container -->\n");
      out.write("        </nav>\n");
      out.write("        <a name=\"about\"></a>\n");
      out.write("        <div class=\"intro-header\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <div class=\"intro-message\"> \n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div id=\"custom-search-input\" align=\"top\">\n");
      out.write("\n");
      out.write("                                <div class=\"input-group col-md-5\" align=\"center\" >\n");
      out.write("\n");
      out.write("                                    <input type=\"text\" class=\"  search-query form-control\" placeholder=\"Search\" />\n");
      out.write("                                    <span class=\"input-group-btn\">\n");
      out.write("                                        <button class=\"btn btn-danger\" type=\"button\">\n");
      out.write("                                            <span class=\" glyphicon glyphicon-search\" >\n");
      out.write("                                            </span>\n");
      out.write("                                        </button>\n");
      out.write("                                    </span>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div id=\"label-custom\" align=\"left\">\n");
      out.write("                                <input type=\"label\" class=\"labelcls\" style=\"width:470px\" value=\" ");
      out.print( request.getAttribute("result"));
      out.write(" \"/>\n");
      out.write("                            </div>\n");
      out.write("                            <div id=\"button-custom-res\" align=\"right\">\n");
      out.write("                                <input type=\"submit\" value=\"Next\">\n");
      out.write("                            </div>\n");
      out.write("                            <div style=\"float:left; width:50%;\">\n");
      out.write("                                <h3 align=\"left\">Comments</h3>\n");
      out.write("                                <div style=\"width:365px;height:150px;line-height:3em;overflow:scroll;padding:5px;\">\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <h3 align=\"left\">Your Comments</h3>\n");
      out.write("                                \n");
      out.write("                                    <input type=\"text\" align=\"center\" class=\"  txt form-control\" placeholder=\"Your comments goes here\" />\n");
      out.write("                                    <div id=\"button-custom-res\" align=\"right\">\n");
      out.write("                                        <input type=\"submit\" value=\"Post\" onclick=\" ");
 request.getRequestDispatcher("Comment").forward(request, response); 
      out.write(" \" >\n");
      out.write("                                       \n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div style=\"float:right; width:50%;\">\n");
      out.write("\n");
      out.write("                                <h3 align=\"left\">Suggestions</h3>\n");
      out.write("                                <div style=\"width:365px;height:150px;line-height:3em;overflow:scroll;padding:5px;\">\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <h3 align=\"left\">Your Suggestions</h3>\n");
      out.write("\n");
      out.write("                                <input type=\"text\" align=\"center\" class=\"  txt form-control\" placeholder=\"Your suggestions goes here\" />\n");
      out.write("\n");
      out.write("                                <div id=\"button-custom-res\" align=\"right\">\n");
      out.write("                                    <input type=\"submit\" value=\"Post\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <footer>\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-12\">\n");
      out.write("                            <ul class=\"list-inline\">\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"index.html\">Home</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"footer-menu-divider\">&sdot;</li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"login.html\">Login</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"footer-menu-divider\">&sdot;</li>\n");
      out.write("\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"support.html\">Offline Support</a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                            <p class=\"copyright text-muted small\">Copyright &copy; Speak Up Design Team 2015. All Rights Reserved</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </footer>\n");
      out.write("\n");
      out.write("            <!-- jQuery -->\n");
      out.write("            <script src=\"js/jquery.js\"></script>\n");
      out.write("\n");
      out.write("            <!-- Bootstrap Core JavaScript -->\n");
      out.write("            <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
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
