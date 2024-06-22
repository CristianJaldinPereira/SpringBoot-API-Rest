package com.application.rest.SpringBoot.Rest.controllers;

import com.application.rest.SpringBoot.Rest.Entities.Cita;
import com.application.rest.SpringBoot.Rest.services.serviciosCitapendiente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Citapendiente")
public class controladorCitapendiente {

    @Autowired
    private serviciosCitapendiente serviciosCitapendiente;

    @GetMapping("/{pacienteId}")
    public List<Cita> getCitapendiente(@PathVariable Long pacienteId) {
        return serviciosCitapendiente.getCitapendiente(pacienteId);
    }

    @GetMapping("/all")
    public List<Cita> getAllCitas() {
        return serviciosCitapendiente.getAllCitas();
    }
}
