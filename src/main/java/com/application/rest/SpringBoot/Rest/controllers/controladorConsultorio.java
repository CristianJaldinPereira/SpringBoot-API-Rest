package com.application.rest.SpringBoot.Rest.controllers;

import com.application.rest.SpringBoot.Rest.services.serviciosConsultorio  ;
import com.application.rest.SpringBoot.Rest.Entities.Consultorio;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/UserConsultorio")
public class controladorConsultorio {
    @Autowired
    serviciosConsultorio userserviceConsultorio;

    @GetMapping
    public ArrayList<Consultorio> obtenerConsultorio(){
        return userserviceConsultorio.obtenerConsultorio();
    }

    @PostMapping
    public Consultorio guardarConsultorio(@RequestBody Consultorio UserConsultorio){
        return this.userserviceConsultorio.guardarConsultorio(UserConsultorio);

    }

    @GetMapping(path = "/{id}")
    public Optional<Consultorio> obtenerPorId(@PathVariable("id") Long id){
        return this.userserviceConsultorio.obtenerPorId(id);
    }
    @GetMapping("/query")
    public ArrayList<Consultorio> obtenerPorNumero(@RequestParam("numero") String numero){
        return this.userserviceConsultorio.obtenerPorNumero(numero);
    }
    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.userserviceConsultorio.eliminarConsultorio(id);
        if (ok){
            return "Se eliminó el usuario con id " + id;
        }else{
            return "No se pudo eliminar el usuario con id " + id;
        }
    }



}
