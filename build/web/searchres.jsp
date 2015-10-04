<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <style>
            label{
                height:250px;
                width:700px;}
            input {
                font-family: inherit;
                font-size: inherit;
                line-height: inherit;
                height: 100px;
                width: 69px;
            }
            input[type=submit] {
                -webkit-appearance: button;
                cursor: pointer;
                width: 150px;
                height: 57px;
                border-radius: 5px;
            }
            button.btn.btn-danger
            {
               color:black;background-color:white;border-color:#d43f3a;  
            }
        </style>

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
        <link href="css/searchres.css" rel="stylesheet" type="text/css">

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
                    <a class="navbar-brand topnav" href="profile.jsp">Speak Up!</a>
                </div>
                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-rnav navbar-right">
                        <li>
                            <a href="index.jsp">Home</a>
                        </li>
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
        <a name="about"></a>
        <div class="intro-header">
            <div class="container">
                <div class="row">
                    <div class="col-lg-13">
                        <div class="intro-message"> 


                            <div id="custom-search-input" align="top-leftwards">

                                <!--<div class="input-group col-md-5" align="center">
                                    <input type="text" align="left" class="  search-query form-control" placeholder="Search" />
                                    <span class="input-group-btn">
                                        <button class="btn btn-danger" type="button">
                                            <span class=" glyphicon glyphicon-search"><a href="searchres.html"></a></span>

                                        </button>
                                    </span>

                                </div>-->
                            </div>
                            <br/>
                            <br/>
                            <div id="custom-search-input" align="top-leftwards">
                                <input type="label" style="height:40px;align:left;width:700px" class="search-query form-control" value=" <%= session.getAttribute("result")%> " />
                                <span class="input-group-btn">
                                <button class="btn btn-danger" type="button" onclick="location.reload();">
                                    <span class=" glyphicon glyphicon-refresh"><a href="searchres.html"></a></span>
                                </button>
                            </span>
                            </div>
                            


                            <hr/>
                            <div style="float:left; width:50%;">
                                <h3 align="left">Comments</h3>

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

                                    sql = "select comment , user_id from comments where emotion='" + session.getAttribute("emotion") + "' and sen_id =" + session.getAttribute("sen_id");
                                    ResultSet rs = stmt.executeQuery(sql);

                                %>

                                <div id="custom-search-input" align="left" style="width:465px;height:250px;line-height:3em;overflow:auto;padding:5px;">
                                    <%     while (rs.next()) {%>
                                    <%= rs.getString("user_id") %> 
                                    <input type="label" class="search-query form-control" readonly value="<%= rs.getString("comment")%>" /> <br/>

                                    <% } %>
                                </div>
                            </div>

                            <% sql = "select emotion from emotions order by hits desc limit 4";
                               rs = stmt.executeQuery(sql);
                            %>

                            <div style="float:right; width:50%;">

                                <h3 align="left">Most Viewed Emotions</h3>
                                <div id="custom-search-input" align="left" style="width:565px;height:250px;line-height:3em;overflow:auto;padding:5px;">
                                    <ul type="square">
                                    <%     while (rs.next()) {%>

                                    <li><h4><a href="Search?search=<%= rs.getString("emotion") %>" style="color:white"><%= rs.getString("emotion") %></a></h4> </li>

                                    <% } %>
                                    </ul>
                                </div>

                                <br />
                            </div> 
                        </div>
                    </div>

                </div>
                <!-- /.container -->




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

