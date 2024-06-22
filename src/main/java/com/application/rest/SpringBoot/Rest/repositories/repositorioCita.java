package com.application.rest.SpringBoot.Rest.repositories;

import com.application.rest.SpringBoot.Rest.Entities.Cita;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import java.time.LocalDateTime;
import java.util.ArrayList;

@Repository
public interface repositorioCita extends CrudRepository<Cita, Long> {
    public abstract ArrayList<Cita> findByMotivo(String motivo);
}
