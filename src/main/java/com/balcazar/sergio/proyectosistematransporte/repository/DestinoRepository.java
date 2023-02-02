package com.balcazar.sergio.proyectosistematransporte.repository;

import com.balcazar.sergio.proyectosistematransporte.repository.IDestinoRepository;
import com.balcazar.sergio.proyectosistematransporte.repository.models.Destino;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DestinoRepository implements IDestinoRepository {

    private List<Destino> destinos;

    public DestinoRepository() {
        this.destinos = new ArrayList<>(List.of
                (
                    new Destino(UUID.randomUUID().toString(), "Rionegro"),
                    new Destino(UUID.randomUUID().toString(), "Sopetran"),
                    new Destino(UUID.randomUUID().toString(), "Barbosa")
                ));
    }

    @Override
    public void addDestino(Destino destino) {
        this.destinos.add(destino);
    }

    @Override
    public List<Destino> getDestinos() {
        return this.destinos;
    }
}
