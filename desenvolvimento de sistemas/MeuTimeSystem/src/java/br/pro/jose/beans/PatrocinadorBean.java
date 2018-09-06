package br.pro.jose.beans;

import java.text.*;
import java.util.*;

public class PatrocinadorBean implements java.io.Serializable {
   private int codigo;
   private String nome;
   private String responsavel;
   private String telefone;
   private String email;
   private EnderecoBean endereco_codigo;
   private String observacao;
   private boolean ativo;

    public PatrocinadorBean() {
    }

    public PatrocinadorBean(int codigo, String nome, String responsavel, String telefone, String email, EnderecoBean endereco_codigo, String observacao, boolean ativo) {
        this.codigo = codigo;
        this.nome = nome;
        this.responsavel = responsavel;
        this.telefone = telefone;
        this.email = email;
        this.endereco_codigo = endereco_codigo;
        this.observacao = observacao;
        this.ativo = ativo;
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

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EnderecoBean getEndereco_codigo() {
        return endereco_codigo;
    }

    public void setEndereco_codigo(EnderecoBean endereco_codigo) {
        this.endereco_codigo = endereco_codigo;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "PatrocinadorBean{" + "codigo=" + codigo + ", nome=" + nome + ", responsavel=" + responsavel + ", telefone=" + telefone + ", email=" + email + ", endereco_codigo=" + endereco_codigo + ", observacao=" + observacao + ", ativo=" + ativo + '}';
    }
   
   
}