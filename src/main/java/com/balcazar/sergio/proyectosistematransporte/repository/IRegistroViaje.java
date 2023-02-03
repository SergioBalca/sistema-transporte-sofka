package com.balcazar.sergio.proyectosistematransporte.repository;

import com.balcazar.sergio.proyectosistematransporte.repository.models.Bus;
import com.balcazar.sergio.proyectosistematransporte.repository.models.Pasajero;
import com.balcazar.sergio.proyectosistematransporte.repository.models.Viaje;

import java.util.List;
import java.util.Map;

public interface IRegistroViaje {
    public void addViaje(Viaje viaje);
    public Map<String, Viaje> getViajes();
    public List<Pasajero> getListaPasajeros(String idViaje);
}
