package com.lbportfolio.lbportfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lbportfolio.lbportfolio.model.Skills;
import com.lbportfolio.lbportfolio.repository.SkillsRepository;

@Service
public class SkillsService implements ISkillsService{

    @Autowired SkillsRepository skillsRepo;

    @Override
    public void actualizarSkills(Skills ski) {
        skillsRepo.save(ski);
    }

    @Override
    public void borrarSkills(Long id) {
        skillsRepo.deleteById(id);
    }

    @Override
    public Skills buscarSkills(Long id) {
        return skillsRepo.findById(id).orElse(null);
    }

    @Override
    public void crearSkills(Skills ski) {
        skillsRepo.save(ski);
    }

    @Override
    public List<Skills> verSkillss() {
        return skillsRepo.findAll();
    }
    
}
