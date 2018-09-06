package br.pro.jose.beans;

import java.text.*;
import java.util.*;

public class TipoMembroBean implements java.io.Serializable {
   private int codigo;
   private String descricao;
   private boolean ativo;
   private boolean mensalidade;

    public TipoMembroBean() {
    }

    public TipoMembroBean(int codigo, String descricao, boolean ativo, boolean mensalidade) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.ativo = ativo;
        this.mensalidade = mensalidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public boolean isMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(boolean mensalidade) {
        this.mensalidade = mensalidade;
    }

    @Override
    public String toString() {
        return "TipoMembroBean{" + "codigo=" + codigo + ", descricao=" + descricao + ", ativo=" + ativo + ", mensalidade=" + mensalidade + '}';
    }
   
}