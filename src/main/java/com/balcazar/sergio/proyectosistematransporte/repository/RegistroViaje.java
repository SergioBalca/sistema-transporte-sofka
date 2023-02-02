package com.balcazar.sergio.proyectosistematransporte.repository;

import com.balcazar.sergio.proyectosistematransporte.repository.IRegistroViaje;
import com.balcazar.sergio.proyectosistematransporte.repository.models.Pasajero;
import com.balcazar.sergio.proyectosistematransporte.repository.models.Viaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Repository
public class RegistroViaje implements IRegistroViaje {

    private Viaje viaje;
    private Map<String, Viaje> viajes;

    public RegistroViaje() {
        this.viajes = new HashMap<>();
    }

    @Override
    public void addViaje(Viaje viaje) {
        this.viajes.put(viaje.getId(), viaje);
    }

    @Override
    public Map<String, Viaje> getViajes() {
        return this.viajes;
    }

    @Override
    public List<Pasajero> getListaPasajeros(String idViaje) {
        this.viaje = this.viajes.get(idViaje);
        List<Pasajero>  pasajerosViaje = this.viaje.getPasajeros();

        return pasajerosViaje;
    }


}
