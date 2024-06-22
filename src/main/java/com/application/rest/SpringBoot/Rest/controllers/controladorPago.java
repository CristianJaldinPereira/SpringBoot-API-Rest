package com.application.rest.SpringBoot.Rest.controllers;

import com.application.rest.SpringBoot.Rest.services.serviciosPago;
import com.application.rest.SpringBoot.Rest.Entities.Pago;
import java.util.ArrayList;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/UserPago")
public class controladorPago {
    @Autowired
    serviciosPago userservicePago;

    @GetMapping
    public ArrayList<Pago> obtenerPago(){
        return userservicePago.obtenerPago();
    }

    @PostMapping
    public Pago guardarPago(@RequestBody Pago UserPago){
        return this.userservicePago.guardarPago(UserPago);

    }

    @GetMapping(path = "/{id}")
    public Optional<Pago> obtenerPorId(@PathVariable("id") Long id){
        return this.userservicePago.obtenerPorId(id);
    }
    @GetMapping("/query")
    public ArrayList<Pago> obtenerPorNombre(@RequestParam("nombre") String nombre){
        return this.userservicePago.obtenerPorNombre(nombre);
    }
    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.userservicePago.eliminarPago(id);
        if (ok){
            return "Se eliminó el usuario con id " + id;
        }else{
            return "No se pudo eliminar el usuario con id " + id;
        }
    }



    @GetMapping("/queryFecha")
    public ArrayList<Pago> obtenerPorFecha(@RequestParam("fecha") String fecha){
        return this.userservicePago.obtenerPorFecha(LocalDateTime.parse(fecha));
    }


}
