package com.backend.infrastructure.adapter;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TechnicianEntity {

    @Id
    String id;
    String nombre;
}
