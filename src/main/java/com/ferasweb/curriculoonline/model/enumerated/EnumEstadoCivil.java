/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferasweb.curriculoonline.model.enumerated;

/**
 *
 * @author Aluno
 */
public enum EnumEstadoCivil {
    
    CASADO("Casado"),
    SOLTEIRO("Soltero"),
    DIVORCIADO("Divorciado"),
    UNIAO_ESTAVEL("União Estável"),
    VIUVO("Viúvo");
    
    private String label;
    
    private EnumEstadoCivil(String label){
        this.label= label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    
}
