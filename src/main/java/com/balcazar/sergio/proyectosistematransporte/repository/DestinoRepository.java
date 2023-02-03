package com.balcazar.sergio.proyectosistematransporte.repository;

import com.balcazar.sergio.proyectosistematransporte.repository.IDestinoRepository;
import com.balcazar.sergio.proyectosistematransporte.repository.models.Destino;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Repository
public class DestinoRepository implements IDestinoRepository {

    private List<Destino> destinos;

    public DestinoRepository() {
        this.destinos = new ArrayList<>(List.of
                (
                    new Destino("300", "Rionegro"),
                    new Destino("400", "Sopetran"),
                    new Destino("500", "Barbosa")
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
