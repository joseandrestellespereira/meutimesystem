/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.jose.negocio;

import br.pro.jose.beans.PlanoMensalidadeBean;
import br.pro.jose.erros.ErroException;
import br.pro.jose.persistencias.PlanoMensalidadeDAO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JOSE
 */
public class PlanoMensalidadeBO {
    public static String incluir (PlanoMensalidadeBean b) throws ErroException {
        try {
            List<String> descricaoList = PlanoMensalidadeDAO.listarDescricaoPlanoMensalidade();
            if(!descricaoList.contains(b.getDescricao())){
                PlanoMensalidadeDAO.incluir(b);
                return "Cadastro Incluso com sucesso!";
            }else{
                return "Plano de Mensalidade já cadastrado!";
            }  
        } catch (Exception ex) {
            throw new ErroException();
        }
    }
    
    public static String alterar (PlanoMensalidadeBean b) throws ErroException {
        try {
            PlanoMensalidadeDAO.alterar(b);
            return "Cadastro alterado com sucesso!";
        } catch (Exception ex) {
            throw new ErroException();
        }
    }
    
    public static void excluir (String codigo) throws ErroException {
        try {
            PlanoMensalidadeDAO.excluir(codigo);
        } catch (Exception ex) {
            throw new ErroException();
        }
    }
    
    public static List<PlanoMensalidadeBean> listarPlanoMensalidade(String codigo, String descricao, String status) throws ErroException {
        try {
            return PlanoMensalidadeDAO.listarPlanoMensalidade(codigo, descricao, status);
        } catch (Exception ex) {
            throw new ErroException();
        }
    }
}
