package com.lbportfolio.lbportfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lbportfolio.lbportfolio.model.Acercade;
import com.lbportfolio.lbportfolio.repository.AcercadeRepository;

@Service
public class AcercadeService implements IAcercadeService {

    @Autowired
    public AcercadeRepository acercaRepo;

    @Override
    public void crearAcercade(Acercade bio) {
        acercaRepo.save(bio);        
    }
    @Override
    public List<Acercade> verAcercade() {
        return acercaRepo.findAll();
    }

    @Override
    public void borrarAcerca(Long id) {
        acercaRepo.deleteById(id);
    } 
    @Override
    public void actualizarAcercade(Acercade bio) {
        acercaRepo.save(bio);
    }
    

    
}
