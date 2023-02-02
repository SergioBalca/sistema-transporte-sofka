package com.balcazar.sergio.proyectosistematransporte.repository;

public class Bus extends MedioTransporte{
    public Bus(String id, String empresa, int cantidadPasajeros) {
        super(id,empresa,cantidadPasajeros);
    }

    @Override
    public String getId() {
        return super.getId();
    }

    @Override
    public void setId(String id) {
        super.setId(id);
    }

    @Override
    public String getEmpresa() {
        return super.getEmpresa();
    }

    @Override
    public void setEmpresa(String empresa) {
        super.setEmpresa(empresa);
    }

    @Override
    public int getCapacidadPasajeros() {
        return super.getCapacidadPasajeros();
    }

    @Override
    public void setCapacidadPasajeros(int capacidadPasajeros) {
        super.setCapacidadPasajeros(capacidadPasajeros);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
