package br.pro.jose.beans;

import br.pro.jose.enums.StatusContaEnum;
import br.pro.jose.enums.TipoContaEnum;
import java.text.*;
import java.util.*;

public class ContaBean implements java.io.Serializable {
    private int numero_documento;
    private String descricao;
    private String data_inclusao; //data
    private String data_vencimento; //data
    private String data_pagamento; //data
    private NaturezaContaBean natureza_conta_codigo;
    private PatrocinadorBean patrocinador_codigo;
    private MembroBean socio_codigo;
    private Double valor;
    private StatusContaEnum status; 
    private String narrativa;
    private TipoContaEnum tipo;

    public ContaBean() {
    }

    public ContaBean(int numero_documento, String descricao, String data_inclusao, String data_vencimento, String data_pagamento, NaturezaContaBean natureza_conta_codigo, PatrocinadorBean patrocinador_codigo, MembroBean socio_codigo, Double valor, StatusContaEnum status, String narrativa, TipoContaEnum tipo) {
        this.numero_documento = numero_documento;
        this.descricao = descricao;
        this.data_inclusao = data_inclusao;
        this.data_vencimento = data_vencimento;
        this.data_pagamento = data_pagamento;
        this.natureza_conta_codigo = natureza_conta_codigo;
        this.patrocinador_codigo = patrocinador_codigo;
        this.socio_codigo = socio_codigo;
        this.valor = valor;
        this.status = status;
        this.narrativa = narrativa;
        this.tipo = tipo;
    }

    public int getNumero_documento() {
        return numero_documento;
    }

    public void setNumero_documento(int numero_documento) {
        this.numero_documento = numero_documento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData_inclusao() {
        return data_inclusao;
    }

    public void setData_inclusao(String data_inclusao) {
        this.data_inclusao = data_inclusao;
    }

    public String getData_vencimento() {
        return data_vencimento;
    }

    public void setData_vencimento(String data_vencimento) {
        this.data_vencimento = data_vencimento;
    }

    public String getData_pagamento() {
        return data_pagamento;
    }

    public void setData_pagamento(String data_pagamento) {
        this.data_pagamento = data_pagamento;
    }

    public NaturezaContaBean getNatureza_conta_codigo() {
        return natureza_conta_codigo;
    }

    public void setNatureza_conta_codigo(NaturezaContaBean natureza_conta_codigo) {
        this.natureza_conta_codigo = natureza_conta_codigo;
    }

    public PatrocinadorBean getPatrocinador_codigo() {
        return patrocinador_codigo;
    }

    public void setPatrocinador_codigo(PatrocinadorBean patrocinador_codigo) {
        this.patrocinador_codigo = patrocinador_codigo;
    }

    public MembroBean getSocio_codigo() {
        return socio_codigo;
    }

    public void setSocio_codigo(MembroBean socio_codigo) {
        this.socio_codigo = socio_codigo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public StatusContaEnum getStatus() {
        return status;
    }

    public void setStatus(StatusContaEnum status) {
        this.status = status;
    }

    public String getNarrativa() {
        return narrativa;
    }

    public void setNarrativa(String narrativa) {
        this.narrativa = narrativa;
    }

    public TipoContaEnum getTipo() {
        return tipo;
    }

    public void setTipo(TipoContaEnum tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "ContaBean{" + "numero_documento=" + numero_documento + ", descricao=" + descricao + ", data_inclusao=" + data_inclusao + ", data_vencimento=" + data_vencimento + ", data_pagamento=" + data_pagamento + ", natureza_conta_codigo=" + natureza_conta_codigo + ", patrocinador_codigo=" + patrocinador_codigo + ", socio_codigo=" + socio_codigo + ", valor=" + valor + ", status=" + status + ", narrativa=" + narrativa + ", tipo=" + tipo + '}';
    }
    
}