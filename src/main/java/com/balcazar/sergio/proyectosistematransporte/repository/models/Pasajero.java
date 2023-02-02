package com.balcazar.sergio.proyectosistematransporte.repository.models;

public class Pasajero extends Persona{

    public Pasajero(String id, String nombre, String telefono) {
        super(id, nombre, telefono);
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
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public String getTelefono() {
        return super.getTelefono();
    }

    @Override
    public void setTelefono(String telefono) {
        super.setTelefono(telefono);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
