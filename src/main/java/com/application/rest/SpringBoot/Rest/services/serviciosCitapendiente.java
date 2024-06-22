package com.application.rest.SpringBoot.Rest.services;



import com.application.rest.SpringBoot.Rest.Entities.Cita;
import com.application.rest.SpringBoot.Rest.repositories.repositorioCitapendiente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
 public class serviciosCitapendiente {

    @Autowired
    private repositorioCitapendiente repositorioCitapendiente;

    public List<Cita> getCitapendiente(Long pacienteId) {
        return repositorioCitapendiente.findByPacienteIdAndFechaHoraAfter(pacienteId, LocalDateTime.now());
    }
    public List<Cita> getAllCitas() {
        return repositorioCitapendiente.findAll();
    }
}
