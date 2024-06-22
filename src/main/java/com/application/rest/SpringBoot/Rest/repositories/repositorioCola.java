package com.application.rest.SpringBoot.Rest.repositories;

import com.application.rest.SpringBoot.Rest.Entities.Cola;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;

@Repository
public interface repositorioCola extends CrudRepository<Cola, Long> {
    public abstract ArrayList<Cola> findByFechaHora(LocalDateTime fechaHora);
}
