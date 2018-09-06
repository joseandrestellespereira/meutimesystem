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
public enum RegistroMovimentoEnum {
    Entrada("Entrada"),
    Saida("Saida");
    
    private String registro;

    private RegistroMovimentoEnum(String registro) {
        this.registro = registro;
    }

    public String getRegistro() {
        return registro;
    }   
    
}