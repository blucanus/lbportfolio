package com.lbportfolio.lbportfolio.Security.Dto;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

public class JwtDto {
    
    private String token;
    private String bearer = "Bearer";
    private String nombreUsuario;
    private Collection<? extends GrantedAuthority> authorities;
    
    
    public JwtDto() {
    }


    public JwtDto(String token, String bearer, String nombreUsuario,
            Collection<? extends GrantedAuthority> authorities) {
        this.token = token;
        this.bearer = bearer;
        this.nombreUsuario = nombreUsuario;
        this.authorities = authorities;
    }

    

}
