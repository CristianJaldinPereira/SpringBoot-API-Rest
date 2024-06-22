package com.application.rest.SpringBoot.Rest.controllers;

import com.application.rest.SpringBoot.Rest.Entities.Cita;
import com.application.rest.SpringBoot.Rest.services.serviciosCita;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/UserCita")
public class controladorCita {
    @Autowired
    serviciosCita userserviceCita;

    @GetMapping
    public ArrayList<Cita> obtenerCita(){
        return userserviceCita.obtenerCita();
    }

    @PostMapping
    public Cita guardarCita(@RequestBody Cita UserCita){
        return this.userserviceCita.guardarCita(UserCita);

    }

    @GetMapping(path = "/{id}")
    public Optional<Cita> obtenerPorId(@PathVariable("id") Long id){
        return this.userserviceCita.obtenerPorId(id);
    }
    @GetMapping("/query")
    public ArrayList<Cita> obtenerPorMotivo(@RequestParam("motivo") String motivo){
        return this.userserviceCita.obtenerPorMotivo(motivo);
    }
    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.userserviceCita.eliminarCita(id);
        if (ok){
            return "Se eliminó el usuario con id " + id;
        }else{
            return "No se pudo eliminar el usuario con id " + id;
        }
    }



}
