package com.lbportfolio.lbportfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lbportfolio.lbportfolio.model.Proyectos;

@Repository
public interface ProyectosRepository extends JpaRepository<Proyectos, Long>{
    
}
