package com.balcazar.sergio.proyectosistematransporte.repository;

import com.balcazar.sergio.proyectosistematransporte.repository.models.Bus;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;


@Repository
public class Flota implements IFlota{

    private Map<String, Bus> flotaBuses;
    private Bus bus;

    public Flota() {
        this.flotaBuses = new HashMap<String, Bus>()
        {{
            put("AAA123", new Bus("AAA123", "Sotra Retiro", 15));
            put("BBB321", new Bus("BBB321", "Sotra Uraba", 20));
            put("CCC432", new Bus("CCC432", "TCP Barbosa", 15));
        }};


    }

    @Override
    public void addBus(Bus bus) {
        this.flotaBuses.put(bus.getId(), bus);
    }

    @Override
    public Map<String, Bus> getFlota() {
        return this.flotaBuses;
    }

    @Override
    public Bus getBus(String id) {
      this.bus = flotaBuses.get(id);
      return this.bus;
    }
}
