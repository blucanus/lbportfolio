package com.lbportfolio.lbportfolio.service;

import java.util.List;

import com.lbportfolio.lbportfolio.model.Experiencia;

public interface IExperienciaService {
    public List<Experiencia> verExperiencias();
    public void crearExperiencia (Experiencia exp);
    public void borrarExperiencia (Long id);
    public Experiencia buscarExperiencia (Long id);
    public void actualizarExperiencia (Experiencia exp);
}
