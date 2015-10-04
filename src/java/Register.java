/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author sai
 */
public class Register extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String user_id = request.getParameter("user-id");
            String fname = request.getParameter("form-first-name");
            String lname = request.getParameter("form-last-name");
            String dob = request.getParameter("dob");
            String mail = request.getParameter("form-email");
            String password = request.getParameter("form-email-password");
            String re_password = request.getParameter("form-email-re-password");
            String gender = request.getParameter("gender");
            Guest g = new Guest(user_id, password, fname, lname, gender, dob, mail);
            // out.println(u.fname + u.lname + u.gender + u.email + u.password + u.dob);
            if (password.equals(re_password)) {
                g.insert();
                HttpSession session=request.getSession();
                session.setAttribute("user_id", user_id);
                session.setAttribute("fname", g.fname);
                session.setAttribute("lname", g.lname);
                session.setAttribute("email", g.email);
                session.setAttribute("searches",0);
                session.setAttribute("comments",0);
                session.setAttribute("suggestions",0);
                response.sendRedirect("http://localhost:8024/profile.jsp");

            } else {
                out.println("fail");
            }

        } catch (Exception e) {
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
