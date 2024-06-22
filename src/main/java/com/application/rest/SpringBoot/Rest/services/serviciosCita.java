package com.application.rest.SpringBoot.Rest.services;
import java.time.LocalDateTime;
import java.util.ArrayList;
import com.application.rest.SpringBoot.Rest.Entities.Cita;

import java.util.Optional;


import com.application.rest.SpringBoot.Rest.repositories.repositorioCita;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class serviciosCita {
    @Autowired
    repositorioCita userepositorioCita;

    public ArrayList<Cita> obtenerCita(){
        return (ArrayList<Cita>)userepositorioCita.findAll();
    }

    public Cita guardarCita(Cita UserCita){
        return userepositorioCita.save(UserCita);
    }
    public Optional<Cita> obtenerPorId(Long id){
        return userepositorioCita.findById(id);
    }

    public ArrayList<Cita> obtenerPorMotivo(String motivo){
        return userepositorioCita.findByMotivo(String.join(motivo));
    }
    public boolean eliminarCita(Long id) {
        try {
            userepositorioCita.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}

