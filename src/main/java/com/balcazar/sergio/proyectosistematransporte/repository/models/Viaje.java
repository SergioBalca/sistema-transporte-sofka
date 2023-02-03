package com.balcazar.sergio.proyectosistematransporte.repository.models;

import java.util.List;

public class Viaje {
    private String id;
    private String horaSalida;
    private Bus bus;
    private Destino destino;
    private List<Pasajero> pasajeros;

    public Viaje(String id, String horaSalida, Bus bus, Destino destino, List<Pasajero> pasajeros) {
        this.id = id;
        this.horaSalida = horaSalida;
        this.bus = bus;
        this.destino = destino;
        this.pasajeros = pasajeros;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHoraSalida() {
        return this.horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Bus getBus() {
        return this.bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public Destino getDestino() {
        return this.destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public List<Pasajero> getPasajeros() {
        return this.pasajeros;
    }

    public void setPasajeros(List<Pasajero> pasajeros) {
        if (pasajeros.size() <= this.bus.getCapacidadPasajeros())
            this.pasajeros = pasajeros;
        else
            this.pasajeros = pasajeros.subList(0, this.bus.getCapacidadPasajeros());
    }

    @Override
    public String toString() {
        return "Viaje{" +
                "id='" + id + '\'' +
                ", horaSalida='" + horaSalida + '\'' +
                ", bus=" + bus +
                ", destino=" + destino +
                ", pasajeros=" + pasajeros +
                '}';
    }
}
