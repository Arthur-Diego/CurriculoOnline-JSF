/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ferasweb.curriculoonline.security;

import com.ferasweb.curriculoonline.model.entity.Login;
import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

/**
 *
 * @author Andressa
 */
public class UsuarioSistema extends User{
    
    private static final long serialVersionUID = 1L;
    
    private Login usuario;
    
    public UsuarioSistema(Login usuario, Collection<? extends GrantedAuthority> authorities) {
        super(usuario.getLogin(), usuario.getSenha(), authorities);
        this.usuario = usuario;
    }
    
    public Login getUsuario(){
        return usuario;
    }
    
    
}
