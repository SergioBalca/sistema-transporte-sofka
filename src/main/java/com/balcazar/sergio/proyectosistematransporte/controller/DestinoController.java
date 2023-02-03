package com.balcazar.sergio.proyectosistematransporte.controller;

import com.balcazar.sergio.proyectosistematransporte.repository.models.Destino;
import com.balcazar.sergio.proyectosistematransporte.service.IDestinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/rest/destinos")
public class DestinoController {
    @Autowired
    private IDestinoService destinoService;

    // GET Request para obtener los Destinos disponibles
    @GetMapping()
    public ResponseEntity obtenerDestinos(){
        return new ResponseEntity(destinoService.listarDestinos(), HttpStatus.FOUND);
    }

    // POST Request para registrar un nuevo Destino
    @PostMapping
    public ResponseEntity registrarDestino(@RequestBody Destino destino){

        return new ResponseEntity(destinoService.agregarDestino(destino), HttpStatus.CREATED);
    }

}
