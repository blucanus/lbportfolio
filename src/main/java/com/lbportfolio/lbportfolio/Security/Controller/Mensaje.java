package com.lbportfolio.lbportfolio.Security.Controller;

import lombok.Getter;
import lombok.Setter;

public class Mensaje {
    
    @Getter @Setter
    private String mensaje;


    //constructores
    public Mensaje() {
    }

    public Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    
    
}
