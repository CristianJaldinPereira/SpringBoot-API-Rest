package com.application.rest.SpringBoot.Rest.controllers;

import com.application.rest.SpringBoot.Rest.services.servicios;
import com.application.rest.SpringBoot.Rest.Entities.Paciente;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/UserPaciente")
public class controlador {
 @Autowired
    servicios userservice;

 @GetMapping
    public ArrayList<Paciente> obtenerPacientes(){
        return userservice.obtenerPacientes();
    }

    @PostMapping
    public Paciente guardarPaciente(@RequestBody Paciente UserPaciente){
        return this.userservice.guardarPaciente(UserPaciente);

    }

    @GetMapping(path = "/{id}")
    public Optional<Paciente> obtenerPorId(@PathVariable("id") Long id){
        return this.userservice.obtenerPorId(id);
    }
    @GetMapping("/query")
    public ArrayList<Paciente> obtenerPorNombre(@RequestParam("nombre") String nombre){
        return this.userservice.obtenerPorNombre(nombre);
    }
    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.userservice.eliminarPaciente(id);
        if (ok){
            return "Se eliminó el usuario con id " + id;
        }else{
            return "No se pudo eliminar el usuario con id " + id;
        }
    }



}
