/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

/**
 *
 * @author sai
 */
@MultipartConfig
public class Update extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            HttpSession session = request.getSession();
            String new_fname = request.getParameter("fname");
            String new_lname = request.getParameter("lname");
            String new_email = request.getParameter("email");
            String new_password = request.getParameter("pwd");
            String c_new_password = request.getParameter("c_pwd");

            out.println(request.getParameter("photo"));
            //getting photo
            InputStream inputStream = null;
            Part filePart=null;
            try
            {
                filePart = request.getPart("photo");
            }
            catch(Exception e)
            {
                out.println(e);
            }
            out.println("2");
            if (filePart != null) {
                // prints out some information for debugging
                out.println(filePart.getName());
                out.println(filePart.getSize());
                out.println(filePart.getContentType());

                // obtains input stream of the upload file
               
                inputStream = filePart.getInputStream();
                out.write("file");
            }

            if (c_new_password.equals(new_password)) {
                User u = new User();
                out.println("inside if");
                u.update((String)session.getAttribute("user_id") , new_fname , new_lname , new_email , new_password , inputStream);
                out.println("after update");
                session.setAttribute("fname", new_fname);
                session.setAttribute("lname", new_lname);
                session.setAttribute("email", new_email);
                response.sendRedirect("DisplayImage");

            } else {
                response.sendRedirect("http://localhost:8024/edit%20profile.jsp?auth=invalid");
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
