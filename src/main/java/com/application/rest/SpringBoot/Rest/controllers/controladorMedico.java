package com.application.rest.SpringBoot.Rest.controllers;

import com.application.rest.SpringBoot.Rest.services.serviciosMedico;
import com.application.rest.SpringBoot.Rest.Entities.Medico;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/UserMedico")
public class controladorMedico {
    @Autowired
    serviciosMedico userserviceMedico;

    @GetMapping
    public ArrayList<Medico> obtenerMedico(){
        return userserviceMedico.obtenerMedico();
    }

    @PostMapping
    public Medico guardarMedico(@RequestBody Medico UserMedico){
        return this.userserviceMedico.guardarMedico(UserMedico);

    }

    @GetMapping(path = "/{id}")
    public Optional<Medico> obtenerPorId(@PathVariable("id") Long id){
        return this.userserviceMedico.obtenerPorId(id);
    }
    @GetMapping("/query")
    public ArrayList<Medico> obtenerPorNombre(@RequestParam("nombre") String nombre){
        return this.userserviceMedico.obtenerPorNombre(nombre);
    }
    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.userserviceMedico.eliminarMedico(id);
        if (ok){
            return "Se eliminó el usuario con id " + id;
        }else{
            return "No se pudo eliminar el usuario con id " + id;
        }
    }



}
