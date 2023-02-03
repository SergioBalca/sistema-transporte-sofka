package com.balcazar.sergio.proyectosistematransporte.controller;

import com.balcazar.sergio.proyectosistematransporte.repository.models.Viaje;
import com.balcazar.sergio.proyectosistematransporte.service.IViajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/rest/viajes")
public class ViajeController {
    @Autowired
    private IViajeService viajeService;

    // GET Request para obtener los viajes registrados
    @GetMapping()
    public ResponseEntity obtenerViajes(){
        return new ResponseEntity(viajeService.listarViajes(), HttpStatus.FOUND);
    }

    // Post Request para registrar un Viaje
    @PostMapping()
    public ResponseEntity generarViaje(@RequestBody Viaje viaje){
        return new ResponseEntity(viajeService.registrarViaje(viaje), HttpStatus.CREATED);
    }

    // Get Request para obtener la lista de pasajeros en un Viaje
    @GetMapping("/{viajeId}/pasajeros")
    public ResponseEntity obtenerPasajerosViaje(@PathVariable("viajeId") String id){
        return new ResponseEntity(viajeService.listarPasajeros(id), HttpStatus.FOUND);
    }

    // Get Request para obtener un Viaje en específico
    @GetMapping("/{viajeId}")
    public ResponseEntity obtenerViaje(@PathVariable("viajeId") String id){
        return new ResponseEntity(viajeService.obtenerViaje(id), HttpStatus.FOUND);
    }
}
