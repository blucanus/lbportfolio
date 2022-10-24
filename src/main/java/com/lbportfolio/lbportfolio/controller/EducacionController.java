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

import com.lbportfolio.lbportfolio.model.Educacion;
import com.lbportfolio.lbportfolio.service.IEducacionService;

@RestController
public class EducacionController {

    @Autowired
    private IEducacionService eduServ;
    
    @PostMapping ("/new/educacion")
    public void agregarEducacion (@RequestBody Educacion edu) {
        eduServ.crearEducacion(edu);
    }
    @GetMapping ("/ver/educacion")
    public List<Educacion> verEducacion() {
        return eduServ.verEducacion();
    }
    @DeleteMapping("/borrarEducacion/{id}")
    public void borrarEducacion(@PathVariable Long id) {
        eduServ.borrarEducacion(id);
    }
    @PutMapping ("/actualizar/educacion")
    public void actualizarEducacion (@RequestBody Educacion edu) {
        eduServ.actualizarEducacion(edu);
    }


}
