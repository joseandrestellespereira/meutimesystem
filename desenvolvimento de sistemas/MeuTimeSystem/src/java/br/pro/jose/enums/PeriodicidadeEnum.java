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
public enum PeriodicidadeEnum {
    Mensal("Mensal"),
    Trimestral("Trimestral"),
    Semestral("Semestral"),
    Anual("Anual");
    
    private String periodicidade;

    private PeriodicidadeEnum(String periodicidade) {
        this.periodicidade = periodicidade;
    }

    public String getPeriodicidade() {
        return periodicidade;
    }   
    
}
