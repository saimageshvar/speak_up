<%@ page language="java" import="java.sql.*" %>
<% response.setContentType("text/html");%>
<%
    String str = request.getParameter("queryString");
    String parts[] = null;
    String prev = "";
    Boolean flag = false;
    if (str.contains(",")) {
        parts = str.split(",");

    }
    try {
        String connectionURL = "jdbc:mysql://localhost:3306/speak_up";
        Connection con;
        Class.forName("com.mysql.jdbc.Driver");
// Get a Connection to the database
        con = DriverManager.getConnection(connectionURL, "root", "password");
//Add the data into the database

        if (parts == null) {

            String sql = "SELECT distinct(emotion) FROM main WHERE emotion LIKE '" + str + "%' LIMIT 10";
            Statement stm = con.createStatement();
            stm.executeQuery(sql);
            ResultSet rs = stm.getResultSet();
            while (rs.next()) {
                out.println("<li onclick='fill(\"" + rs.getString("emotion") + "\")'>" + rs.getString("emotion") + "</li >");

            }

        } else {
            // for (String part : parts) {
            String sql = "SELECT distinct(emotion) FROM main WHERE emotion LIKE '"
                    + parts[0] + "%' LIMIT 10";
            Statement stm = con.createStatement();
            stm.executeQuery(sql);
            ResultSet rs = stm.getResultSet();
            while (rs.next()) {
                if (parts.length == 1) {
                    sql = "SELECT distinct(tag)  FROM labels WHERE emotion LIKE '" + parts[0] + "%' LIMIT 10";
                } else {
                    sql = "SELECT distinct(tag)  FROM labels WHERE emotion LIKE '" + parts[0] + "%' and tag LIKE '" + parts[1] + "%' LIMIT 10";
                }
                Statement stm1 = con.createStatement();
                stm1.executeQuery(sql);
                ResultSet rs1 = stm1.getResultSet();
                while (rs1.next()) {
                    out.println("<li onclick='fill(\"" + rs.getString("emotion") + "," + rs1.getString("tag") + "\")'>" + rs.getString("emotion") + "," + rs1.getString("tag") + "</li >");
                }

            }
        }

    } catch (Exception e) {
        out.println("Exception is " + e);
    }
%>