package com.balcazar.sergio.proyectosistematransporte.service;

import com.balcazar.sergio.proyectosistematransporte.repository.IDestinoRepository;
import com.balcazar.sergio.proyectosistematransporte.repository.models.Destino;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DestinoService implements IDestinoService{
    @Autowired
    private IDestinoRepository destinoRepository;


    @Override
    public void AgregarDestino(Destino destino) {
        this.destinoRepository.addDestino(destino);
    }

    @Override
    public List<Destino> ListarDestinos() {
        return this.destinoRepository.getDestinos();
    }
}
