/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferasweb.curriculoonline.model.entity;

import com.ferasweb.curriculoonline.model.commons.EntityInterface;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Aluno
 */
@Entity
@Table(name = "Experiencia")
public class Experiencia implements EntityInterface<Experiencia>{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Experiencia_Cod")
    private Integer experienciaCod;
    
    @Column(name = "Experiencia_Empresa")
    private String empresa;
    
    @Column(name = "Experiencia_Tempo_Trabalho")
    private String tempoTrabalho;

    public Integer getExperienciaCod() {
        return experienciaCod;
    }

    public void setExperienciaCod(Integer experienciaCod) {
        this.experienciaCod = experienciaCod;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getTempoTrabalho() {
        return tempoTrabalho;
    }

    public void setTempoTrabalho(String tempoTrabalho) {
        this.tempoTrabalho = tempoTrabalho;
    }
    
    
    @Override
    public Serializable getId() {
        return this.getExperienciaCod();
    }

    @Override
    public String getLabel() {
        return this.getExperienciaCod()+" - "+this.getEmpresa();
    }

    @Override
    public boolean verificarId() {
        return false;
    }

    @Override
    public boolean isMarcado() {
        return false;
    }

    @Override
    public int compareTo(Experiencia o) {
        return this.getExperienciaCod().compareTo(o.getExperienciaCod());
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + (this.experienciaCod != null ? this.experienciaCod.hashCode() : 0);
        hash = 17 * hash + (this.empresa != null ? this.empresa.hashCode() : 0);
        hash = 17 * hash + (this.tempoTrabalho != null ? this.tempoTrabalho.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Experiencia other = (Experiencia) obj;
        if (this.experienciaCod != other.experienciaCod && (this.experienciaCod == null || !this.experienciaCod.equals(other.experienciaCod))) {
            return false;
        }
        if ((this.empresa == null) ? (other.empresa != null) : !this.empresa.equals(other.empresa)) {
            return false;
        }
        if ((this.tempoTrabalho == null) ? (other.tempoTrabalho != null) : !this.tempoTrabalho.equals(other.tempoTrabalho)) {
            return false;
        }
        return true;
    }
    
    
}
