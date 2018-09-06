package br.pro.jose.beans;

import java.text.*;
import java.util.*;

public class TipoMembroMembroBean implements java.io.Serializable {
   private TipoMembroBean tipo_membro_codigo;
   private MembroBean membro_codigo;

    public TipoMembroMembroBean() {
    }

    public TipoMembroMembroBean(TipoMembroBean tipo_membro_codigo, MembroBean membro_codigo) {
        this.tipo_membro_codigo = tipo_membro_codigo;
        this.membro_codigo = membro_codigo;
    }

    public TipoMembroBean getTipo_membro_codigo() {
        return tipo_membro_codigo;
    }

    public void setTipo_membro_codigo(TipoMembroBean tipo_membro_codigo) {
        this.tipo_membro_codigo = tipo_membro_codigo;
    }

    public MembroBean getMembro_codigo() {
        return membro_codigo;
    }

    public void setMembro_codigo(MembroBean membro_codigo) {
        this.membro_codigo = membro_codigo;
    }

    @Override
    public String toString() {
        return "TipoMembroMembroBean{" + "tipo_membro_codigo=" + tipo_membro_codigo + ", membro_codigo=" + membro_codigo + '}';
    }
   
}