/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferasweb.curriculoonline.model.entity;

import com.ferasweb.curriculoonline.model.commons.EntityInterface;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import org.hibernate.annotations.Type;

/**
 *
 * @author Aluno
 */
@Entity
@Table(name = "Experiencia")
public class Experiencia implements EntityInterface<Experiencia>{
    @TableGenerator(name="Experiencia_Generator",
            table="GENERATED_KEYS",
            pkColumnName="PK_COLUMN",
            valueColumnName="VALUE_COLUMN",
            pkColumnValue="Experiencia_ID",
            allocationSize=10
    )
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "Experiencia_Generator")
    @Column(name = "Experiencia_Cod")
    private Integer experienciaCod;
    
    @Column(name = "Experiencia_Empresa")
    private String empresa;
    
    @Column(name = "Experiencia_Data_Inicio")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataInicio;
    
    @Column(name = "Experiencia_Data_Fim")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataFinal;
    
    @Type(type = "text")
    @Column(name = "Experiencia_Desc")
    private String descExperiencia;

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

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public String getDescExperiencia() {
        return descExperiencia;
    }

    public void setDescExperiencia(String descExperiencia) {
        this.descExperiencia = descExperiencia;
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
        return true;
    }
    
    
}
