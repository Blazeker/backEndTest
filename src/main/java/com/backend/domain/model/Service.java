package com.backend.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Service
{
    Integer id;
    String direccion;
    String descripcion;
    String dateIni;
    String dateFin;
    Technician technicianId;
}