package br.pro.jose.beans;

import java.text.*;
import java.util.*;

public class JogadorJogoBean implements java.io.Serializable {
   private MembroBean membro_jogador_codigo;
   private JogoBean jogo_codigo;
   private int quantidade_gol;

    public JogadorJogoBean() {
    }

    public JogadorJogoBean(MembroBean membro_jogador_codigo, JogoBean jogo_codigo, int quantidade_gol) {
        this.membro_jogador_codigo = membro_jogador_codigo;
        this.jogo_codigo = jogo_codigo;
        this.quantidade_gol = quantidade_gol;
    }

    public MembroBean getMembro_jogador_codigo() {
        return membro_jogador_codigo;
    }

    public void setMembro_jogador_codigo(MembroBean membro_jogador_codigo) {
        this.membro_jogador_codigo = membro_jogador_codigo;
    }

    public JogoBean getJogo_codigo() {
        return jogo_codigo;
    }

    public void setJogo_codigo(JogoBean jogo_codigo) {
        this.jogo_codigo = jogo_codigo;
    }

    public int getQuantidade_gol() {
        return quantidade_gol;
    }

    public void setQuantidade_gol(int quantidade_gol) {
        this.quantidade_gol = quantidade_gol;
    }

    @Override
    public String toString() {
        return "JogadorJogoBean{" + "membro_jogador_codigo=" + membro_jogador_codigo + ", jogo_codigo=" + jogo_codigo + ", quantidade_gol=" + quantidade_gol + '}';
    }
   
}