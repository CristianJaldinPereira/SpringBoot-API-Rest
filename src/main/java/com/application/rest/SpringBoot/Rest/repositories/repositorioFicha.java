package com.application.rest.SpringBoot.Rest.repositories;

import com.application.rest.SpringBoot.Rest.Entities.Ficha;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import java.time.LocalDateTime;
import java.util.ArrayList;

@Repository
public interface repositorioFicha extends CrudRepository<Ficha, Long> {
    public abstract ArrayList<Ficha> findByFecha(LocalDateTime  fecha);
}
