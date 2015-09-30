package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class edit_0020profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
 if(session.getAttribute("user_id") == null) { 
      out.write("\n");
      out.write("<script>\n");
      out.write("    window.location=\"http://localhost:8024/index.jsp\";\n");
      out.write("</script>\n");
      out.write("\n");
 } 
      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
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
      out.write("\n");
      out.write("    <!-- Custom Fonts -->\n");
      out.write("    <link href=\"font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
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
      out.write("\n");
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
      out.write("                        <a href=\"profile.html\">Home</a>\n");
      out.write("                    </li>\n");
      out.write("                    <!--<li>\n");
      out.write("                        <a href=\"login.html\">Login</a>\n");
      out.write("                    </li> -->\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"support.html\">Offline Support</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.navbar-collapse -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /.container -->\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <!-- Header -->\n");
      out.write("    <a name=\"about\"></a>\n");
      out.write("    <div class=\"intro-header\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          \n");
      out.write("             <!--   <div class=\"col-lg-12\">\n");
      out.write("                    <!--<div class=\"intro-message\">\n");
      out.write("                        <h1>Speak Up!<h1>\n");
      out.write("\t\t\t\t\t\t<h3>Express yourself through words..</h3>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t <hr class=\"intro-divider\">\n");
      out.write("                        <ul class=\"list-inline intro-social-buttons\">\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"https://twitter.com/SBootstrap\" class=\"btn btn-default btn-lg\"><i class=\"fa fa-twitter fa-fw\"></i> <span class=\"network-name\">Twitter</span></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"https://github.com/IronSummitMedia/startbootstrap\" class=\"btn btn-default btn-lg\"><i class=\"fa fa-github fa-fw\"></i> <span class=\"network-name\">Github</span></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <a href=\"#\" class=\"btn btn-default btn-lg\"><i class=\"fa fa-linkedin fa-fw\"></i> <span class=\"network-name\">Linkedin</span></a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>-->\n");
      out.write("\t\t\t\n");
      out.write("    <h1>Edit Profile</h1>\n");
      out.write("  \t<hr>\n");
      out.write("\t<div class=\"row\">\n");
      out.write("      <!-- left column -->\n");
      out.write("      <div class=\"col-md-3\">\n");
      out.write("        <div class=\"text-center\">\n");
      out.write("          <img src=\"\" class=\"avatar img-circle\" alt=\"avatar\">\n");
      out.write("          <h6>Upload a different photo...</h6>\n");
      out.write("          \n");
      out.write("          <input type=\"file\" class=\"form-control\">\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("      <!-- edit form column -->\n");
      out.write("      <div class=\"col-md-9 personal-info\">\n");
      out.write("        <div class=\"alert alert-info alert-dismissable\">\n");
      out.write("          <a class=\"panel-close close\" data-dismiss=\"alert\">Ã</a> \n");
      out.write("          <i class=\"fa fa-coffee\"></i>\n");
      out.write("          This is an <strong>.alert</strong>. Use this to show important messages to the user.\n");
      out.write("        </div>\n");
      out.write("        <h3>Personal info</h3>\n");
      out.write("        \n");
      out.write("        <form class=\"form-horizontal\" role=\"form\">\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <label class=\"col-lg-3 control-label\">First name:</label>\n");
      out.write("            <div class=\"col-lg-8\">\n");
      out.write("              <input class=\"form-control\" type=\"text\" value=\"");
      out.print( session.getAttribute("fname") );
      out.write("\">\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <label class=\"col-lg-3 control-label\">Last name:</label>\n");
      out.write("            <div class=\"col-lg-8\">\n");
      out.write("              <input class=\"form-control\" type=\"text\" value=\"");
      out.print( session.getAttribute("lname") );
      out.write("\">\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <label class=\"col-lg-3 control-label\">Email:</label>\n");
      out.write("            <div class=\"col-lg-8\">\n");
      out.write("              <input class=\"form-control\" type=\"text\" value=\"");
      out.print( session.getAttribute("email") );
      out.write("\">\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <!--<div class=\"form-group\">\n");
      out.write("            <label class=\"col-lg-3 control-label\">Time Zone:</label>\n");
      out.write("            <div class=\"col-lg-8\">\n");
      out.write("              <div class=\"ui-select\">\n");
      out.write("                <select id=\"user_time_zone\" class=\"form-control\">\n");
      out.write("                  <option value=\"Hawaii\">(GMT-10:00) Hawaii</option>\n");
      out.write("                  <option value=\"Alaska\">(GMT-09:00) Alaska</option>\n");
      out.write("                  <option value=\"Pacific Time (US &amp; Canada)\">(GMT-08:00) Pacific Time (US &amp; Canada)</option>\n");
      out.write("                  <option value=\"Arizona\">(GMT-07:00) Arizona</option>\n");
      out.write("                  <option value=\"Mountain Time (US &amp; Canada)\">(GMT-07:00) Mountain Time (US &amp; Canada)</option>\n");
      out.write("                  <option value=\"Central Time (US &amp; Canada)\" selected=\"selected\">(GMT-06:00) Central Time (US &amp; Canada)</option>\n");
      out.write("                  <option value=\"Eastern Time (US &amp; Canada)\">(GMT-05:00) Eastern Time (US &amp; Canada)</option>\n");
      out.write("                  <option value=\"Indiana (East)\">(GMT-05:00) Indiana (East)</option>\n");
      out.write("                </select>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div> -->\n");
      out.write("          \n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <label class=\"col-md-3 control-label\">New Password:</label>\n");
      out.write("            <div class=\"col-md-8\">\n");
      out.write("                <input class=\"form-control\" type=\"password\" placeholder=\"change if necessary\" value=\"\">\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <label class=\"col-md-3 control-label\">Confirm password:</label>\n");
      out.write("            <div class=\"col-md-8\">\n");
      out.write("              <input class=\"form-control\" type=\"password\" value=\"\">\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <label class=\"col-md-3 control-label\"></label>\n");
      out.write("            <div class=\"col-md-8\">\n");
      out.write("              <input type=\"submit\" class=\"btn btn-primary\" value=\"Save Changes\">\n");
      out.write("              <span></span>\n");
      out.write("              <input type=\"reset\" class=\"btn btn-default\" value=\"Cancel\">\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("<hr>\n");
      out.write("            \n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- /.container -->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- /.intro-header -->\n");
      out.write("\n");
      out.write("    <!-- Page Content --\n");
      out.write("\n");
      out.write("\t<a  name=\"services\"></a>\n");
      out.write("    <div class=\"content-section-a\">\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-5 col-sm-6\">\n");
      out.write("                    <hr class=\"section-heading-spacer\">\n");
      out.write("                    <div class=\"clearfix\"></div>\n");
      out.write("                    <h2 class=\"section-heading\">Death to the Stock Photo:<br>Special Thanks</h2>\n");
      out.write("                    <p class=\"lead\">A special thanks to <a target=\"_blank\" href=\"http://join.deathtothestockphoto.com/\">Death to the Stock Photo</a> for providing the photographs that you see in this template. Visit their website to become a member.</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-5 col-lg-offset-2 col-sm-6\">\n");
      out.write("                    <img class=\"img-responsive\" src=\"img/ipad.png\" alt=\"\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- /.container \n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- /.content-section-a \n");
      out.write("\n");
      out.write("    <div class=\"content-section-b\">\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-5 col-lg-offset-1 col-sm-push-6  col-sm-6\">\n");
      out.write("                    <hr class=\"section-heading-spacer\">\n");
      out.write("                    <div class=\"clearfix\"></div>\n");
      out.write("                    <h2 class=\"section-heading\">3D Device Mockups<br>by PSDCovers</h2>\n");
      out.write("                    <p class=\"lead\">Turn your 2D designs into high quality, 3D product shots in seconds using free Photoshop actions by <a target=\"_blank\" href=\"http://www.psdcovers.com/\">PSDCovers</a>! Visit their website to download some of their awesome, free photoshop actions!</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-5 col-sm-pull-6  col-sm-6\">\n");
      out.write("                    <img class=\"img-responsive\" src=\"img/dog.png\" alt=\"\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- /.container \n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- /.content-section-b -\n");
      out.write("\n");
      out.write("    <div class=\"content-section-a\">\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-5 col-sm-6\">\n");
      out.write("                    <hr class=\"section-heading-spacer\">\n");
      out.write("                    <div class=\"clearfix\"></div>\n");
      out.write("                    <h2 class=\"section-heading\">Google Web Fonts and<br>Font Awesome Icons</h2>\n");
      out.write("                    <p class=\"lead\">This template features the 'Lato' font, part of the <a target=\"_blank\" href=\"http://www.google.com/fonts\">Google Web Font library</a>, as well as <a target=\"_blank\" href=\"http://fontawesome.io\">icons from Font Awesome</a>.</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-5 col-lg-offset-2 col-sm-6\">\n");
      out.write("                    <img class=\"img-responsive\" src=\"img/phones.png\" alt=\"\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- /.container \n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- /.content-section-a \n");
      out.write("\n");
      out.write("\t<a  name=\"contact\"></a>\n");
      out.write("    <div class=\"banner\">\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-6\">\n");
      out.write("                    <h2>Register to Comment,Suggest & upvote your favorites!</h2>\n");
      out.write("                </div>u\n");
      out.write("                <div class=\"col-lg-6\">\n");
      out.write("                    <ul class=\"list-inline banner-social-buttons\">\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"https://twitter.com/SBootstrap\" class=\"btn btn-default btn-lg\"><i class=\"fa fa-twitter fa-fw\"></i> <span class=\"network-name\">Twitter</span></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"https://github.com/IronSummitMedia/startbootstrap\" class=\"btn btn-default btn-lg\"><i class=\"fa fa-github fa-fw\"></i> <span class=\"network-name\">Github</span></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\" class=\"btn btn-default btn-lg\"><i class=\"fa fa-linkedin fa-fw\"></i> <span class=\"network-name\">Linkedin</span></a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- /.container \n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- /.banner \n");
      out.write("\n");
      out.write("    <!-- Footer -->\n");
      out.write("    <footer>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <ul class=\"list-inline\">\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"profile.html\">Home</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"footer-menu-divider\">&sdot;</li>\n");
      out.write("                       <!-- <li>\n");
      out.write("                            <a href=\"login.html\">Login</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"footer-menu-divider\">&sdot;</li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"register.html\">Register</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"footer-menu-divider\">&sdot;</li>-->\n");
      out.write("                        <li> \n");
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