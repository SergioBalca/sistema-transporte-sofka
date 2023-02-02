package com.balcazar.sergio.proyectosistematransporte.repository;

import com.balcazar.sergio.proyectosistematransporte.repository.models.Bus;

import java.util.List;

public interface IFlota {
    public void addBus(Bus bus);
    public List<Bus> getFlota();
}
