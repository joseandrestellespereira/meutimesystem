package br.pro.jose.beans;

import java.text.*;
import java.util.*;

public class PosicaoBean implements java.io.Serializable {
   private int codigo;
   private String nome_posicao;
   private String descricao;
   private boolean ativo;

   public PosicaoBean() {
   }

    public PosicaoBean(int codigo, String nome_posicao, String descricao, boolean ativo) {
        this.codigo = codigo;
        this.nome_posicao = nome_posicao;
        this.descricao = descricao;
        this.ativo = ativo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome_posicao() {
        return nome_posicao;
    }

    public void setNome_posicao(String nome_posicao) {
        this.nome_posicao = nome_posicao;
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
        return "PosicaoBean{" + "codigo=" + codigo + ", nome_posicao=" + nome_posicao + ", descricao=" + descricao + ", ativo=" + ativo + '}';
    }
    
}