/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sai
 */
public class ForgotPassword extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String user_id = request.getParameter("user_id");
            SecureRandom random = new SecureRandom();
            String code = new BigInteger(130, random).toString(32);

            String JDBC_DRIVER = "com.mysql.jdbc.Driver";
            String DB_URL = "jdbc:mysql://localhost:3306/speak_up";
            String un = "root";
            String pwd = "password";
            Boolean flag = false;
            Connection conn = null;
            Statement stmt = null;
            try {
                try {
                    Class.forName(JDBC_DRIVER);
                } catch (Exception e) {
                    System.out.println(e);
                }
                conn = DriverManager.getConnection(DB_URL, un, pwd);
                stmt = conn.createStatement();
                String sql = null;
                sql="select * from security_key where user_id='" + user_id + "'";
                ResultSet rs = stmt.executeQuery(sql);
                if(rs.next())
                    sql="update security_key set code ='" + code + "' where user_id ='" + user_id + "'";
                else
                    sql="insert into security_key values('" + user_id + "','" + code + "')";
                stmt.executeUpdate(sql);
                response.sendRedirect("http://localhost:8024/SecuredLogin.jsp");

               
            } catch (SQLException e) {

                //e.printStackTrace();
            } finally {
                //finally block used to close resources
                try {
                    if (stmt != null) {
                        conn.close();

                    }
                } catch (SQLException se) {

                    se.printStackTrace();
                }// do nothing
                try {
                    if (conn != null) {
                        conn.close();

                    }
                } catch (SQLException se) {

                    //se.printStackTrace();
                }//end finally try
            }

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
