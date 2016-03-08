/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferasweb.curriculoonline.model.entity;

import com.ferasweb.curriculoonline.model.commons.EntityInterface;
import com.ferasweb.curriculoonline.model.enumerated.EnumTipoFormacao;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Aluno
 */
@Entity
@Table(name = "Formacao")
public class Formacao implements EntityInterface<Formacao>{
    
    @Id
    @GeneratedValue
    @Column(name = "Formacao_Cod")
    private Integer formacaoCod;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "Formacao_Tipo")
    private EnumTipoFormacao tipoFormacao;
    
    @Column(name = "Formacao_Curso")
    private String curso;
    
    @Column(name = "Formacao_Instituicao")
    private String instituicao;

    public Integer getFormacaoCod() {
        return formacaoCod;
    }

    public void setFormacaoCod(Integer formacaoCod) {
        this.formacaoCod = formacaoCod;
    }

    public EnumTipoFormacao getTipoFormacao() {
        return tipoFormacao;
    }

    public void setTipoFormacao(EnumTipoFormacao tipoFormacao) {
        this.tipoFormacao = tipoFormacao;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + (this.formacaoCod != null ? this.formacaoCod.hashCode() : 0);
        hash = 17 * hash + (this.tipoFormacao != null ? this.tipoFormacao.hashCode() : 0);
        hash = 17 * hash + (this.curso != null ? this.curso.hashCode() : 0);
        hash = 17 * hash + (this.instituicao != null ? this.instituicao.hashCode() : 0);
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
        final Formacao other = (Formacao) obj;
        if (this.formacaoCod != other.formacaoCod && (this.formacaoCod == null || !this.formacaoCod.equals(other.formacaoCod))) {
            return false;
        }
        if (this.tipoFormacao != other.tipoFormacao) {
            return false;
        }
        if ((this.curso == null) ? (other.curso != null) : !this.curso.equals(other.curso)) {
            return false;
        }
        if ((this.instituicao == null) ? (other.instituicao != null) : !this.instituicao.equals(other.instituicao)) {
            return false;
        }
        return true;
    }
    
    @Override
    public Serializable getId() {
        return this.getFormacaoCod();
    }

    @Override
    public String getLabel() {
        return this.getTipoFormacao()+" - "+this.getCurso();
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
    public int compareTo(Formacao o) {
        return this.getFormacaoCod().compareTo(o.getFormacaoCod());
    }
    
}
