package com.lbportfolio.lbportfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titulo;
    private String bio;

    public Educacion() {}

    public Educacion (Long id, String titulo, String bio) {
        this.id = id;
        this.titulo = titulo;
        this.bio = bio;
    }

}
