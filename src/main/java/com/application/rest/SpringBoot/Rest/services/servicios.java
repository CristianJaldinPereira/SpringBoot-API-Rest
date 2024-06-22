package com.application.rest.SpringBoot.Rest.services;
import java.util.ArrayList;
import com.application.rest.SpringBoot.Rest.Entities.Paciente;

import java.util.Optional;


import com.application.rest.SpringBoot.Rest.repositories.repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class servicios {
@Autowired
repositorio userepositorio;

public ArrayList<Paciente> obtenerPacientes(){
    return (ArrayList<Paciente>)userepositorio.findAll();
  }

  public Paciente guardarPaciente(Paciente UserPaciente){
    return userepositorio.save(UserPaciente);
  }
  public Optional<Paciente> obtenerPorId(Long id){
    return userepositorio.findById(id);
  }

  public ArrayList<Paciente> obtenerPorNombre(String nombre){
    return userepositorio.findByNombre(nombre);
  }
  public boolean eliminarPaciente(Long id) {
      try {
          userepositorio.deleteById(id);
          return true;
      } catch (Exception err) {
          return false;
      }
  }
}

