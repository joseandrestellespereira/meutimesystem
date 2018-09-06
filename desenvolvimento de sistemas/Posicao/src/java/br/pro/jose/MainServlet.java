/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.jose;

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
@WebServlet(name = "servlet", urlPatterns = {"/MainServlet"})
public class MainServlet extends HttpServlet {

        @Override
      protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
            try {
                processar(request, response);
            } catch (Exception ex) {
                Logger.getLogger(MainServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
      }

      @Override
      protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
            try {
                processar(request, response);
            } catch (Exception ex) {
                Logger.getLogger(MainServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
      }

      protected void processar(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException, Exception {

        String operacao = request.getParameter("ope");
        String url = "/index.jsp";

        
        if (operacao.equals("gravar_posicao")) {
            url = gravarPosicao(request,response);  
        }else if (operacao.equals("listar_posicao")) {
            url = listarPosicao(request,response);  
        }


        ServletContext sc = getServletContext();
        RequestDispatcher rd = sc.getRequestDispatcher(url);
        rd.forward(request, response);
      }
      
      
      private String gravarPosicao(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PosicaoBean p = new PosicaoBean();
        p.setDescricao(request.getParameter("descricao"));
        PosicaoDAO.incluir(p);
        return "/index.jsp";
      }
      
      private String listarPosicao(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String codigo = request.getParameter("");
        String descricao = request.getParameter("");
        List<PosicaoBean> posicoes = PosicaoDAO.listarPosicao(codigo, descricao);
        request.setAttribute("lista_posicao", posicoes);
        return "/listaPosicao.jsp";
      }
      
    }

   