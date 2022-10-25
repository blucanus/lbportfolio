package com.lbportfolio.lbportfolio.service;

import java.util.List;

import com.lbportfolio.lbportfolio.model.Proyectos;

public interface IProyectosService {
    public List<Proyectos> verProyectos();
    public void crearProyectos (Proyectos proy);
    public void borrarProyectos (Long id);
    public Proyectos buscarProyectos (Long id);
    public void actualizarProyectos (Proyectos proy);
}
