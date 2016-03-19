/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ferasweb.curriculoonline.security;

import com.ferasweb.curriculoonline.model.dao.LoginDAO;
import com.ferasweb.curriculoonline.model.entity.Grupo;
import com.ferasweb.curriculoonline.model.entity.Login;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * Classe que fornece os detalhe de usuario
 * @author Andressa
 */
public class AppUserDetailsService implements UserDetailsService{
    
    public LoginDAO returnDAO(){
       return new LoginDAO();
    }
    
    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        returnDAO();
        Login usuario = returnDAO().findUserByLogin(login);
        UsuarioSistema user = null;
        
        if(usuario != null){
          user = new UsuarioSistema(usuario, getGrupos(usuario));
        }        
        return user;
    }

    private Collection<? extends GrantedAuthority> getGrupos(Login usuario) {
        List<SimpleGrantedAuthority> authorites = new ArrayList<>();
        for(Grupo grupo : usuario.getGrupos()){
            authorites.add(new SimpleGrantedAuthority(grupo.getNome().toUpperCase()));
        }
        return authorites;
    }
    
}
