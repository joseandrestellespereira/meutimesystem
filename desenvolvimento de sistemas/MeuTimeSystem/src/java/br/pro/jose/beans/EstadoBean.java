package br.pro.jose.beans;

import java.text.*;
import java.util.*;

public class EstadoBean implements java.io.Serializable {
    private int codigo;
    private String sigla;
    private String nome;
    private PaisBean pais_codigo;

    public EstadoBean() {
    }

    public EstadoBean(int codigo, String sigla, String nome, PaisBean pais_codigo) {
        this.codigo = codigo;
        this.sigla = sigla;
        this.nome = nome;
        this.pais_codigo = pais_codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public PaisBean getPais_codigo() {
        return pais_codigo;
    }

    public void setPais_codigo(PaisBean pais_codigo) {
        this.pais_codigo = pais_codigo;
    }

    @Override
    public String toString() {
        return "EstadoBean{" + "codigo=" + codigo + ", sigla=" + sigla + ", nome=" + nome + ", pais_codigo=" + pais_codigo + '}';
    }
    
}