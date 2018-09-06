package br.pro.jose.beans;

import br.pro.jose.enums.RegistroMovimentoEnum;
import java.text.*;
import java.util.*;

public class MovimentoPatrimonioMaterialBean implements java.io.Serializable {
    private int codigo;
    private PatrimonioMaterialBean patrimonio_material_codigo;
    private int quantidade;
    private Double valor_unitario;
    private String data_registro; //data
    private String narrativa;
    private RegistroMovimentoEnum registro;

    public MovimentoPatrimonioMaterialBean() {
    }

    public MovimentoPatrimonioMaterialBean(int codigo, PatrimonioMaterialBean patrimonio_material_codigo, int quantidade, Double valor_unitario, String data_registro, String narrativa, RegistroMovimentoEnum registro) {
        this.codigo = codigo;
        this.patrimonio_material_codigo = patrimonio_material_codigo;
        this.quantidade = quantidade;
        this.valor_unitario = valor_unitario;
        this.data_registro = data_registro;
        this.narrativa = narrativa;
        this.registro = registro;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public PatrimonioMaterialBean getPatrimonio_material_codigo() {
        return patrimonio_material_codigo;
    }

    public void setPatrimonio_material_codigo(PatrimonioMaterialBean patrimonio_material_codigo) {
        this.patrimonio_material_codigo = patrimonio_material_codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValor_unitario() {
        return valor_unitario;
    }

    public void setValor_unitario(Double valor_unitario) {
        this.valor_unitario = valor_unitario;
    }

    public String getData_registro() {
        return data_registro;
    }

    public void setData_registro(String data_registro) {
        this.data_registro = data_registro;
    }

    public String getNarrativa() {
        return narrativa;
    }

    public void setNarrativa(String narrativa) {
        this.narrativa = narrativa;
    }

    public RegistroMovimentoEnum getRegistro() {
        return registro;
    }

    public void setRegistro(RegistroMovimentoEnum registro) {
        this.registro = registro;
    }

    @Override
    public String toString() {
        return "MovimentoPatrimonioMaterialBean{" + "codigo=" + codigo + ", patrimonio_material_codigo=" + patrimonio_material_codigo + ", quantidade=" + quantidade + ", valor_unitario=" + valor_unitario + ", data_registro=" + data_registro + ", narrativa=" + narrativa + ", registro=" + registro + '}';
    }
    
}