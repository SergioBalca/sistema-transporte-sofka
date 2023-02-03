package com.balcazar.sergio.proyectosistematransporte.service;

import com.balcazar.sergio.proyectosistematransporte.repository.models.Bus;

import java.util.Map;

public interface IFlotaService {
    public Bus agregarBus(Bus bus);
    public Map<String, Bus> ListarBuses();
}
