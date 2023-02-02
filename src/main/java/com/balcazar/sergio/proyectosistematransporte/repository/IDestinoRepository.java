package com.balcazar.sergio.proyectosistematransporte.repository;

import com.balcazar.sergio.proyectosistematransporte.repository.models.Destino;

import java.util.List;

public interface IDestinoRepository {
    public void addDestino(Destino destino);
    public List<Destino> getDestinos();
    //public Destino deleteDestino(String id);
}
