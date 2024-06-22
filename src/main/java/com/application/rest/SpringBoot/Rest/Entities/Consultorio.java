package com.application.rest.SpringBoot.Rest.Entities;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "Consultorio")
public class Consultorio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer numero;

    private String especialidad;

    // Constructor vacío (necesario para JPA)
    public Consultorio() {
    }

    // Constructor con todos los atributos
    public Consultorio(Integer numero, String especialidad) {
        this.numero = numero;
        this.especialidad = especialidad;
    }

}
