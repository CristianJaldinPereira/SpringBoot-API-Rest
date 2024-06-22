package com.application.rest.SpringBoot.Rest.repositories;

import com.application.rest.SpringBoot.Rest.Entities.Pago;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;

@Repository
public interface repositorioPago extends CrudRepository<Pago, Long> {
    public abstract ArrayList<Pago> findByMonto(BigDecimal monto);
    ArrayList<Pago> findByFecha(LocalDateTime fecha);
}
