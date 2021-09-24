/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.server;

import co.edu.unipiloto.sessionBean.calcBeanLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author edwin
 */
public class CalcServlet extends HttpServlet {

    @EJB
    private calcBeanLocal calcBean;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Resultado</title>");
            out.println("</head>");
            out.println("<body>");

            String accion = request.getParameter("action");
            double x = Double.parseDouble(request.getParameter("n1"));
            double y = Double.parseDouble(request.getParameter("n2"));
            double resultado = 0;
            String operacion = "";
            

            switch (accion) {
                case "+":
                    resultado = calcBean.sumar(x, y);
                    operacion = "SUMA";
                    break;
                case "-":
                    resultado = calcBean.restar(x, y);
                    operacion = "RESTA";
                    break;
                case "*":
                    resultado = calcBean.multiplicar(x, y);
                    operacion = "MULTIPLICACIÓN";
                    break;
                case "/":
                    resultado = calcBean.dividir(x, y);
                    operacion = "DIVISIÓN";
                    break;
                case "%":
                    resultado = calcBean.modulo(x, y);
                    operacion = "MÓDULO";
                    break;
                case "^":
                    resultado = calcBean.potencia(x, y);
                    operacion = "POTENCIA";
                    break;
                default:
                    break;
            }
            
            out.println("<h1>" + operacion + "</h1>");
            out.println("<h2>*Número 1: " + x);
            out.println("<h2>*Número 2: " + y + "</h2>");
            out.println("<h1>Resultado: " + resultado + "</h1>");
            out.print("<p><a href='CalcJSP.jsp'>Volver atrás...</a></p>");
            
            out.println("</body>");
            out.println("</html>");
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
