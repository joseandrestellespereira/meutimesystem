/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.jose.servlets;

import br.pro.jose.beans.PlanoMensalidadeBean;
import br.pro.jose.enums.PeriodicidadeEnum;
import br.pro.jose.enums.StatusEnum;
import br.pro.jose.negocio.PlanoMensalidadeBO;
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
 * @author JOSE
 */
@WebServlet(name = "PlanoMensalidadeServlet", urlPatterns = {"/planomensalidadeservlet"})
public class PlanoMensalidadeServlet extends HttpServlet {

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
        String url = "/cadastroPlanoMensalidade.jsp";

        
        if (operacao.equals("gravar_plano_mensalidade")) {
            url = gravarPlanoMensalidade(request,response);  
        }if (operacao.equals("buscar_plano_mensalidade")) {
            url = buscarPlanoMensalidade(request,response);  
        }if (operacao.equals("excluir_plano_mensalidade")) {
            url = excluirPlanoMensalidade(request,response);  
        }


        ServletContext sc = getServletContext();
        RequestDispatcher rd = sc.getRequestDispatcher(url);
        rd.forward(request, response);
      }
      
      
      private String gravarPlanoMensalidade(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String mensagem = "";
        PlanoMensalidadeBean p = new PlanoMensalidadeBean();
        String codigo  = request.getParameter("codigo");
        p.setDescricao(request.getParameter("descricao"));
        String valor = request.getParameter("valor").replace(',', '.');
        p.setValor(Double.parseDouble(valor));
        p.setDia_vencimento(Integer.parseInt(request.getParameter("dia_vencimento")));
        String periodicidade = request.getParameter("periodicidade");
        if(periodicidade.equals(PeriodicidadeEnum.Mensal.toString())){
            p.setPeriodicidade(PeriodicidadeEnum.Mensal);
        }
        if(periodicidade.equals(PeriodicidadeEnum.Trimestral.toString())){
            p.setPeriodicidade(PeriodicidadeEnum.Trimestral);
        }
        if(periodicidade.equals(PeriodicidadeEnum.Semestral.toString())){
            p.setPeriodicidade(PeriodicidadeEnum.Semestral);
        }
        if(periodicidade.equals(PeriodicidadeEnum.Anual.toString())){
            p.setPeriodicidade(PeriodicidadeEnum.Anual);
        }
        String status = request.getParameter("status");
        if(status.equals(StatusEnum.Ativo.toString())){
            p.setAtivo(true);
        }else{
            p.setAtivo(false);
        }
        if(codigo.isEmpty()){
            mensagem = PlanoMensalidadeBO.incluir(p);
        }else{
            p.setCodigo(Integer.parseInt(codigo));
            mensagem = PlanoMensalidadeBO.alterar(p);
        }
        
        codigo = "";
        String descricao = "";
        status = "";
        List<PlanoMensalidadeBean> planos = PlanoMensalidadeBO.listarPlanoMensalidade(codigo, descricao, status );
        request.setAttribute("lista_plano_mensalidade", planos);
        request.setAttribute("mensagem", mensagem);
        return "/cadastroPlanoMensalidade.jsp";
      }
      private String buscarPlanoMensalidade(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String codigo = request.getParameter("codigo_consulta"); 
        String descricao = request.getParameter("descricao_consulta");
        String status = request.getParameter("status_consulta");
                
        List<PlanoMensalidadeBean> planos = PlanoMensalidadeBO.listarPlanoMensalidade(codigo, descricao, status );
        request.setAttribute("lista_plano_mensalidade", planos);
        request.setAttribute("inclusao", "nao");
        request.setAttribute("alteracao", "nao");
        request.setAttribute("mensagem", "");
        return "/cadastroPlanoMensalidade.jsp";
      }
      
      private String excluirPlanoMensalidade(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String codigo = request.getParameter("codigo_excluir"); 
        if(!codigo.isEmpty()){
            PlanoMensalidadeBO.excluir(codigo);
        }
        codigo = "";
        String descricao = "";
        String status = "";
        List<PlanoMensalidadeBean> planos = PlanoMensalidadeBO.listarPlanoMensalidade(codigo, descricao, status );
        request.setAttribute("mensagem", "");
        request.setAttribute("lista_plano_mensalidade", planos);
        return "/cadastroPlanoMensalidade.jsp";
      }
      

}
