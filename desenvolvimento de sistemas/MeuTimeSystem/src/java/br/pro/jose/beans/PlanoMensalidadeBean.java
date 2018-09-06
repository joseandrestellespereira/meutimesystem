package br.pro.jose.beans;

import br.pro.jose.enums.PeriodicidadeEnum;
import java.text.*;
import java.util.*;

public class PlanoMensalidadeBean implements java.io.Serializable {
   private int codigo;
   private String descricao;
   private Double valor;
   private int dia_vencimento;
   private PeriodicidadeEnum periodicidade;
   private boolean ativo;

    public PlanoMensalidadeBean() {
    }

    public PlanoMensalidadeBean(int codigo, String descricao, Double valor, int dia_vencimento, PeriodicidadeEnum periodicidade, boolean ativo) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
        this.dia_vencimento = dia_vencimento;
        this.periodicidade = periodicidade;
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

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public int getDia_vencimento() {
        return dia_vencimento;
    }

    public void setDia_vencimento(int dia_vencimento) {
        this.dia_vencimento = dia_vencimento;
    }

    public PeriodicidadeEnum getPeriodicidade() {
        return periodicidade;
    }

    public void setPeriodicidade(PeriodicidadeEnum periodicidade) {
        this.periodicidade = periodicidade;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "PlanoMensalidadeBean{" + "codigo=" + codigo + ", descricao=" + descricao + ", valor=" + valor + ", dia_vencimento=" + dia_vencimento + ", periodicidade=" + periodicidade + ", ativo=" + ativo + '}';
    }
    
}