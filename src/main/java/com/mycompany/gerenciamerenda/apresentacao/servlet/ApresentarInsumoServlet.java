/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gerenciamerenda.apresentacao.servlet;

import com.mycompany.gerenciamerenda.fachada.Fachada;
import com.mycompany.gerenciarmerenda.modelo.Insumo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Gabriel Alves
 */
@WebServlet(name = "ApresentarInsumoServlet", urlPatterns = {"/ApresentarInsumoServlet"})
public class ApresentarInsumoServlet extends HttpServlet {

    
     
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Insumo> listaInsumo = Fachada.getInstance().recuperarTodosInsumo();
        try (PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ApresentarInsumoServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Insumos cadastrados</h1>");
            out.println("<a href=\"index.html\">Voltar</a><br>");
            
            out.println("<table border=\"1\">");
            
                out.println("<tr><td>Código</td><td>Tipo</td><td>Descrição</td><td>Operaçoes</td></tr>");
                
                for(Insumo ta:listaInsumo){
                    out.println("<tr><td>"+ta.getCodInsumo()+"</td><td>"+ta.getNome()+"</td><td>"+
                            ta.getQuantidade()+"</td>"
                            + "<td><a href=\"izualizarInsumo.jsp?codigo="+ta.getCodInsumo()+"\">visualizar</a>"
                            + " <a href=\"AlteraTipoAnimal.jsp?codigo="+ta.getCodInsumo()+"\">Alterar</a>"
                            + " <a href=\"ExcluirInsumoServlet?codigo="+ta.getCodInsumo()+"\">Excluir</a></td></tr>");
                }
            
            out.println("<table>");
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
