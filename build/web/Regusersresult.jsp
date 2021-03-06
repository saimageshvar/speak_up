<%@page import="javax.naming.spi.DirStateFactory.Result"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <style>
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
        <link href="css/regres.css" rel="stylesheet" type="text/css">


        <link href="http://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic" rel="stylesheet" type="text/css">

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
                            <a href="profile.jsp"> <%= session.getAttribute("user_id") %> </a>
                        </li>
                        <li>
                            <a href="logout.jsp">Logout</a>
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
                    <div class="col-lg-12">
                        <div class="intro-message"> 


                            <div id="custom-search-input" align="top-leftwards">

                                <input type="label" style="height:40px;align:left;width:700px" class="search-query form-control" value=" <%= session.getAttribute("result")%> " />
                                <span class="input-group-btn">
                                    <button class="btn btn-danger" type="button" onclick="location.reload();">
                                        <span class=" glyphicon glyphicon-refresh"></span>
                                    </button>
                                </span>
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

                                sql = "select comment , user_id from comments where emotion='" + session.getAttribute("emotion") + "' and sen_id =" + session.getAttribute("sen_id");
                                ResultSet rs = stmt.executeQuery(sql);

                            %>

                            <div style="float:left; width:50%;">
                                <h3 align="left">Comments</h3>

                                <div id="custom-search-input" align="left" style="width:465px;height:250px;line-height:3em;overflow:auto;padding:5px;">
                                    <%     while (rs.next()) {%>
                                    <%= rs.getString("user_id")%> 
                                    <input type="label" class="search-query form-control" readonly value="<%= rs.getString("comment")%>" /> <br/>

                                    <% } %>
                                </div>

                                <h3 align="left">Your Comments</h3>
                                <form action="Comment" method="post">
                                    
                                    <input type="text" align="center" class="  txt form-control" name="comment" style="width:400px" placeholder="Your comments goes here" />
                                    <button class="btn btn-danger" type="submit">
                                        <span class=" glyphicon glyphicon-ok"></span>
                                    </button>
                                    
                                </form>

                            </div>

                       
                        <div  style="float:right; width:50%;">

                            <h3 align="left">Suggestions</h3>
                            <div id="custom-search-input" style="width:465px;height:250px;line-height:3em;padding:5px;overflow:auto">
                                <%
                                    sql = "select sid, suggestions , user_id from suggestions where emotion='" + session.getAttribute("emotion") + "'";
                                    rs = stmt.executeQuery(sql);
                                      
                                    while (rs.next()) {
                                        Statement st = conn.createStatement();
                                        sql = "select sid from upvote where user_id='" + session.getAttribute("user_id") + "' and sid=" + rs.getInt("sid");
                                        ResultSet rs1 = st.executeQuery(sql);
                                        //out.println(rs.getString("user_id") + " : " + rs.getString("suggestions")); %>
                                        <div id="custom-search-input" align="left" >
                                       <%= rs.getString("user_id")%> 
                                    <input type="label" class="search-query form-control" style="width:365px" readonly value="<%= rs.getString("suggestions")%>" /> <br/>

                                    
                                </div>
                                      <%  if (rs1.next()) {
                                            out.print("<span class=\"input-group-btn\"><button class=\"btn btn-danger\" id=\"" + rs.getString("sid") + "\" type=\"button\" value=\"" + rs.getInt("sid") + "\" onclick=\"decr("+ rs.getString("sid") +");\"> <span class=\" glyphicon glyphicon-heart\"> </span></button></span><br/>");
                                        } else {
                                            out.print("<span class=\"input-group-btn\"> <button class=\"btn btn-danger\" id=\"" + rs.getString("sid") + "\" type=\"button\" value=\"" + rs.getInt("sid") + "\" onclick=\"incr("+ rs.getString("sid") +");\"> <span class=\" glyphicon glyphicon-heart-empty\"> </span></button></span><br/>");
                                        }
                                    }%>


                               
                                <p id="demo"></p>
                                <script>
                                    function decr(v)
                                    {
                                        //var x = document.getElementById("dec").value;
                                        window.location = "http://localhost:8024/DownVote?sid=" + v;


                                    }
                                    function incr(v)
                                    {
                                        //var x = document.getElementById("inc").value;
                                        window.location = "http://localhost:8024/UpVote?sid=" + v;

                                    }
                                </script>

                            </div>

                            <h3 align="left">Your Suggestions</h3>
                            <form method="post" action="Suggest" >
                                <input type="text" align="center" class="  txt form-control" name="sugg" placeholder="Your suggestions goes here" />



                                <button class="btn btn-danger" type="submit">
                                        <span class=" glyphicon glyphicon-hand-up"></span>
                                    </button>
                            </form>
                        </div>

                        </div>
                    </div>

                </div>
            </div>
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

