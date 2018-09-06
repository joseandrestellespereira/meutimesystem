package br.pro.jose.beans;

import java.text.*;
import java.util.*;

public class NaturezaContaBean implements java.io.Serializable {
    private int codigo;
    private String descricao;
    private boolean ativo;

    public NaturezaContaBean() {
    }

    public NaturezaContaBean(int codigo, String descricao, boolean ativo) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.ativo = ativo;
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

    @Override
    public String toString() {
        return "NaturezaContaBean{" + "codigo=" + codigo + ", descricao=" + descricao + ", ativo=" + ativo + '}';
    }
    
}