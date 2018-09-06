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
public enum StatusJogoEnum {
    Agendado("Agendado"),
    Disputado("Disputado"),
    Cancelado("Cancelado");
    
    private String status;

    private StatusJogoEnum(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }   
    
}
