package com.balcazar.sergio.proyectosistematransporte.repository;

import com.balcazar.sergio.proyectosistematransporte.repository.models.Bus;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Flota implements IFlota{

    private List<Bus> flotaBuses;

    public Flota() {
        this.flotaBuses = new ArrayList<>(List.of(
                new Bus(UUID.randomUUID().toString(), "Flota Rionegro", 10),
                new Bus(UUID.randomUUID().toString(), "SotraUraba", 15),
                new Bus(UUID.randomUUID().toString(), "TPC Barbosa", 10)
        ));
    }

    @Override
    public void addBus(Bus bus) {
        this.flotaBuses.add(bus);
    }

    @Override
    public List<Bus> getFlota() {
        return this.flotaBuses;
    }
}
