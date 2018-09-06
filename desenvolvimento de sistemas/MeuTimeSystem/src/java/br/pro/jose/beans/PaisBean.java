package br.pro.jose.beans;

import java.text.*;
import java.util.*;

public class PaisBean implements java.io.Serializable {
   private int codigo;
   private String nome;

    public PaisBean() {
    }

    public PaisBean(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
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

    @Override
    public String toString() {
        return "PaisBean{" + "codigo=" + codigo + ", nome=" + nome + '}';
    }
   
}