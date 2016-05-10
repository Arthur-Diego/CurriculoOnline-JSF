/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferasweb.curriculoonline.model.enumerated;

/**
 *
 * @author Andressa
 */
public enum EnumTipoHabilitacao {

    A("A"),
    B("B"),
    C("C"),
    D("D"),
    E("E"),
    ACC("ACC"),
    MOTOR_CASA("MOTOR-CASA");
    
    private String label;
    
    private EnumTipoHabilitacao(String label){
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    
    
}
