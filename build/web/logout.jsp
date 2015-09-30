<%-- 
    Document   : logout
    Created on : Sep 26, 2015, 3:06:32 PM
    Author     : sai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <% session.invalidate();%>
    <script>
        window.location = "http://localhost:8024/index.jsp";
    </script>

</html>
