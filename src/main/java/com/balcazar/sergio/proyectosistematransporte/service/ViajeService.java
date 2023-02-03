package com.balcazar.sergio.proyectosistematransporte.service;

import com.balcazar.sergio.proyectosistematransporte.repository.IFlota;
import com.balcazar.sergio.proyectosistematransporte.repository.IRegistroViaje;
import com.balcazar.sergio.proyectosistematransporte.repository.models.Viaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Map;
import java.util.UUID;

@Service
public class ViajeService implements IViajeService{
    @Autowired
    private IRegistroViaje registroViaje;
    @Autowired
    private IFlota flota;
    private Viaje newViaje;


    @Override
    public Viaje registrarViaje(Viaje viaje) {
        this.newViaje = new Viaje(
                UUID.randomUUID().toString(),
                new Date().toString(),
                viaje.getBus(),
                viaje.getDestino(),
                viaje.getPasajeros());
        registroViaje.addViaje(newViaje);
        return newViaje;
    }

    @Override
    public Map<String, Viaje> ListarViajes() {
        return registroViaje.getViajes();
    }
}
