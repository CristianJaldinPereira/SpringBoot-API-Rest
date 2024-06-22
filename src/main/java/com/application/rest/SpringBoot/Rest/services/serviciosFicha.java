package com.application.rest.SpringBoot.Rest.services;
import java.time.LocalDateTime;
import java.util.ArrayList;
import com.application.rest.SpringBoot.Rest.Entities.Ficha;

import java.util.Optional;


import com.application.rest.SpringBoot.Rest.repositories.repositorioFicha;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class serviciosFicha {
    @Autowired
    repositorioFicha userepositorioFicha;

    public ArrayList<Ficha> obtenerFicha(){
        return (ArrayList<Ficha>)userepositorioFicha.findAll();
    }

    public Ficha guardarFicha(Ficha UserFicha){
        return userepositorioFicha.save(UserFicha);
    }
    public Optional<Ficha> obtenerPorId(Long id){
        return userepositorioFicha.findById(id);
    }

    public ArrayList<Ficha> obtenerPorFecha(String fecha){
        return userepositorioFicha.findByFecha(LocalDateTime.parse (fecha));
    }
    public boolean eliminarFicha(Long id) {
        try {
            userepositorioFicha.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}

