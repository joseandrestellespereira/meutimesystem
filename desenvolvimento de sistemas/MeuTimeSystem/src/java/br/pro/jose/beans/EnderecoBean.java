package br.pro.jose.beans;

import java.text.*;
import java.util.*;

public class EnderecoBean implements java.io.Serializable {
   private int codigo;
   private String logradouro;
   private int numero;
   private String bairro;
   private CidadeBean cidade_codigo;
   private String cep;

    public EnderecoBean() {
    }

    public EnderecoBean(int codigo, String logradouro, int numero, String bairro, CidadeBean cidade_codigo, String cep) {
        this.codigo = codigo;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade_codigo = cidade_codigo;
        this.cep = cep;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public CidadeBean getCidade_codigo() {
        return cidade_codigo;
    }

    public void setCidade_codigo(CidadeBean cidade_codigo) {
        this.cidade_codigo = cidade_codigo;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "EnderecoBean{" + "codigo=" + codigo + ", logradouro=" + logradouro + ", numero=" + numero + ", bairro=" + bairro + ", cidade_codigo=" + cidade_codigo + ", cep=" + cep + '}';
    }
    
}