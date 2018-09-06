package br.pro.jose.beans;

import java.text.*;
import java.util.*;

public class CidadeBean implements java.io.Serializable {
   private int codigo;
   private String nome;
   private EstadoBean estado_codigo;

    public CidadeBean() {
    }

    public CidadeBean(int codigo, String nome, EstadoBean estado_codigo) {
        this.codigo = codigo;
        this.nome = nome;
        this.estado_codigo = estado_codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public EstadoBean getEstado_codigo() {
        return estado_codigo;
    }

    public void setEstado_codigo(EstadoBean estado_codigo) {
        this.estado_codigo = estado_codigo;
    }

    @Override
    public String toString() {
        return "CidadeBean{" + "codigo=" + codigo + ", nome=" + nome + ", estado_codigo=" + estado_codigo + '}';
    }
   
}