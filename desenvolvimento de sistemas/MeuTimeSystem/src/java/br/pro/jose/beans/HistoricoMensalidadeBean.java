package br.pro.jose.beans;

import java.text.*;
import java.util.*;

public class HistoricoMensalidadeBean implements java.io.Serializable {
    private int codigo;
    private MembroBean membro_codigo;
    private PlanoMensalidadeBean plano_codigo;
    private String data_alteração; //data
    private String inicio_mensalidade; //data
    private int parcelas;
    private String vigencia_mensalidade; //data
    private LoginBean usuario;

    public HistoricoMensalidadeBean() {
    }

    public HistoricoMensalidadeBean(int codigo, MembroBean membro_codigo, PlanoMensalidadeBean plano_codigo, String data_alteração, String inicio_mensalidade, int parcelas, String vigencia_mensalidade, LoginBean usuario) {
        this.codigo = codigo;
        this.membro_codigo = membro_codigo;
        this.plano_codigo = plano_codigo;
        this.data_alteração = data_alteração;
        this.inicio_mensalidade = inicio_mensalidade;
        this.parcelas = parcelas;
        this.vigencia_mensalidade = vigencia_mensalidade;
        this.usuario = usuario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public MembroBean getMembro_codigo() {
        return membro_codigo;
    }

    public void setMembro_codigo(MembroBean membro_codigo) {
        this.membro_codigo = membro_codigo;
    }

    public PlanoMensalidadeBean getPlano_codigo() {
        return plano_codigo;
    }

    public void setPlano_codigo(PlanoMensalidadeBean plano_codigo) {
        this.plano_codigo = plano_codigo;
    }

    public String getData_alteração() {
        return data_alteração;
    }

    public void setData_alteração(String data_alteração) {
        this.data_alteração = data_alteração;
    }

    public String getInicio_mensalidade() {
        return inicio_mensalidade;
    }

    public void setInicio_mensalidade(String inicio_mensalidade) {
        this.inicio_mensalidade = inicio_mensalidade;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public String getVigencia_mensalidade() {
        return vigencia_mensalidade;
    }

    public void setVigencia_mensalidade(String vigencia_mensalidade) {
        this.vigencia_mensalidade = vigencia_mensalidade;
    }

    public LoginBean getUsuario() {
        return usuario;
    }

    public void setUsuario(LoginBean usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "HistoricoMensalidadeBean{" + "codigo=" + codigo + ", membro_codigo=" + membro_codigo + ", plano_codigo=" + plano_codigo + ", data_altera\u00e7\u00e3o=" + data_alteração + ", inicio_mensalidade=" + inicio_mensalidade + ", parcelas=" + parcelas + ", vigencia_mensalidade=" + vigencia_mensalidade + ", usuario=" + usuario + '}';
    }
    
}