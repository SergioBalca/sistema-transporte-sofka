package com.balcazar.sergio.proyectosistematransporte.service;

import com.balcazar.sergio.proyectosistematransporte.repository.models.Viaje;

import java.util.Map;

public interface IViajeService {
    public Viaje registrarViaje(Viaje viaje);
    public Map<String, Viaje> ListarViajes();
}
