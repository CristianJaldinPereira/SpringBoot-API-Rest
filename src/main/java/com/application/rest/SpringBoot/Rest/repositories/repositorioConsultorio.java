package com.application.rest.SpringBoot.Rest.repositories;

import com.application.rest.SpringBoot.Rest.Entities.Consultorio;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;

@Repository
public interface repositorioConsultorio extends CrudRepository<Consultorio, Long> {
    public abstract ArrayList<Consultorio> findByNumero(Integer numero);
}
