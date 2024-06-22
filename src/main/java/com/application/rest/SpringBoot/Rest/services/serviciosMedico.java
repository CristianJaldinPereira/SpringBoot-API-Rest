package com.application.rest.SpringBoot.Rest.services;
import java.util.ArrayList;
import com.application.rest.SpringBoot.Rest.Entities.Medico;

import java.util.Optional;


import com.application.rest.SpringBoot.Rest.repositories.repositorioMedico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class serviciosMedico {
    @Autowired
    repositorioMedico userepositorioMedico;

    public ArrayList<Medico> obtenerMedico(){
        return (ArrayList<Medico>)userepositorioMedico.findAll();
    }

    public Medico guardarMedico(Medico UserPaciente){
        return userepositorioMedico.save(UserPaciente);
    }
    public Optional<Medico> obtenerPorId(Long id){
        return userepositorioMedico.findById(id);
    }

    public ArrayList<Medico> obtenerPorNombre(String nombre){
        return userepositorioMedico.findByNombre(nombre);
    }
    public boolean eliminarMedico(Long id) {
        try {
            userepositorioMedico.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}

