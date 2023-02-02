package com.balcazar.sergio.proyectosistematransporte.repository.models;

public abstract class MedioTransporte {
    private String id;
    private String empresa;
    private int capacidadPasajeros;

    public MedioTransporte(String id, String empresa, int capacidadPasajeros) {
        this.id = id;
        this.empresa = empresa;
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmpresa() {
        return this.empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getCapacidadPasajeros() {
        return this.capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    @Override
    public String toString() {
        return "MedioTransporte{" +
                "id='" + id + '\'' +
                ", empresa='" + empresa + '\'' +
                ", capacidadPasajeros=" + capacidadPasajeros +
                '}';
    }
}
