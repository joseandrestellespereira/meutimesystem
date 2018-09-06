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
public enum TipoPatrimonioMaterialEnum {
    Patrimonio("Patrimonio"),
    Material("Material");
    
    private String tipo;

    private TipoPatrimonioMaterialEnum(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }   
    
}
