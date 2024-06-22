package com.application.rest.SpringBoot.Rest.Entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Table(name = "Medico")
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "especialidad", nullable = false, length = 100)
    private String especialidad;

    @Column(name = "telefono", length = 15)
    private String telefono;
}
