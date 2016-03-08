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
@Table(name = "Informacao_Adicional")
public class InformacaoAdicional implements EntityInterface<InformacaoAdicional>{

    @Id
    @GeneratedValue
    @Column(name = "Inform_Cod")
    private Integer informCod;
    
    @Column(name = "Inform_inform")
    private String informacao;

    public Integer getInformCod() {
        return informCod;
    }

    public void setInformCod(Integer informCod) {
        this.informCod = informCod;
    }

    public String getInformacao() {
        return informacao;
    }

    public void setInformacao(String informacao) {
        this.informacao = informacao;
    }
    
    
    @Override
    public Serializable getId() {
        return this.getInformCod();
    }

    @Override
    public String getLabel() {
        return this.getInformacao();
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
    public int compareTo(InformacaoAdicional o) {
        return this.getInformCod().compareTo(o.getInformCod());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (this.informCod != null ? this.informCod.hashCode() : 0);
        hash = 37 * hash + (this.informacao != null ? this.informacao.hashCode() : 0);
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
        final InformacaoAdicional other = (InformacaoAdicional) obj;
        if (this.informCod != other.informCod && (this.informCod == null || !this.informCod.equals(other.informCod))) {
            return false;
        }
        if ((this.informacao == null) ? (other.informacao != null) : !this.informacao.equals(other.informacao)) {
            return false;
        }
        return true;
    }
    
    
    
}
