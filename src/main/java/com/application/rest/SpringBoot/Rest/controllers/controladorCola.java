package com.application.rest.SpringBoot.Rest.controllers;

import com.application.rest.SpringBoot.Rest.services.serviciosCola;
import com.application.rest.SpringBoot.Rest.Entities.Cola;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/UserCola")
public class controladorCola {
    @Autowired
    serviciosCola userserviceCola;

    @GetMapping
    public ArrayList<Cola> obtenerFicha(){
        return userserviceCola.obtenerFicha();
    }

    @PostMapping
    public Cola guardarFicha(@RequestBody Cola UserCola){
        return this.userserviceCola.guardarFicha(UserCola);

    }

    @GetMapping(path = "/{id}")
    public Optional<Cola> obtenerPorId(@PathVariable("id") Long id){
        return this.userserviceCola.obtenerPorId(id);
    }
    @GetMapping("/query")
    public ArrayList<Cola> obtenerPorFecha(@RequestParam("fecha") String fecha){
        return this.userserviceCola.obtenerPorFecha(fecha);
    }
    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.userserviceCola.eliminarFicha(id);
        if (ok){
            return "Se eliminó el usuario con id " + id;
        }else{
            return "No se pudo eliminar el usuario con id " + id;
        }
    }



}
