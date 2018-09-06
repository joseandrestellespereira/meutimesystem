/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.jose.servlets;

import br.pro.jose.beans.PlanoMensalidadeBean;
import br.pro.jose.persistencias.PlanoMensalidadeDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jose
 */
@WebServlet(name = "menu", urlPatterns = {"/MenuServlet"})
public class MenuServlet extends HttpServlet {

        @Override
      protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
            try {
                processar(request, response);
            } catch (Exception ex) {
                Logger.getLogger(MenuServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
      }

      @Override
      protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
            try {
                processar(request, response);
            } catch (Exception ex) {
                Logger.getLogger(MenuServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
      }

      protected void processar(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException, Exception {

        String operacao = request.getParameter("ope");
        String url = "/index.jsp";

        
        if (operacao.equals("cadastroPlanoMensalidade")) {
            url = cadastroPlanoMensalidade(request,response);  
        }


        ServletContext sc = getServletContext();
        RequestDispatcher rd = sc.getRequestDispatcher(url);
        rd.forward(request, response);
      }
      
      
      private String cadastroPlanoMensalidade(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String codigo = "";
        String descricao = "";
        String status = "";
        List<PlanoMensalidadeBean> planos = PlanoMensalidadeDAO.listarPlanoMensalidade(codigo, descricao, status );
        request.setAttribute("lista_plano_mensalidade", planos);
        request.setAttribute("mensagem", "");
        return "/cadastroPlanoMensalidade.jsp";
      }
      
      
    }

   