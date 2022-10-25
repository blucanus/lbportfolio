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

import com.lbportfolio.lbportfolio.model.Skills;
import com.lbportfolio.lbportfolio.service.ISkillsService;

@RestController
public class SkillsController {

    @Autowired 
    private ISkillsService skillsServ;

    @PostMapping ("/new/skills")
    public void agregarSkills (@RequestBody Skills skill) {
        skillsServ.crearSkills(skill);
    }
    @GetMapping ("/ver/skills")
    public List<Skills> verSkillss() {
        return skillsServ.verSkillss();
    }
    @DeleteMapping("/borrarskills/{id}")
    public void borrarSkills(@PathVariable Long id) {
        skillsServ.borrarSkills(id);
    }
    @PutMapping ("/actualizar/skills")
    public void actualizarSkills (@RequestBody Skills skill) {
        skillsServ.actualizarSkills(skill);
    }

    
}
