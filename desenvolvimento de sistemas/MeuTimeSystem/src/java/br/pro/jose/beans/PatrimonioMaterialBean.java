package br.pro.jose.beans;

import br.pro.jose.enums.TipoPatrimonioMaterialEnum;
import java.text.*;
import java.util.*;

public class PatrimonioMaterialBean implements java.io.Serializable {
   private int codigo;
   private String descricao;
   private String observacoes;
   private boolean ativo;
   private TipoPatrimonioMaterialEnum tipo;

    public PatrimonioMaterialBean() {
    }

    public PatrimonioMaterialBean(int codigo, String descricao, String observacoes, boolean ativo, TipoPatrimonioMaterialEnum tipo) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.observacoes = observacoes;
        this.ativo = ativo;
        this.tipo = tipo;
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

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public TipoPatrimonioMaterialEnum getTipo() {
        return tipo;
    }

    public void setTipo(TipoPatrimonioMaterialEnum tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "PatrimonioMaterialBean{" + "codigo=" + codigo + ", descricao=" + descricao + ", observacoes=" + observacoes + ", ativo=" + ativo + ", tipo=" + tipo + '}';
    }
   
}