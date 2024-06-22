package com.application.rest.SpringBoot.Rest.repositories;

import com.application.rest.SpringBoot.Rest.Entities.Paciente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;

@Repository
public interface repositorio extends CrudRepository<Paciente, Long> {
    public abstract ArrayList<Paciente> findByNombre(String nombre);
}
