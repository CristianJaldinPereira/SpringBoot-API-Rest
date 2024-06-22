package com.application.rest.SpringBoot.Rest.services;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.time.LocalDateTime;

import com.application.rest.SpringBoot.Rest.Entities.Pago;

import java.util.Optional;


import com.application.rest.SpringBoot.Rest.repositories.repositorioPago;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class serviciosPago {
    @Autowired
    repositorioPago userepositorioPago;

    public ArrayList<Pago> obtenerPago(){
        return (ArrayList<Pago>)userepositorioPago.findAll();
    }

    public Pago guardarPago(Pago UserPago){
        return userepositorioPago.save(UserPago);
    }
    public Optional<Pago> obtenerPorId(Long id){
        return userepositorioPago.findById(id);
    }

    public ArrayList<Pago> obtenerPorNombre(String nombre){
        return userepositorioPago.findByMonto(BigDecimal.valueOf(Double.parseDouble(nombre)));
    }
    public boolean eliminarPago(Long id) {
        try {
            userepositorioPago.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }

    public ArrayList<Pago> obtenerPorFecha(LocalDateTime fecha){
        return userepositorioPago.findByFecha(fecha);
    }


}

