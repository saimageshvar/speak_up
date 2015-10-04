<%@page import="java.io.File"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>

<%
    response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate,max-age=0");//HTTP 1.1
    response.setHeader("Pragma", "no-cache"); //HTTP 1.0
    response.setDateHeader("Expires", 0); //prevents caching at the proxy server
%>


<html lang="en">
    <% if (session.getAttribute("user_id") == null) { %>
    <script>
        window.location = "http://localhost:8024/index.jsp";
    </script>

    <% }%>

    <head>



        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="Ramya">

        <title>Speak Up! </title>

        <!-- Bootstrap Core CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet">

        <!-- Custom CSS -->
        <link href="css/landing-page.css" rel="stylesheet">
        <link href="css/searchcss.css" rel="stylesheet">
        <!-- Custom Fonts -->
        <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <link href="font-awesome/css/font-awesome.css" rel="stylesheet" media="screen">
        <link href="font-awesome/css/style2.css" rel="stylesheet" media="screen">

        <link href="http://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic" rel="stylesheet" type="text/css">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->





        <!-- auto suggest -->


        <script type="text/javascript" src="js/jquery-1.4.2.js"></script>
        <script type="text/javascript">
        function lookup(inputString) {
            if (inputString.length == 0) {
                $('#suggestions').hide();
                $('#suggestions1').hide();
            } else {
                $.post("list.jsp", {queryString: "" + inputString + ""}, function (data) {
                    if (data.length > 0) {
                        $('#suggestions').show();
                        $('#autoSuggestionsList').html(data);
                        $('#suggestions1').show();
                        $('#autoSuggestionsList1').html(data);
                    }
                });
            }
        }
        function fill(thisValue) {
            $('#search').val(thisValue);
            $('#emotion').val(thisValue);
            setTimeout("$('#suggestions').hide();", 200);
            setTimeout("$('#suggestions1').hide();", 200);
        }


        </script>

        <style>
            .suggestionList li{
                margin: 0px 0px 3px 0px;
                padding: 3px;
                cursor: pointer;
            }

            .suggestionList1 li{
                margin: 0px 0px 3px 0px;
                padding: 3px;
                cursor: pointer;
            }
        </style>


        <!-- end of auto suggest -->








    </head>

    <body>

        <!-- Navigation -->
        <nav class="navbar navbar-default navbar-fixed-top topnav" role="navigation">
            <div class="container topnav">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand topnav" href="#">Speak Up!</a>
                </div>
                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav navbar-right">
                        <!--<li>
                            <a href="register.html">Register</a>
                        </li>
                        <li>
                            <a href="login.html">Login</a>
                        </li>-->
                        <li>
                            <a href="Offline">Offline Support</a>
                        </li>
                        <li>
                            <a href="logout.jsp">Logout</a>
                        </li>
                    </ul>
                </div>
                <!-- /.navbar-collapse -->
            </div>
            <!-- /.container -->
        </nav>

        <!-- Header -->

        <div class="intro-header">
            <div class="container">
                <div class="row">
                    <div class="row user-menu-container square">
                        <div class="col-md-7 user-details">
                            <div class="row coralbg white">
                                <div class="col-md-6 no-pad">
                                    <div class="user-pad">
                                        <h3>Welcome back, <%= session.getAttribute("user_id")%> </h3>
                                        <!--<h4 class="white"><i class="fa fa-check-circle-o"></i> Delhi, India</h4>
                                        <h4 class="white"><i class="fa fa-twitter"></i> CoolesOCool</h4>-->
                                        <br/>
                                        <button  type="button" class="btn btn-labeled btn-info" onclick="location.href = 'edit%20profile.jsp';">
                                            <span class="btn-label"><i class="fa fa-pencil"></i></span>Edit Profile</button>
                                    </div>
                                </div>
                                <div class="col-md-6 no-pad">
                                    <div class="user-image">

                                        <% File file = new File("C:/Users/user/Documents/NetBeansProjects/speak_up/web/pro_pic/" + session.getAttribute("user_id") + ".jpg");
                                           Boolean exists = file.exists();
                                            if (file.exists() && file.isFile()) {
                                        %>

                                        <img src="pro_pic/<%= session.getAttribute("user_id")%>.jpg" class="img-responsive thumbnail">
                                        <!--<img src="https://farm7.staticflickr.com/6163/6195546981_200e87ddaf_b.jpg" class="img-responsive thumbnail">-->
                                        
                                        <% } else { %>
                                        
                                        <img src="pro_pic/default.jpg" class="img-responsive thumbnail">
                                        <% } %>
                                        
                                    </div>
                                </div>
                            </div>
                            <div class="row overview">
                                <div class="col-md-4 user-pad text-center">
                                    <h3 style="color:blue">SEARCHES</h3> 
                                    <h4><%= session.getAttribute("searches")%></h4>
                                </div>
                                <div class="col-md-4 user-pad text-center">
                                    <h3 style="color:blue">COMMENTS</h3>
                                    <h4><%= session.getAttribute("comments")%></h4>
                                </div>
                                <div class="col-md-4 user-pad text-center">
                                    <h3 style="color:blue">SUGGESTIONS</h3>
                                    <h4><%= session.getAttribute("suggestions")%></h4>
                                </div>

                            </div>
                        </div>
                        <div class="col-md-1 user-menu-btns">
                            <div class="btn-group-vertical square" id="responsive">
                                <a href="#" class="btn btn-block btn-default active">
                                    <i class="fa fa-bell-o fa-3x"></i>
                                </a>
                               <!-- <a href="#" class="btn btn-default">
                                    <i class="fa fa-envelope-o fa-3x"></i>
                                </a> -->
                                <a href="#" class="btn btn-default">
                                    <i class="fa fa-laptop fa-3x"></i>
                                </a>
                                <a href="#" class="btn btn-default">
                                    <i class="fa fa-cloud-upload fa-3x"></i>
                                </a>
                            </div>
                        </div>
                                 <%
                                    String JDBC_DRIVER = "com.mysql.jdbc.Driver";
                                    String DB_URL = "jdbc:mysql://localhost:3306/speak_up";
                                    String un = "root";
                                    String pwd = "password";
                                    Connection conn = null;
                                    Statement stmt = null;
                                    Class.forName(JDBC_DRIVER);
                                    conn = DriverManager.getConnection(DB_URL, un, pwd);
                                    stmt = conn.createStatement();
                                    String sql;
                                    //retrieving comments

                                    sql = "select emotion from emotions order by hits desc limit 4";
                                    ResultSet rs = stmt.executeQuery(sql);

                                %>
                        <div class="col-md-4 user-menu user-pad">
                            <div class="user-menu-content active">
                                <h3>
                                    Most Viewed
                                </h3>
                                <ul class="user-menu-list">
                                    <%     while (rs.next()) {%>

                                    <li><h4><a href="Search?search=<%= rs.getString("emotion") %>"><%= rs.getString("emotion") %></a></h4> </li>

                                    <% } %>
                                </ul>
                            </div>
                            <!--<div class="user-menu-content">
                                <h3>
                                    Your Inbox
                                </h3>
                                <ul class="user-menu-list">
                                    <li>
                                        <h4>From Roselyn Smith <small class="coral"><strong>NEW</strong> <i class="fa fa-clock-o"></i> 7:42 A.M.</small></h4>
                                    </li>
                                    <li>
                                        <h4>From Jonathan Hawkins <small class="coral"><i class="fa fa-clock-o"></i> 10:42 A.M.</small></h4>
                                    </li>
                                    <li>
                                        <h4>From Georgia Jennings <small class="coral"><i class="fa fa-clock-o"></i> 10:42 A.M.</small></h4>
                                    </li>
                                    <li>
                                        <button type="button" class="btn btn-labeled btn-danger" href="#">
                                            <span class="btn-label"><i class="fa fa-envelope-o"></i></span>View All Messages</button>
                                    </li>
                                </ul>
                            </div> -->
                            <div class="user-menu-content">
                                <h3>
                                    Search
                                </h3>

                                <div class="row">
                                    <div class="col-md-12">
                                        <!--<div class="view">
                                            <div class="caption">
                                                <p>47LabsDesign</p>
                                                <a href="" rel="tooltip" title="Appreciate"><span class="fa fa-heart-o fa-2x"></span></a>
                                                <a href="" rel="tooltip" title="View"><span class="fa fa-search fa-2x"></span></a>
                                            </div>
                                            <img src="http://24.media.tumblr.com/273167b30c7af4437dcf14ed894b0768/tumblr_n5waxesawa1st5lhmo1_1280.jpg" class="img-responsive">
                                        </div>
                                        <div class="info">
                                            <p class="small" style="text-overflow: ellipsis">An Awesome Title</p>
                                            <p class="small coral text-right"><i class="fa fa-clock-o"></i> Posted Today | 10:42 A.M.</small>
                                        </div>
                                        <div class="stats turqbg">
                                            <span class="fa fa-heart-o"> <strong>47</strong></span>
                                            <span class="fa fa-eye pull-right"> <strong>137</strong></span>
                                        </div>
                                                                
                                    </div>-->
                                        <br />
                                        <br />
                                        <br />
                                        <center>
                                            <div id="custom-search-input" align="center">

                                                <div class="input-group col-lg-20">
                                                    <form action="Search" method="post">    
                                                        <input type="text" class="  search-query form-control" placeholder="Search" name="search" id="search" autocomplete="off" onkeyup="lookup(this.value);" onblur="fill();" />
                                                        <span class="input-group-btn">
                                                            <button class="btn btn-danger" type="submit">
                                                                <span class=" glyphicon glyphicon-search"></span>
                                                            </button>
                                                        </span>
                                                    </form>
                                                </div>


                                            </div>
                                        </center>
                                        <div  id="suggestions" style="display:none; ">
                                            <div class="suggestionList" id="autoSuggestionsList">
                                            </div>
                                        </div>
                                    </div>

                                </div>
                            </div>
                            <div class="user-menu-content">
                                <h2 class="text-center">
                                    START SUGGESTING
                                </h2>
                                <center><i class="fa fa-cloud-upload fa-4x"></i></center>
                                <div class="share-links">
                                    <form action="SuggestFromProfile" method="get">
                                        <center><!--<button type="button" class="btn btn-lg btn-labeled btn-success" href="#" style="margin-bottom: 15px;">
                                                <span class="btn-label"><i class="fa fa-bell-o"></i></span>CHOOSE EMOTION
                                            </button> -->
                                            <div id="custom-search-input" align="center">

                                                <div class="input-group col-md-10" align="center" >

                                                    <input type="text" class="  search-query form-control" placeholder="Choose Emotion.." name="emotion" id="emotion" autocomplete="off" onkeyup="lookup(this.value);" onblur="fill();" />


                                                </div>
                                            </div>
                                            <div  id="suggestions1" style="display:none; ">
                                                <div class="suggestionList1" id="autoSuggestionsList1">
                                                </div>
                                            </div>

                                        </center>
                                        <br />
                                        <br />
                                        <center>
                                            <!--<button type="button" class="btn btn-lg btn-labeled btn-warning" href="#">
                                <span class="btn-label"><i class="fa fa-bell-o"></i></span>A WORK IN PROGRESS
                        </button>-->
                                            <label class="sr-only" for="form-about-yourself">Enter here </label>
                                            <textarea name="suggest" placeholder="Suggest..." 
                                                      class="form-about-yourself form-control" id="form-about-yourself"></textarea>
                                            <span class="input-group-btn">
                                                <button class="btn btn-danger" type="submit">
                                                    <span class=" glyphicon glyphicon-pencil"></span>
                                                </button>
                                            </span>

                                        </center>
                                    </form>
                                </div>
                            </div>
                        </div>
                        <!--<div class="col-lg-12 col-sm-6">
                
                            <div class="card hovercard">
                                <div class="cardheader">
                
                                </div>
                                <div class="avatar">
                                    <img alt="" src="http://lorempixel.com/100/100/people/9/">
                                </div>
                                <div class="info">
                                    <div class="title">
                                        <a target="_blank" href="http://scripteden.com/">Script Eden</a>
                                    </div>
                                    <div class="desc">Passionate designer</div>
                                    <div class="desc">Curious developer</div>
                                    <div class="desc">Tech geek</div>
                                </div>
                                <div class="bottom">
                                    <a class="btn btn-primary btn-twitter btn-sm" href="https://twitter.com/webmaniac">
                                        <i class="fa fa-twitter"></i>
                                    </a>
                                    <a class="btn btn-danger btn-sm" rel="publisher"
                                       href="https://plus.google.com/+ahmshahnuralam">
                                        <i class="fa fa-google-plus"></i>
                                    </a>
                                    <a class="btn btn-primary btn-sm" rel="publisher"
                                       href="https://plus.google.com/shahnuralam">
                                        <i class="fa fa-facebook"></i>
                                    </a>
                                    <a class="btn btn-warning btn-sm" rel="publisher" href="https://plus.google.com/shahnuralam">
                                        <i class="fa fa-behance"></i>
                                    </a>
                                </div>
                            </div>
                        -->
                    </div>
                </div>
            </div>
        </div>



        <!-- /.intro-header -->

        <!-- Page Content --

        <a  name="services"></a>
    <div class="content-section-a">

        <div class="container">
            <div class="row">
                <div class="col-lg-5 col-sm-6">
                    <hr class="section-heading-spacer">
                    <div class="clearfix"></div>
                    <h2 class="section-heading">Death to the Stock Photo:<br>Special Thanks</h2>
                    <p class="lead">A special thanks to <a target="_blank" href="http://join.deathtothestockphoto.com/">Death to the Stock Photo</a> for providing the photographs that you see in this template. Visit their website to become a member.</p>
                </div>
                <div class="col-lg-5 col-lg-offset-2 col-sm-6">
                    <img class="img-responsive" src="img/ipad.png" alt="">
                </div>
            </div>

        </div>
        <!-- /.container 

    </div>
        <!-- /.content-section-a 
    
        <div class="content-section-b">
    
            <div class="container">
    
                <div class="row">
                    <div class="col-lg-5 col-lg-offset-1 col-sm-push-6  col-sm-6">
                        <hr class="section-heading-spacer">
                        <div class="clearfix"></div>
                        <h2 class="section-heading">3D Device Mockups<br>by PSDCovers</h2>
                        <p class="lead">Turn your 2D designs into high quality, 3D product shots in seconds using free Photoshop actions by <a target="_blank" href="http://www.psdcovers.com/">PSDCovers</a>! Visit their website to download some of their awesome, free photoshop actions!</p>
                    </div>
                    <div class="col-lg-5 col-sm-pull-6  col-sm-6">
                        <img class="img-responsive" src="img/dog.png" alt="">
                    </div>
                </div>
    
            </div>
        <!-- /.container 

    </div>
        <!-- /.content-section-b -

    <div class="content-section-a">

        <div class="container">

            <div class="row">
                <div class="col-lg-5 col-sm-6">
                    <hr class="section-heading-spacer">
                    <div class="clearfix"></div>
                    <h2 class="section-heading">Google Web Fonts and<br>Font Awesome Icons</h2>
                    <p class="lead">This template features the 'Lato' font, part of the <a target="_blank" href="http://www.google.com/fonts">Google Web Font library</a>, as well as <a target="_blank" href="http://fontawesome.io">icons from Font Awesome</a>.</p>
                </div>
                <div class="col-lg-5 col-lg-offset-2 col-sm-6">
                    <img class="img-responsive" src="img/phones.png" alt="">
                </div>
            </div>

        </div>
        <!-- /.container 

    </div>
        <!-- /.content-section-a 
    
            <a  name="contact"></a>
        <div class="banner">
    
            <div class="container">
    
                <div class="row">
                    <div class="col-lg-6">
                        <h2>Register to Comment,Suggest & upvote your favorites!</h2>
                    </div>u
                    <div class="col-lg-6">
                        <ul class="list-inline banner-social-buttons">
                            <li>
                                <a href="https://twitter.com/SBootstrap" class="btn btn-default btn-lg"><i class="fa fa-twitter fa-fw"></i> <span class="network-name">Twitter</span></a>
                            </li>
                            <li>
                                <a href="https://github.com/IronSummitMedia/startbootstrap" class="btn btn-default btn-lg"><i class="fa fa-github fa-fw"></i> <span class="network-name">Github</span></a>
                            </li>
                            <li>
                                <a href="#" class="btn btn-default btn-lg"><i class="fa fa-linkedin fa-fw"></i> <span class="network-name">Linkedin</span></a>
                            </li>
                        </ul>
                    </div>
                </div>
    
            </div>
        <!-- /.container 

    </div>
        <!-- /.banner 
    
        <!-- Footer -->
        <footer>
            <div class="container">
                <div class="row">
                    <div class="col-lg-8">
                        <!--<ul class="list-inline">
                            <li>
                                <a href="index.html">Home</a>
                            </li>
                            <li class="footer-menu-divider">&sdot;</li>
                            <li>
                                <a href="login.html">Login</a>
                            </li>
                            <li class="footer-menu-divider">&sdot;</li>
                            <li>
                                <a href="register.html">Register</a>
                            </li>
                            <li class="footer-menu-divider">&sdot;</li>
                        -->
                        <li>
                            <a href="Offline">Offline Support</a>
                        </li>
                        </ul>

                        <p class="copyright text-muted small">Copyright &copy; Speak Up Design Team 2015. All Rights Reserved</p>
                    </div>
                </div>
            </div>
        </footer>

        <!-- jQuery -->
        <script src="js/jquery.js"></script>
        <script src="js/test.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="js/bootstrap.min.js"></script>

    </body>

</html>
