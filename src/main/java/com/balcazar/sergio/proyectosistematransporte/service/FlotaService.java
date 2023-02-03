package com.balcazar.sergio.proyectosistematransporte.service;

import com.balcazar.sergio.proyectosistematransporte.repository.IFlota;
import com.balcazar.sergio.proyectosistematransporte.repository.models.Bus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class FlotaService implements IFlotaService{
    @Autowired
    private IFlota flota;
    private Bus newBus;
    @Override
    public Bus agregarBus(Bus bus) {
        this.newBus = new Bus(bus.getId(), bus.getEmpresa(), bus.getCapacidadPasajeros());
        flota.addBus(newBus);
        return newBus;
    }

    @Override
    public Map<String, Bus> listarBuses() {
        return flota.getFlota();
    }
}
