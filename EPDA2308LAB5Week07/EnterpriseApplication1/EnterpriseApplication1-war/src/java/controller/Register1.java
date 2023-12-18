/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.MyCustomer;
import model.MyCustomerFacade;

/**
 *
 * @author guan.kiat
 */
@WebServlet(name = "Register1", urlPatterns = {"/Register1"})
public class Register1 extends HttpServlet {

    @EJB
    private MyCustomerFacade myCustomerFacade;

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
            try{
                String a = request.getParameter("x");
                if(myCustomerFacade.searchByName(a) != null){
                    throw new Exception();
                }

//                MyCustomer found = null;
//                List<MyCustomer> allCustomers = myCustomerFacade.findAll();
//                for(MyCustomer x : allCustomers){
//                    if(a.equals(x.getName())){
//                        found = x;
//                        break;
//                    }
//                }
//                if(found != null){
//                    throw new Exception();
//                }
                
                int b = Integer.parseInt(request.getParameter("y"));
                double c = Double.parseDouble(request.getParameter("z"));
                if(c <= 0){
                    throw new Exception();
                }
                myCustomerFacade.create(new MyCustomer(a,b,c));
                request.getRequestDispatcher("login.jsp").include(request, response);
                out.println("<br><br><br>Good afternoon. Registration completed!");
            }catch(Exception e){
                request.getRequestDispatcher("register.jsp").include(request, response);
                out.println("<br><br><br>Good afternoon. Wrong input!");
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
