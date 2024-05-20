package com.backend.infrastructure.adapter;

import jakarta.persistence.Entity;

@Entity
public class ServiceEntity {

    Integer id;
    String direccion;
    String descripcion;
    String dateIni;
    String dateFin;
    TechnicianEntity technicianId;
}
