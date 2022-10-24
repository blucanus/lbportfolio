package com.lbportfolio.lbportfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String titulo;
    private String logo;
    private String fecha;
    private String bio;
    private String url;

    public Experiencia() {}

    public Experiencia(Long id, String titulo, String logo, String fecha, String bio, String url) {
        this.id = id;
        this.titulo = titulo;
        this.logo = logo;
        this.fecha = fecha;
        this.bio = bio;
        this.url = url;
    }

}
