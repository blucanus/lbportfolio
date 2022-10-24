package com.lbportfolio.lbportfolio.service;

import java.util.List;

import com.lbportfolio.lbportfolio.model.Acercade;

public interface IAcercadeService {
    public void crearAcercade(Acercade bio);
    public List<Acercade> verAcercade();
    public void borrarAcerca(Long id);
    public void actualizarAcercade(Acercade bio);
}
