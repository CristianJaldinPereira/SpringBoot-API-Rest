package com.application.rest.SpringBoot.Rest.controllers;

import com.application.rest.SpringBoot.Rest.services.serviciosFicha;
import com.application.rest.SpringBoot.Rest.Entities.Ficha;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/UserFicha")
public class controladorFicha {
    @Autowired
    serviciosFicha userserviceFicha;

    @GetMapping
    public ArrayList<Ficha> obtenerFicha(){
        return userserviceFicha.obtenerFicha();
    }

    @PostMapping
    public Ficha guardarFicha(@RequestBody Ficha UserFicha){
        return this.userserviceFicha.guardarFicha(UserFicha);

    }

    @GetMapping(path = "/{id}")
    public Optional<Ficha> obtenerPorId(@PathVariable("id") Long id){
        return this.userserviceFicha.obtenerPorId(id);
    }
    @GetMapping("/query")
    public ArrayList<Ficha> obtenerPorFecha(@RequestParam("fecha") String fecha){
        return this.userserviceFicha.obtenerPorFecha(fecha);
    }
    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.userserviceFicha.eliminarFicha(id);
        if (ok){
            return "Se eliminó el usuario con id " + id;
        }else{
            return "No se pudo eliminar el usuario con id " + id;
        }
    }



}
