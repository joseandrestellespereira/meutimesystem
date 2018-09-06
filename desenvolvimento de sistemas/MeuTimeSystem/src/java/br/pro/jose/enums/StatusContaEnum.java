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
public enum StatusContaEnum {
    Pago("Pago"),
    Pendente("Pendente"),
    Inativo("Inativo");
    
    private String status;

    private StatusContaEnum(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }   
    
}
