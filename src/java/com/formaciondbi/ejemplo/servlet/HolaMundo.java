/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.formaciondbi.ejemplo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alejandro
 */
@WebServlet(name = "HolaMundoServlet", urlPatterns = {"/hola-mundo.htm"})
public class HolaMundo extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<title>Formulario Básico Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Formulario Básico Servlet</h1>");
			
            out.println("<form action=\"" + request.getContextPath() + "/hola-mundo.htm\" method=\"post\">");
            out.println("<table>");
            out.println("<tr>");
            out.println("<td>Nombre</td>");
            out.println("<td><input type=\"text\" name=\"nombre\" style=\"width: 300px;\" /></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Email</td>");
            out.println("<td><input type=\"text\" name=\"email\" style=\"width: 300px;\" /></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Saldo</td>");
            out.println("<td><input type=\"text\" name=\"saldo\" style=\"width: 300px;\" /></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Nivel Endeudamiento</td>");
            out.println("<td><input type=\"text\" name=\"nivelEndeudamiento\" style=\"width: 300px;\" /></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Fecha Renovación</td>");
            out.println("<td><input type=\"text\" name=\"fechaRenovacion\" style=\"width: 300px;\" /></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td colspan=\"2\"><input type=\"submit\" value=\"Crear Cuenta\" /></td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("</form>");
			
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

        response.setContentType("text/html");

        try (PrintWriter out = response.getWriter()) {

            String nombre = request.getParameter("nombre");
            String email = request.getParameter("email");
            String saldo = request.getParameter("saldo");
            String nivelEndeudamiento = request.getParameter("nivelEndeudamiento");
            String fechaRenovacion = request.getParameter("fechaRenovacion");

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<title>Respuesta Servlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Respuesta Servlet: Datos enviados</h1>");

            out.println("<table>");
            out.println("<tr>");
            out.println("<td>Nombre</td>");
            out.println("<td>" + nombre + "</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Email</td>");
            out.println("<td>" + email + "</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Saldo</td>");
            out.println("<td>" + saldo + "</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Nivel Endeudamiento</td>");
            out.println("<td>" + nivelEndeudamiento + "</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Fecha Renovación</td>");
            out.println("<td>" + fechaRenovacion + "</td>");
            out.println("</tr>");

            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
        }
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
