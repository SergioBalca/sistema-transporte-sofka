package com.balcazar.sergio.proyectosistematransporte.repository;

import com.balcazar.sergio.proyectosistematransporte.repository.models.Bus;

import java.util.List;
import java.util.Map;

public interface IFlota {
    public void addBus(Bus bus);
    public Map<String, Bus> getFlota();
    public Bus getBus(String id);
}
