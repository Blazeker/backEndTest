package com.backend.infrastructure.adapter;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceEntityRepository extends JpaRepository<ServiceEntity, String> {
}
