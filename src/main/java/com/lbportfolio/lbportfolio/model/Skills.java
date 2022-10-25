package com.lbportfolio.lbportfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Skills {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombre;
    private int porcentaje;

    public Skills() {}

    public Skills(Long id, String nombre, int porcentaje){
        this.id = id;
        this.nombre = nombre;
        this.porcentaje = porcentaje;
    }

}
