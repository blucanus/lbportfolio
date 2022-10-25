package com.lbportfolio.lbportfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyectos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String tipo;
    private String titulo;
    private String texto;
    private String url;

    public Proyectos() {}

    public Proyectos(Long id, String tipo, String titulo, String texto, String url) {
        this.id = id;
        this.tipo = tipo;
        this.titulo = titulo;
        this.texto = texto;
        this.url = url;
    }

}
