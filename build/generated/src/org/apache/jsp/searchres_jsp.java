package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class searchres_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("<style>\n");
      out.write("label{\n");
      out.write("height:250px;\n");
      out.write("width:700px;}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"Ramya\">\n");
      out.write("\n");
      out.write("    <title>Speak Up! </title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap Core CSS -->\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom CSS -->\n");
      out.write("    <link href=\"css/landing-page.css\" rel=\"stylesheet\">\n");
      out.write("\t   <link href=\"css/searchcss.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- Custom Fonts -->\n");
      out.write("    <link href=\"font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\t<link href=\"css/searchres.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\t\n");
      out.write("    <link href=\"http://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <!-- Navigation -->\n");
      out.write("    <nav class=\"navbar navbar-default navbar-fixed-top topnav\" role=\"navigation\">\n");
      out.write("        <div class=\"container topnav\">\n");
      out.write("            <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("                <a class=\"navbar-brand topnav\" href=\"#\">Speak Up!</a>\n");
      out.write("            </div>\n");
      out.write("            <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"register.jsp\">Register</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"login.jsp\">Login</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"offline.html\">Offline Support</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.navbar-collapse -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /.container -->\n");
      out.write("    </nav>\n");
      out.write("\t<a name=\"about\"></a>\n");
      out.write("    <div class=\"intro-header\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-13\">\n");
      out.write("                    <div class=\"intro-message\"> \n");
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t\t\t<div id=\"custom-search-input\" align=\"top-leftwards\">\n");
      out.write("\t\t   \n");
      out.write("                            <div class=\"input-group col-md-5\" align=\"center\">\n");
      out.write("                                <input type=\"text\" align=\"left\" class=\"  search-query form-control\" placeholder=\"Search\" />\n");
      out.write("                                <span class=\"input-group-btn\">\n");
      out.write("                                    <button class=\"btn btn-danger\" type=\"button\">\n");
      out.write("                                        <span class=\" glyphicon glyphicon-search\"><a href=\"searchres.html\"></a></span>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                                    </button>\n");
      out.write("                                </span>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("                            </div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                        <br/>\n");
      out.write("\t\t   \n");
      out.write("                     <div id=\"label-custom\">\n");
      out.write("\t\t\t\t\t\t<input type=\"label\" style=\"width:470px\" class=\"labelcls\" value=\" ");
      out.print( request.getAttribute("result") );
      out.write(" \" />\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("                        <br/>\n");
      out.write("\t\t\t\t\t\t<div id=\"button-custom\">\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"Next\" color=\"black\">\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("                        </div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div> \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\t\n");
      out.write("        </div>\n");
      out.write("        <!-- /.container -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("\t <footer>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <ul class=\"list-inline\">\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"index.html\">Home</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"footer-menu-divider\">&sdot;</li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"login.html\">Login</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"footer-menu-divider\">&sdot;</li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"register.html\">Register</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"footer-menu-divider\">&sdot;</li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"support.html\">Offline Support</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                    <p class=\"copyright text-muted small\">Copyright &copy; Speak Up Design Team 2015. All Rights Reserved</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("    <!-- jQuery -->\n");
      out.write("    <script src=\"js/jquery.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap Core JavaScript -->\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
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
