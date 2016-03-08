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
public enum EnumTipoFormacao {
    
    TECNICO("Técnico"),
    GRADUACAO("Graduação"),
    ESPECIALIZACAO("Especialização"),
    MESTRADO("Mestrado"),
    DOUTORADO("Doutorado"),
    POS_DOUTORADO("Pós-Doutorado");
    
    private String label;
    
    private EnumTipoFormacao(String label){
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    
    
}
