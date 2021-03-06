<%
    response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate,max-age=0");//HTTP 1.1
    response.setHeader("Pragma", "no-cache"); //HTTP 1.0
    response.setDateHeader("Expires", 0); //prevents caching at the proxy server
%>

<% if (session.getAttribute("user_id") != null) { %>
<script>
    window.location = "http://localhost:8024/profile.jsp";
</script>
<% } %>
<html lang="en">


    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="Ramya">

        <title>Speak Up! </title>

        <!-- Bootstrap Core CSS -->
        <link href="css/bootstrap.min.css" rel="stylesheet">

        <link href="css/loginstyle.css" rel="stylesheet">

        <!-- Custom CSS -->
        <link href="css/landing-page.css" rel="stylesheet">

        <!-- Custom Fonts -->
        <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

        <link href="http://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic" rel="stylesheet" type="text/css">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

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
                    <a class="navbar-brand topnav" href="index.html">Speak Up!</a>
                </div>
                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav navbar-right">
                        <li>
                            <a href="register.html">Register</a>
                        </li>
                        <li>
                            <a href="login.html">Login</a>
                        </li>
                        <li>
                            <a href="offline.html">Offline Support</a>
                        </li>
                    </ul>
                </div>
                <!-- /.navbar-collapse -->
            </div>
            <!-- /.container -->
        </nav>

        <!-- Header -->
        <a name="about"></a>
        <div class="intro-header">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="intro-message">
                            <h1>Speak Up!<h1>
                                    <h3>Express yourself through words..</h3>

                                    <hr class="intro-divider">
                                    <div class = "container">
                                        <div class="wrapper">
                                            <form action="http://localhost:8024/ForgotPassword" method="post" name="Forgot_Password" class="form-signin">       
                                                <h3 class="form-signin-heading">A mail will be sent to the  mail id registered for the below user name</h3>
                                                <hr class="colorgraph"><br>
                                                
                                                <input type="text" class="form-control" name="user_id" placeholder="Username" required="" autofocus="" />
                                                <br/>
                                                <button class="btn btn-lg btn-primary btn-block"  name="Submit" value="send_mail" type="Submit">Send Mail</button>
                                                
                                                
                                            </form>			
                                        </div>
                                    </div>



                                    <ul class="list-inline intro-social-buttons">
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

                                    </div>
                                    <!-- /.container -->

                                    </div>


                                    <footer>
                                        <div class="container">
                                            <div class="row">
                                                <div class="col-lg-12">
                                                    <ul class="list-inline">
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
                                                        <li>
                                                            <a href="support.html">Offline Support</a>
                                                        </li>
                                                    </ul>
                                                    <p class="copyright text-muted small">Copyright &copy; Speak Up Design Team 2015. All Rights Reserved</p>
                                                </div>
                                            </div>
                                        </div>
                                    </footer>

                                    <!-- jQuery -->
                                    <script src="js/jquery.js"></script>

                                    <!-- Bootstrap Core JavaScript -->
                                    <script src="js/bootstrap.min.js"></script>

                                    </body>

                                    </html>