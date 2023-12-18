/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.StatefulSB;

/**
 *
 * @author guan.kiat
 */
@WebServlet(name = "StatefulServlet", urlPatterns = {"/StatefulServlet"})
public class StatefulServlet extends HttpServlet {

    StatefulSB statefulSB;

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

        if(request.getSession().getAttribute("sb") == null){
            statefulSB = lookupStatefulSBBean();
            request.getSession().setAttribute("sb", statefulSB);
        } else{
            statefulSB = (StatefulSB)request.getSession().getAttribute("sb");
        }
        
        double input = (Double.parseDouble(request.getParameter("x")));
        statefulSB.add(input);
        request.getRequestDispatcher("newjsp.jsp").include(request, response);
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<br><br><br>This is from stateful bean:<br><br>");
            out.println("Total\t: "+statefulSB.getTotal()+"<br>");
            out.println("Counter\t: "+statefulSB.getCounter()+"<br>");
            out.println("Average\t: "+statefulSB.getAverage()+"<br>");
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

    private StatefulSB lookupStatefulSBBean() {
        try {
            Context c = new InitialContext();
            return (StatefulSB) c.lookup("java:global/Week10Lec10/Week10Lec10-ejb/StatefulSB!model.StatefulSB");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }

}
