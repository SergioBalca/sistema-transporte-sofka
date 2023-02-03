package com.balcazar.sergio.proyectosistematransporte.service;

import com.balcazar.sergio.proyectosistematransporte.repository.models.Pasajero;
import com.balcazar.sergio.proyectosistematransporte.repository.models.Viaje;

import java.util.List;
import java.util.Map;

public interface IViajeService {
    public Viaje registrarViaje(Viaje viaje);
    public Map<String, Viaje> listarViajes();
    public Viaje obtenerViaje(String idViaje);
    public List<Pasajero> listarPasajeros(String idViaje);
}
