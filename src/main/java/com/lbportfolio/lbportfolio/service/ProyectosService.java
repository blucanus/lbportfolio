package com.lbportfolio.lbportfolio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lbportfolio.lbportfolio.model.Proyectos;
import com.lbportfolio.lbportfolio.repository.ProyectosRepository;

@Service
public class ProyectosService implements IProyectosService {

    @Autowired
    public ProyectosRepository proyRepo;

    @Override
    public void actualizarProyectos(Proyectos proy) {
        proyRepo.save(proy);        
    }

    @Override
    public void borrarProyectos(Long id) {
        proyRepo.deleteById(id);        
    }

    @Override
    public Proyectos buscarProyectos(Long id) {
        return proyRepo.findById(id).orElse(null);
    }

    @Override
    public void crearProyectos(Proyectos proy) {
        proyRepo.save(proy);        
    }

    @Override
    public List<Proyectos> verProyectos() {
        return proyRepo.findAll();
    }

    
}
