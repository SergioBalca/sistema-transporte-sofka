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

    @GetMapping()
    public ResponseEntity obtenerViajes(){
        return new ResponseEntity(viajeService.ListarViajes(), HttpStatus.FOUND);
    }

    @PostMapping()
    public ResponseEntity generarViaje(@RequestBody Viaje viaje){
        return new ResponseEntity(viajeService.registrarViaje(viaje), HttpStatus.CREATED);
    }
}
