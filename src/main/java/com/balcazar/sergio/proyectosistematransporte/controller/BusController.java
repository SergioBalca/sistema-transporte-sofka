package com.balcazar.sergio.proyectosistematransporte.controller;

import com.balcazar.sergio.proyectosistematransporte.repository.models.Bus;
import com.balcazar.sergio.proyectosistematransporte.service.IFlotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/rest/buses")
public class BusController {
    @Autowired
    private IFlotaService flotaService;

    @GetMapping()
    public ResponseEntity obtenerBuses(){
        return new ResponseEntity(flotaService.ListarBuses(), HttpStatus.FOUND);
    }

    @PostMapping
    public ResponseEntity registrarBus(@RequestBody Bus bus){
        return new ResponseEntity(flotaService.agregarBus(bus), HttpStatus.CREATED);
    }
}
