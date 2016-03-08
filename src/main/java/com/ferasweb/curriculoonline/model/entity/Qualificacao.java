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
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Aluno
 */
@Entity
@Table(name = "Qualificacao")
public class Qualificacao implements EntityInterface<Qualificacao> {
    
    @Id
    @GeneratedValue
    @Column(name = "Qualificacao_Cod")
    private Integer qualificacaoCod;
    
    @Column(name = "Qualificacao_Cursos_Palestras")
    private String cursoPalestras;
    @Column(name = "Qualificacao_AnoTerminio")
    private String anoTerminio;
    @Column(name = "Qualificacao_CargaHoraria")
    private String cargaHoraria;

    public Integer getQualificacaoCod() {
        return qualificacaoCod;
    }

    public void setQualificacaoCod(Integer qualificacaoCod) {
        this.qualificacaoCod = qualificacaoCod;
    }

    public String getCursoPalestras() {
        return cursoPalestras;
    }

    public void setCursoPalestras(String cursoPalestras) {
        this.cursoPalestras = cursoPalestras;
    }

    public String getAnoTerminio() {
        return anoTerminio;
    }

    public void setAnoTerminio(String anoTerminio) {
        this.anoTerminio = anoTerminio;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    @Override
    public Serializable getId() {
        return this.getQualificacaoCod();
    }

    @Override
    public String getLabel() {
        return this.getCursoPalestras()+" - "+this.getCargaHoraria();
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
    public int compareTo(Qualificacao o) {
        return this.getQualificacaoCod().compareTo(o.getQualificacaoCod());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + (this.qualificacaoCod != null ? this.qualificacaoCod.hashCode() : 0);
        hash = 17 * hash + (this.cursoPalestras != null ? this.cursoPalestras.hashCode() : 0);
        hash = 17 * hash + (this.anoTerminio != null ? this.anoTerminio.hashCode() : 0);
        hash = 17 * hash + (this.cargaHoraria != null ? this.cargaHoraria.hashCode() : 0);
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
        final Qualificacao other = (Qualificacao) obj;
        if (this.qualificacaoCod != other.qualificacaoCod && (this.qualificacaoCod == null || !this.qualificacaoCod.equals(other.qualificacaoCod))) {
            return false;
        }
        if ((this.cursoPalestras == null) ? (other.cursoPalestras != null) : !this.cursoPalestras.equals(other.cursoPalestras)) {
            return false;
        }
        if ((this.anoTerminio == null) ? (other.anoTerminio != null) : !this.anoTerminio.equals(other.anoTerminio)) {
            return false;
        }
        if ((this.cargaHoraria == null) ? (other.cargaHoraria != null) : !this.cargaHoraria.equals(other.cargaHoraria)) {
            return false;
        }
        return true;
    }
    
}
