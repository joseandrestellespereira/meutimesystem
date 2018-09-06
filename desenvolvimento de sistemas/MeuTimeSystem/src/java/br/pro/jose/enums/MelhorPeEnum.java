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
public enum MelhorPeEnum {
    Direito("Direito"),
    Esquerdo("Esquerdo");
    
    private String melhor_pe;

    private MelhorPeEnum(String melhor_pe) {
        this.melhor_pe = melhor_pe;
    }

    public String getPeriodicidade() {
        return melhor_pe;
    }   
    
}
