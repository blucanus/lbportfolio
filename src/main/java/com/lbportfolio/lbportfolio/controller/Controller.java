
package com.lbportfolio.lbportfolio.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.lbportfolio.lbportfolio.model.Persona;
import com.lbportfolio.lbportfolio.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class Controller {
    
    @Autowired
    private IPersonaService persoServ;
                    
    //List<Persona> listaPersonas = new ArrayList();

    @GetMapping ("/hola/{nombre}")
    public String decirHola(@PathVariable String nombre) {
        return "Hola, " + nombre + " volví a funcionar";
    }

    @PostMapping ("/new/persona")
    public void agregarPersona (@RequestBody Persona pers) {
        persoServ.crearPersona(pers);
    }
    @GetMapping ("/ver/personas")
    public List<Persona> verPersonas() {
        return persoServ.verPersonas();
    }
    @DeleteMapping("/borrarPersona/{id}")
    public void borrarPersona(@PathVariable Long id) {
        persoServ.borrarPersona(id);
    }
    @PutMapping ("/actualizar/persona")
    public void actualizarPersona (@RequestBody Persona pers) {
        persoServ.actualizarPersona(pers);
    }
}