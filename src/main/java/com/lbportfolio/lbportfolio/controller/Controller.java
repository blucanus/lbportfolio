
package com.lbportfolio.lbportfolio.controller;


//import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.lbportfolio.lbportfolio.model.Persona;
import com.lbportfolio.lbportfolio.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;

@RestController
public class Controller {
    
    @Autowired
    private IPersonaService persoServ;
                    
    //List<Persona> listaPersonas = new ArrayList();

    @GetMapping ("/hola/{nombre}")
    public String decirHola(@PathVariable String nombre) {
        return "Hola, " + nombre + " volví a funcionar";
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/new/persona")
    public void agregarPersona (@RequestBody Persona pers) {
        persoServ.crearPersona(pers);
    }
    @PreAuthorize("hasRole('USER')")
    @GetMapping ("/ver/personas")
    public List<Persona> verPersonas() {
        return persoServ.verPersonas();
    }
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/borrarPersona/{id}")
    public void borrarPersona(@PathVariable Long id) {
        persoServ.borrarPersona(id);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping ("/actualizar/persona")
    public void actualizarPersona (@RequestBody Persona pers) {
        persoServ.actualizarPersona(pers);
    }
}