package com.application.rest.SpringBoot.Rest.repositories;

import com.application.rest.SpringBoot.Rest.Entities.Cita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface repositorioCitapendiente extends JpaRepository<Cita, Long> {
    List<Cita> findByPacienteIdAndFechaHoraAfter(Long pacienteId, LocalDateTime fechaHora);
}
