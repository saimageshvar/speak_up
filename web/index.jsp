<!DOCTYPE html>
<% if (session.getAttribute("user_id") != null) { %>
    <script>
        window.location = "http://localhost:8024/profile.jsp";
    </script>
    <% }%>
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

        <!-- Custom CSS -->
        <link href="css/landing-page.css" rel="stylesheet">
        <link href="css/searchcss.css" rel="stylesheet">
        <!-- Custom Fonts -->
        <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

        <link href="http://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic" rel="stylesheet" type="text/css">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->



        <script type="text/javascript" src="js/jquery-1.4.2.js"></script>
        <script type="text/javascript">
        function lookup(inputString) {
            if (inputString.length == 0) {
                $('#suggestions').hide();
            } else {
                $.post("list.jsp", {queryString: "" + inputString + ""}, function (data) {
                    if (data.length > 0) {
                        $('#suggestions').show();
                        $('#autoSuggestionsList').html(data);
                    }
                });
            }
        }
        function fill(thisValue) {
            $('#search').val(thisValue);
            setTimeout("$('#suggestions').hide();", 200);
        }
        </script>

        <style>
            
            .suggestionList li{
                margin: 0px 0px 3px 0px;
                padding: 3px;
                cursor: pointer;
            }
        </style>

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
                        <li>
                            <a href="register.jsp">Register</a>
                        </li>
                        <li>
                            <a href="login.jsp">Login</a>
                        </li>
                        <li>
                            <a href="Offline">Offline Support</a>
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
                                    <h2>Search Box</h2>

                                    <div id="custom-search-input" align="center">

                                        <div class="input-group col-md-5" align="center" >
                                            <form action="Search" method="post" >
                                                <input type="text" class="  search-query form-control" name="search" id="search" placeholder="Search" autocomplete="off" onkeyup="lookup(this.value);" onblur="fill();"/>
                                            <span class="input-group-btn">
                                                <button class="btn btn-danger" type="submit">
                                                    <span class=" glyphicon glyphicon-search"></span>
                                                </button>
                                            </span>

                                            </form>
                                           <div  id="suggestions" style="display: none;">
                                                <div class="suggestionList"  id="autoSuggestionsList">
                                                </div>
                                            </div>


                                        </div>
                                    </div>
                                    <hr class="intro-divider"> 
                                    <ul class="list-inline intro-social-buttons">
                                        <li>
                                            <a href="https://twitter.com/Speak_up" class="btn btn-default btn-lg"><i class="fa fa-twitter fa-fw"></i> <span class="network-name">Twitter</span></a>
                                        </li>
                                        <li>
                                            <a href="https://github.com/saimageshvar/speak_up" class="btn btn-default btn-lg"><i class="fa fa-github fa-fw"></i> <span class="network-name">Github</span></a>
                                        </li>
                                        <li>
                                            <a href="https://linkedin.com/Speak_up" class="btn btn-default btn-lg"><i class="fa fa-linkedin fa-fw"></i> <span class="network-name">Linkedin</span></a>
                                        </li>
                                    </ul>
                                    <</div> 
                                    </div>
                                    </div>

                                    </div>
                                    <!-- /.container -->

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

                                    <!-- Bootstrap Core JavaScript -->
                                    <script src="js/bootstrap.min.js"></script>

                                    </body>

                                    </html>
