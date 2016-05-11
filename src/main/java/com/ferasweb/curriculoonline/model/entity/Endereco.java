/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferasweb.curriculoonline.model.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Aluno
 */
@Embeddable
public class Endereco implements Serializable {
    
    @Column(name = "Perfil_Endereco_CEP")
    private String CEP;
            
    @Column(name = "Perfil_Endereco_Rua", nullable = false)
    private String rua;
    
    @Column(name = "Perfil_Endereco_Numero")
    private String numero;
    
    @Column(name = "Perfil_Endereco_Bairro")
    private String bairro;
    
    @Column(name = "Perfil_Endereco_Estado", nullable = false)
    private String estado;
    
    @Column(name = "Perfil_Endereco_Cidade", nullable = false)
    private String cidade;

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }
    
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + (this.rua != null ? this.rua.hashCode() : 0);
        hash = 47 * hash + (this.numero != null ? this.numero.hashCode() : 0);
        hash = 47 * hash + (this.bairro != null ? this.bairro.hashCode() : 0);
        hash = 47 * hash + (this.estado != null ? this.estado.hashCode() : 0);
        hash = 47 * hash + (this.cidade != null ? this.cidade.hashCode() : 0);
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
        final Endereco other = (Endereco) obj;
        if ((this.rua == null) ? (other.rua != null) : !this.rua.equals(other.rua)) {
            return false;
        }
        if ((this.numero == null) ? (other.numero != null) : !this.numero.equals(other.numero)) {
            return false;
        }
        if ((this.bairro == null) ? (other.bairro != null) : !this.bairro.equals(other.bairro)) {
            return false;
        }
        if ((this.estado == null) ? (other.estado != null) : !this.estado.equals(other.estado)) {
            return false;
        }
        if ((this.cidade == null) ? (other.cidade != null) : !this.cidade.equals(other.cidade)) {
            return false;
        }
        return true;
    }
    
    
}
