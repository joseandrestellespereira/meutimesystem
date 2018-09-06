package br.pro.jose.beans;

import br.pro.jose.enums.MelhorPeEnum;
import java.text.*;
import java.util.*;

public class MembroBean implements java.io.Serializable {
   private int codigo;
   private String nome;
   private String cpf;
   private String rg;
   private String email;
   private String telefone;
   private PlanoMensalidadeBean plano_mensalidade_codigo;
   private String data_nascimento; //data
   private String inicio_mensalidade; //data
   private int parcelas;
   private String vigencia_mensalidade; //data
   private EnderecoBean endereco_codigo;
   private PosicaoBean posicao_codigo;
   private int numero_camisa;
   private boolean ativo;
   private MelhorPeEnum melhor_pe;

    public MembroBean() {
    }

    public MembroBean(int codigo, String nome, String cpf, String rg, String email, String telefone, PlanoMensalidadeBean plano_mensalidade_codigo, String data_nascimento, String inicio_mensalidade, int parcelas, String vigencia_mensalidade, EnderecoBean endereco_codigo, PosicaoBean posicao_codigo, int numero_camisa, boolean ativo, MelhorPeEnum melhor_pe) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.email = email;
        this.telefone = telefone;
        this.plano_mensalidade_codigo = plano_mensalidade_codigo;
        this.data_nascimento = data_nascimento;
        this.inicio_mensalidade = inicio_mensalidade;
        this.parcelas = parcelas;
        this.vigencia_mensalidade = vigencia_mensalidade;
        this.endereco_codigo = endereco_codigo;
        this.posicao_codigo = posicao_codigo;
        this.numero_camisa = numero_camisa;
        this.ativo = ativo;
        this.melhor_pe = melhor_pe;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public PlanoMensalidadeBean getPlano_mensalidade_codigo() {
        return plano_mensalidade_codigo;
    }

    public void setPlano_mensalidade_codigo(PlanoMensalidadeBean plano_mensalidade_codigo) {
        this.plano_mensalidade_codigo = plano_mensalidade_codigo;
    }

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getInicio_mensalidade() {
        return inicio_mensalidade;
    }

    public void setInicio_mensalidade(String inicio_mensalidade) {
        this.inicio_mensalidade = inicio_mensalidade;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public String getVigencia_mensalidade() {
        return vigencia_mensalidade;
    }

    public void setVigencia_mensalidade(String vigencia_mensalidade) {
        this.vigencia_mensalidade = vigencia_mensalidade;
    }

    public EnderecoBean getEndereco_codigo() {
        return endereco_codigo;
    }

    public void setEndereco_codigo(EnderecoBean endereco_codigo) {
        this.endereco_codigo = endereco_codigo;
    }

    public PosicaoBean getPosicao_codigo() {
        return posicao_codigo;
    }

    public void setPosicao_codigo(PosicaoBean posicao_codigo) {
        this.posicao_codigo = posicao_codigo;
    }

    public int getNumero_camisa() {
        return numero_camisa;
    }

    public void setNumero_camisa(int numero_camisa) {
        this.numero_camisa = numero_camisa;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public MelhorPeEnum getMelhor_pe() {
        return melhor_pe;
    }

    public void setMelhor_pe(MelhorPeEnum melhor_pe) {
        this.melhor_pe = melhor_pe;
    }

    @Override
    public String toString() {
        return "MembroBean{" + "codigo=" + codigo + ", nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", email=" + email + ", telefone=" + telefone + ", plano_mensalidade_codigo=" + plano_mensalidade_codigo + ", data_nascimento=" + data_nascimento + ", inicio_mensalidade=" + inicio_mensalidade + ", parcelas=" + parcelas + ", vigencia_mensalidade=" + vigencia_mensalidade + ", endereco_codigo=" + endereco_codigo + ", posicao_codigo=" + posicao_codigo + ", numero_camisa=" + numero_camisa + ", ativo=" + ativo + ", melhor_pe=" + melhor_pe + '}';
    }
   
}