package com.application.rest.SpringBoot.Rest.repositories;

import com.application.rest.SpringBoot.Rest.Entities.Medico;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;

@Repository
public interface repositorioMedico extends CrudRepository<Medico, Long> {
    public abstract ArrayList<Medico> findByNombre(String nombre);
}
