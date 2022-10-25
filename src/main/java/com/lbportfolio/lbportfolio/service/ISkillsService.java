package com.lbportfolio.lbportfolio.service;

import java.util.List;

import com.lbportfolio.lbportfolio.model.Skills;

public interface ISkillsService {
    public List<Skills> verSkillss();
    public void crearSkills (Skills ski);
    public void borrarSkills (Long id);
    public Skills buscarSkills (Long id);
    public void actualizarSkills (Skills ski);
}
