package com.application.rest.SpringBoot.Rest.services;
import java.time.LocalDateTime;
import java.util.ArrayList;
import com.application.rest.SpringBoot.Rest.Entities.Cola;

import java.util.Optional;


import com.application.rest.SpringBoot.Rest.repositories.repositorioCola;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class serviciosCola {
    @Autowired
    repositorioCola userepositorioCola;

    public ArrayList<Cola> obtenerFicha(){
        return (ArrayList<Cola>)userepositorioCola.findAll();
    }

    public Cola guardarFicha(Cola UserFicha){
        return userepositorioCola.save(UserFicha);
    }
    public Optional<Cola> obtenerPorId(Long id){
        return userepositorioCola.findById(id);
    }

    public ArrayList<Cola> obtenerPorFecha(String fechaHora){
        return userepositorioCola.findByFechaHora(LocalDateTime.parse (fechaHora));
    }
    public boolean eliminarFicha(Long id) {
        try {
            userepositorioCola.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}

