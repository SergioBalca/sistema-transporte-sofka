package com.balcazar.sergio.proyectosistematransporte.service;

import com.balcazar.sergio.proyectosistematransporte.repository.models.Destino;

import java.util.List;

public interface IDestinoService {
    public Destino agregarDestino(Destino destino);
    public List<Destino> ListarDestinos();
}
