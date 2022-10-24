package com.lbportfolio.lbportfolio.service;

import java.util.List;

import com.lbportfolio.lbportfolio.model.Educacion;

public interface IEducacionService {
    public List<Educacion> verEducacion();
    public void crearEducacion (Educacion edu);
    public void borrarEducacion (Long id);
    public Educacion buscarEducacion (Long id);
    public void actualizarEducacion (Educacion edu);
}
