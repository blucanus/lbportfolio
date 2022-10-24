package com.lbportfolio.lbportfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lbportfolio.lbportfolio.model.Educacion;
import com.lbportfolio.lbportfolio.repository.EducacionRepository;

@Service
public class EducacionService implements IEducacionService {

    @Autowired EducacionRepository eduRepo;

    @Override
    public void actualizarEducacion(Educacion edu) {
        eduRepo.save(edu);
        
    }

    @Override
    public void borrarEducacion(Long id) {
       eduRepo.deleteById(id);
        
    }

    @Override
    public Educacion buscarEducacion(Long id) {
        return eduRepo.findById(id).orElse(null);
    }

    @Override
    public void crearEducacion(Educacion edu) {
        eduRepo.save(edu);
        
    }

    @Override
    public List<Educacion> verEducacion() {
        return eduRepo.findAll();
    }
    
}
