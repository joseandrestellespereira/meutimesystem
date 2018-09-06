/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.jose.enums;

/**
 *
 * @author JOSE
 */
public enum ResultadoJogoEnum {
    Vitoria("Vitoria"),
    Derrota("Derrota"),
    Empate("Empate");
    
    private String resultado;

    private ResultadoJogoEnum(String resultado) {
        this.resultado = resultado;
    }

    public String getResultado() {
        return resultado;
    }   
    
}
