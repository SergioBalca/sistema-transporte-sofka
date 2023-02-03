package com.balcazar.sergio.proyectosistematransporte.service;

import com.balcazar.sergio.proyectosistematransporte.repository.IDestinoRepository;
import com.balcazar.sergio.proyectosistematransporte.repository.models.Destino;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class DestinoService implements IDestinoService{
    @Autowired
    private IDestinoRepository destinoRepository;
    private Destino newDestino;

    @Override
    public Destino agregarDestino(Destino destino) {
        this.newDestino = new Destino(destino.getId(), destino.getNombre());
        destinoRepository.addDestino(destino);
        return this.newDestino;
    }

    @Override
    public List<Destino> listarDestinos() {
        return destinoRepository.getDestinos();
    }
}
