package com.backend.infrastructure.adapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class TechnicianServiceAdapter {
    ServiceEntityRepository serviceEntityRepository;

    TechnicianEntityRepository technicianEntityRepository;

    @Autowired
    public TechnicianServiceAdapter(ServiceEntityRepository serviceEntityRepository, TechnicianEntityRepository technicianEntityRepository) {
        this.serviceEntityRepository = serviceEntityRepository;
        this.technicianEntityRepository = technicianEntityRepository;
    }

    public void getServiceEntity(String id)
    {
        Optional<ServiceEntity> serviceEntity = serviceEntityRepository.findById(id);

    }

    public void getTechnicianEntity(String id)
    {
        Optional<TechnicianEntity> technicianEntity = technicianEntityRepository.findById(id);

    }
}
