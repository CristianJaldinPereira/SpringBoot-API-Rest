package com.application.rest.SpringBoot.Rest.services;
import java.util.ArrayList;
import com.application.rest.SpringBoot.Rest.Entities.Consultorio;

import java.util.Optional;


import com.application.rest.SpringBoot.Rest.repositories.repositorioConsultorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class serviciosConsultorio {
    @Autowired
    repositorioConsultorio userepositorioConsultorio;

    public ArrayList<Consultorio> obtenerConsultorio(){
        return (ArrayList<Consultorio>)userepositorioConsultorio.findAll();
    }

    public Consultorio guardarConsultorio(Consultorio UserConsultorio){
        return userepositorioConsultorio.save(UserConsultorio);
    }
    public Optional<Consultorio> obtenerPorId(Long id){
        return userepositorioConsultorio.findById(id);
    }

    public ArrayList<Consultorio> obtenerPorNumero(String numero){
        return userepositorioConsultorio.findByNumero(Integer.parseInt (numero));
    }
    public boolean eliminarConsultorio(Long id) {
        try {
            userepositorioConsultorio.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}

