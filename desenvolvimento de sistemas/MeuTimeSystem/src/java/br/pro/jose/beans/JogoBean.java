package br.pro.jose.beans;

import br.pro.jose.enums.ResultadoJogoEnum;
import br.pro.jose.enums.StatusJogoEnum;
import java.text.*;
import java.util.*;

public class JogoBean implements java.io.Serializable {
    private int codigo;
    private String data_jogo; //data
    private String local;
    private AdversarioBean adversario_codigo;
    private int gols_time;
    private int gols_adversario;
    private String narrativa;
    private StatusJogoEnum status;
    private ResultadoJogoEnum resultado;

    public JogoBean() {
    }

    public JogoBean(int codigo, String data_jogo, String local, AdversarioBean adversario_codigo, int gols_time, int gols_adversario, String narrativa, StatusJogoEnum status, ResultadoJogoEnum resultado) {
        this.codigo = codigo;
        this.data_jogo = data_jogo;
        this.local = local;
        this.adversario_codigo = adversario_codigo;
        this.gols_time = gols_time;
        this.gols_adversario = gols_adversario;
        this.narrativa = narrativa;
        this.status = status;
        this.resultado = resultado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getData_jogo() {
        return data_jogo;
    }

    public void setData_jogo(String data_jogo) {
        this.data_jogo = data_jogo;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public AdversarioBean getAdversario_codigo() {
        return adversario_codigo;
    }

    public void setAdversario_codigo(AdversarioBean adversario_codigo) {
        this.adversario_codigo = adversario_codigo;
    }

    public int getGols_time() {
        return gols_time;
    }

    public void setGols_time(int gols_time) {
        this.gols_time = gols_time;
    }

    public int getGols_adversario() {
        return gols_adversario;
    }

    public void setGols_adversario(int gols_adversario) {
        this.gols_adversario = gols_adversario;
    }

    public String getNarrativa() {
        return narrativa;
    }

    public void setNarrativa(String narrativa) {
        this.narrativa = narrativa;
    }

    public StatusJogoEnum getStatus() {
        return status;
    }

    public void setStatus(StatusJogoEnum status) {
        this.status = status;
    }

    public ResultadoJogoEnum getResultado() {
        return resultado;
    }

    public void setResultado(ResultadoJogoEnum resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "JogoBean{" + "codigo=" + codigo + ", data_jogo=" + data_jogo + ", local=" + local + ", adversario_codigo=" + adversario_codigo + ", gols_time=" + gols_time + ", gols_adversario=" + gols_adversario + ", narrativa=" + narrativa + ", status=" + status + ", resultado=" + resultado + '}';
    }
    
}