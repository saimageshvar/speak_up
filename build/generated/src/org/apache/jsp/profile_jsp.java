package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t    <link href=\"font-awesome/css/font-awesome.css\" rel=\"stylesheet\" media=\"screen\">\n");
      out.write("\t\t\t    <link href=\"font-awesome/css/style2.css\" rel=\"stylesheet\" media=\"screen\">\n");
      out.write("\n");
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
      out.write("                    <!--<li>\n");
      out.write("                        <a href=\"register.html\">Register</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"login.html\">Login</a>\n");
      out.write("                    </li>-->\n");
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
      out.write("    \n");
      out.write("\t\t<div class=\"intro-header\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <div class=\"row\">\n");
      out.write("         <div class=\"row user-menu-container square\">\n");
      out.write("        <div class=\"col-md-7 user-details\">\n");
      out.write("            <div class=\"row coralbg white\">\n");
      out.write("                <div class=\"col-md-6 no-pad\">\n");
      out.write("                    <div class=\"user-pad\">\n");
      out.write("                        <h3>Welcome back, ");
      out.print( session.getAttribute("user_id") );
      out.write(" </h3>\n");
      out.write("                        <h4 class=\"white\"><i class=\"fa fa-check-circle-o\"></i> Delhi, India</h4>\n");
      out.write("                        <h4 class=\"white\"><i class=\"fa fa-twitter\"></i> CoolesOCool</h4>\n");
      out.write("                        <button type=\"button\" class=\"btn btn-labeled btn-info\" href=\"edit profile.html\">\n");
      out.write("                            <span class=\"btn-label\"><i class=\"fa fa-pencil\"></i></span>Edit Profile</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6 no-pad\">\n");
      out.write("                    <div class=\"user-image\">\n");
      out.write("                        <img src=\"https://farm7.staticflickr.com/6163/6195546981_200e87ddaf_b.jpg\" class=\"img-responsive thumbnail\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row overview\">\n");
      out.write("                <div class=\"col-md-4 user-pad text-center\">\n");
      out.write("                    <h3>FOLLOWERS</h3>\n");
      out.write("                    <h4>2,784</h4>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4 user-pad text-center\">\n");
      out.write("                    <h3>FOLLOWING</h3>\n");
      out.write("                    <h4>456</h4>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4 user-pad text-center\">\n");
      out.write("                    <h3>SUGGESTIONS</h3>\n");
      out.write("                    <h4>4,901</h4>\n");
      out.write("                </div>\n");
      out.write("\t\t\t\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-1 user-menu-btns\">\n");
      out.write("            <div class=\"btn-group-vertical square\" id=\"responsive\">\n");
      out.write("                <a href=\"#\" class=\"btn btn-block btn-default active\">\n");
      out.write("                  <i class=\"fa fa-bell-o fa-3x\"></i>\n");
      out.write("                </a>\n");
      out.write("                <a href=\"#\" class=\"btn btn-default\">\n");
      out.write("                  <i class=\"fa fa-envelope-o fa-3x\"></i>\n");
      out.write("                </a>\n");
      out.write("                <a href=\"#\" class=\"btn btn-default\">\n");
      out.write("                  <i class=\"fa fa-laptop fa-3x\"></i>\n");
      out.write("                </a>\n");
      out.write("                <a href=\"#\" class=\"btn btn-default\">\n");
      out.write("                  <i class=\"fa fa-cloud-upload fa-3x\"></i>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-4 user-menu user-pad\">\n");
      out.write("            <div class=\"user-menu-content active\">\n");
      out.write("                <h3>\n");
      out.write("                    Recent Interactions\n");
      out.write("                </h3>\n");
      out.write("                <ul class=\"user-menu-list\">\n");
      out.write("                    <li>\n");
      out.write("                        <h4><i class=\"fa fa-user coral\"></i> Roselynn Smith followed you.</h4>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <h4><i class=\"fa fa-heart-o coral\"></i> Jonathan Hawkins followed you.</h4>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <h4><i class=\"fa fa-paper-plane-o coral\"></i> Gracie Jenkins followed you.</h4>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <button type=\"button\" class=\"btn btn-labeled btn-success\" href=\"#\">\n");
      out.write("                            <span class=\"btn-label\"><i class=\"fa fa-bell-o\"></i></span>View all activity</button>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"user-menu-content\">\n");
      out.write("                <h3>\n");
      out.write("                    Your Inbox\n");
      out.write("                </h3>\n");
      out.write("                <ul class=\"user-menu-list\">\n");
      out.write("                    <li>\n");
      out.write("                        <h4>From Roselyn Smith <small class=\"coral\"><strong>NEW</strong> <i class=\"fa fa-clock-o\"></i> 7:42 A.M.</small></h4>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <h4>From Jonathan Hawkins <small class=\"coral\"><i class=\"fa fa-clock-o\"></i> 10:42 A.M.</small></h4>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <h4>From Georgia Jennings <small class=\"coral\"><i class=\"fa fa-clock-o\"></i> 10:42 A.M.</small></h4>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <button type=\"button\" class=\"btn btn-labeled btn-danger\" href=\"#\">\n");
      out.write("                            <span class=\"btn-label\"><i class=\"fa fa-envelope-o\"></i></span>View All Messages</button>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"user-menu-content\">\n");
      out.write("                <h3>\n");
      out.write("                    Search\n");
      out.write("                </h3>\n");
      out.write("\t\t\t\t\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <!--<div class=\"view\">\n");
      out.write("                            <div class=\"caption\">\n");
      out.write("                                <p>47LabsDesign</p>\n");
      out.write("                                <a href=\"\" rel=\"tooltip\" title=\"Appreciate\"><span class=\"fa fa-heart-o fa-2x\"></span></a>\n");
      out.write("                                <a href=\"\" rel=\"tooltip\" title=\"View\"><span class=\"fa fa-search fa-2x\"></span></a>\n");
      out.write("                            </div>\n");
      out.write("                            <img src=\"http://24.media.tumblr.com/273167b30c7af4437dcf14ed894b0768/tumblr_n5waxesawa1st5lhmo1_1280.jpg\" class=\"img-responsive\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"info\">\n");
      out.write("                            <p class=\"small\" style=\"text-overflow: ellipsis\">An Awesome Title</p>\n");
      out.write("                            <p class=\"small coral text-right\"><i class=\"fa fa-clock-o\"></i> Posted Today | 10:42 A.M.</small>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"stats turqbg\">\n");
      out.write("                            <span class=\"fa fa-heart-o\"> <strong>47</strong></span>\n");
      out.write("                            <span class=\"fa fa-eye pull-right\"> <strong>137</strong></span>\n");
      out.write("                        </div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("                    </div>-->\n");
      out.write("\t\t\t\t\t\t<br />\n");
      out.write("\t\t\t\t\t\t<br />\n");
      out.write("\t\t\t\t\t\t<br />\n");
      out.write("\t\t\t\t\t\t<center>\n");
      out.write("\t\t\t\t\t  <div id=\"custom-search-input\" align=\"center\">\n");
      out.write("\t\t   \n");
      out.write("                            <div class=\"input-group col-lg-20\">\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("                                <input type=\"text\" class=\"  search-query form-control\" placeholder=\"Search\" />\n");
      out.write("                                <span class=\"input-group-btn\">\n");
      out.write("                                    <button class=\"btn btn-danger\" type=\"button\">\n");
      out.write("                                        <span class=\" glyphicon glyphicon-search\"></span>\n");
      out.write("                                    </button>\n");
      out.write("                                </span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\t\t\t\t\t\t</center>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"user-menu-content\">\n");
      out.write("                <h2 class=\"text-center\">\n");
      out.write("                    START SUGGESTING\n");
      out.write("                </h2>\n");
      out.write("                <center><i class=\"fa fa-cloud-upload fa-4x\"></i></center>\n");
      out.write("                <div class=\"share-links\">\n");
      out.write("                    <center><button type=\"button\" class=\"btn btn-lg btn-labeled btn-success\" href=\"#\" style=\"margin-bottom: 15px;\">\n");
      out.write("                            <span class=\"btn-label\"><i class=\"fa fa-bell-o\"></i></span>CHOOSE EMOTION\n");
      out.write("                    </button></center>\n");
      out.write("                    <center>\n");
      out.write("\t\t\t\t\t<!--<button type=\"button\" class=\"btn btn-lg btn-labeled btn-warning\" href=\"#\">\n");
      out.write("                            <span class=\"btn-label\"><i class=\"fa fa-bell-o\"></i></span>A WORK IN PROGRESS\n");
      out.write("                    </button>-->\n");
      out.write("\t\t\t\t\t<label class=\"sr-only\" for=\"form-about-yourself\">Enter here </label>\n");
      out.write("\t\t\t\t\t<textarea name=\"form-about-yourself\" placeholder=\"Suggest...\" \n");
      out.write("\t\t\t                        \t\t\t\tclass=\"form-about-yourself form-control\" id=\"form-about-yourself\"></textarea>\n");
      out.write("\t\t\t\t\t</center>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("       \t<!--<div class=\"col-lg-12 col-sm-6\">\n");
      out.write("\n");
      out.write("            <div class=\"card hovercard\">\n");
      out.write("                <div class=\"cardheader\">\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"avatar\">\n");
      out.write("                    <img alt=\"\" src=\"http://lorempixel.com/100/100/people/9/\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"info\">\n");
      out.write("                    <div class=\"title\">\n");
      out.write("                        <a target=\"_blank\" href=\"http://scripteden.com/\">Script Eden</a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"desc\">Passionate designer</div>\n");
      out.write("                    <div class=\"desc\">Curious developer</div>\n");
      out.write("                    <div class=\"desc\">Tech geek</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"bottom\">\n");
      out.write("                    <a class=\"btn btn-primary btn-twitter btn-sm\" href=\"https://twitter.com/webmaniac\">\n");
      out.write("                        <i class=\"fa fa-twitter\"></i>\n");
      out.write("                    </a>\n");
      out.write("                    <a class=\"btn btn-danger btn-sm\" rel=\"publisher\"\n");
      out.write("                       href=\"https://plus.google.com/+ahmshahnuralam\">\n");
      out.write("                        <i class=\"fa fa-google-plus\"></i>\n");
      out.write("                    </a>\n");
      out.write("                    <a class=\"btn btn-primary btn-sm\" rel=\"publisher\"\n");
      out.write("                       href=\"https://plus.google.com/shahnuralam\">\n");
      out.write("                        <i class=\"fa fa-facebook\"></i>\n");
      out.write("                    </a>\n");
      out.write("                    <a class=\"btn btn-warning btn-sm\" rel=\"publisher\" href=\"https://plus.google.com/shahnuralam\">\n");
      out.write("                        <i class=\"fa fa-behance\"></i>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("-->\n");
      out.write("        </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("    \n");
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
      out.write("                <div class=\"col-lg-8\">\n");
      out.write("                    <!--<ul class=\"list-inline\">\n");
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
      out.write("\t\t\t\t\t\t-->\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"support.html\">Offline Support</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("\t\t\t\t\t\n");
      out.write("                    <p class=\"copyright text-muted small\">Copyright &copy; Speak Up Design Team 2015. All Rights Reserved</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("    <!-- jQuery -->\n");
      out.write("    <script src=\"js/jquery.js\"></script>\n");
      out.write("\t<script src=\"js/test.js\"></script>\n");
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