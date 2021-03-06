/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author sai
 */
public class SuggestFromProfile extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            HttpSession session = request.getSession();
            String JDBC_DRIVER = "com.mysql.jdbc.Driver";
            String DB_URL = "jdbc:mysql://localhost:3306/speak_up";
            String un = "root";
            String pwd = "password";
            Connection conn = null;
            Statement stmt = null;
            try {
                Class.forName(JDBC_DRIVER);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Suggest.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conn = DriverManager.getConnection(DB_URL, un, pwd);
            } catch (SQLException ex) {
                Logger.getLogger(Suggest.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                stmt = conn.createStatement();
            } catch (SQLException ex) {
                Logger.getLogger(Suggest.class.getName()).log(Level.SEVERE, null, ex);
            }
            //out.println(request.getParameter("suggest"));
            String sql = "insert into suggestions (suggestions,user_id,emotion) values ('" + request.getParameter("suggest") + "','" + session.getAttribute("user_id") + "','" + request.getParameter("emotion") + "')";
            try {
                stmt.executeUpdate(sql);
                sql = "update usermaster set suggestions = suggestions + 1 where user_id='" + session.getAttribute("user_id") + "'";
                stmt.executeUpdate(sql);
                session.setAttribute("suggestions", (Integer) session.getAttribute("suggestions") + 1);
            } catch (SQLException ex) {
                Logger.getLogger(Suggest.class.getName()).log(Level.SEVERE, null, ex);
            }
            response.sendRedirect("http://localhost:8024/profile.jsp");
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
