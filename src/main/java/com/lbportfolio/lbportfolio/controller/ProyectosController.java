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

import com.lbportfolio.lbportfolio.model.Proyectos;
import com.lbportfolio.lbportfolio.service.IProyectosService;

@RestController
public class ProyectosController {

    @Autowired
    private IProyectosService proyServ;

    @PostMapping ("/new/proyectos")
    public void agregarProyectos (@RequestBody Proyectos proy) {
        proyServ.crearProyectos(proy);
    }
    @GetMapping ("/ver/proyectos")
    public List<Proyectos> verProyectos() {
        return proyServ.verProyectos();
    }
    @DeleteMapping("/borrarProyectos/{id}")
    public void borrarProyectos(@PathVariable Long id) {
        proyServ.borrarProyectos(id);
    }
    @PutMapping ("/actualizar/proyectos")
    public void actualizarProyectos (@RequestBody Proyectos proy) {
        proyServ.actualizarProyectos(proy);
    }
    
}
