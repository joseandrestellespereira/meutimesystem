package br.pro.jose.beans;

import java.text.*;
import java.util.*;

public class LoginBean implements java.io.Serializable {
  private String usuario ;
  private String nome_time;
  private String responsavel;
  private String email;
  private String senha;

    public LoginBean() {
    }

    public LoginBean(String usuario, String nome_time, String responsavel, String email, String senha) {
        this.usuario = usuario;
        this.nome_time = nome_time;
        this.responsavel = responsavel;
        this.email = email;
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNome_time() {
        return nome_time;
    }

    public void setNome_time(String nome_time) {
        this.nome_time = nome_time;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "LoginBean{" + "usuario=" + usuario + ", nome_time=" + nome_time + ", responsavel=" + responsavel + ", email=" + email + ", senha=" + senha + '}';
    } 
}