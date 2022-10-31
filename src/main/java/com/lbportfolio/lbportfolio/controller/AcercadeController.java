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

import com.lbportfolio.lbportfolio.model.Acercade;
import com.lbportfolio.lbportfolio.service.IAcercadeService;
import org.springframework.security.access.prepost.PreAuthorize;

@RestController
public class AcercadeController {

    @Autowired
    public IAcercadeService acercaServ;

    @PostMapping ("/new/acercade")
    public void agregarAcerca (@RequestBody Acercade bio) {
        acercaServ.crearAcercade(bio);
    }
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping ("/ver/acercade")
    public List<Acercade> verAcercade() {
        return acercaServ.verAcercade();
    }
    @DeleteMapping("/borrarAcercade/{id}")
    public void borrarAcercade(@PathVariable Long id) {
        acercaServ.borrarAcerca(id);
    }
    @PutMapping ("/actualizar/acercade")
    public void actualizarAcercade (@RequestBody Acercade bio) {
        acercaServ.actualizarAcercade(bio);
    }
}