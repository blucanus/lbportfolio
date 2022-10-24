package com.lbportfolio.lbportfolio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lbportfolio.lbportfolio.model.Experiencia;
import com.lbportfolio.lbportfolio.service.IExperienciaService;

@RestController
public class ExperienciaController {

    @Autowired
    private IExperienciaService expServ;

    @PostMapping ("/new/experiencia")
    public void agregarExperiencia (@RequestBody Experiencia exp) {
        expServ.crearExperiencia(exp);
    }
    @GetMapping ("/ver/experiencias")
    public List<Experiencia> verExperiencias() {
        return expServ.verExperiencias();
    }
    @DeleteMapping("/borrarExperiencia/{id}")
    public void borrarExperiencia(@PathVariable Long id) {
        expServ.borrarExperiencia(id);
    }
    @PutMapping ("/actualizar/experiencia")
    public void actualizarExperiencia (@RequestBody Experiencia exp) {
        expServ.actualizarExperiencia(exp);
    }
    
}
