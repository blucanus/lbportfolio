package com.lbportfolio.lbportfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lbportfolio.lbportfolio.model.Acercade;

@Repository
public interface AcercadeRepository extends JpaRepository<Acercade, Long>{
    
}
