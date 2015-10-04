<%-- 
    Document   : sendMail
    Created on : Sep 30, 2015, 11:10:18 PM
    Author     : sai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<jsp:useBean id="mail" scope="session" class="Mail" />
<jsp:setProperty name="mail" property="to" value="saimageshvar@gmail.com" />
<jsp:setProperty name="mail" property="from" value="summa.accnt@gmail.com" />
<jsp:setProperty name="mail" property="smtpServ" value="smtp.gmail.com" />
<jsp:setProperty name="mail" property="subject" value="mail" />
<jsp:setProperty name="mail" property="message" value="hello" />

<%
String to = mail.getTo();
int result;
result = mail.sendMail();
if(result == 0){
    out.println(" Mail Successfully Sent to "+to);
}
else{
    out.println(" Mail NOT Sent to "+to);
}  
%>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
