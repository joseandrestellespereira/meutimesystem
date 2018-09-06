package br.pro.jose;

import java.text.*;
import java.util.*;

public class PosicaoBean implements java.io.Serializable {
  private int codigo;
  private String descricao;
  
  public PosicaoBean() {
      
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

    @Override
    public String toString() {
        return "PosicaoBean{" + "codigo=" + codigo + ", descricao=" + descricao + '}';
    }
 
}