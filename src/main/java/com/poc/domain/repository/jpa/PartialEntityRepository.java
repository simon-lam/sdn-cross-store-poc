package com.poc.domain.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poc.domain.model.PartialEntity;

public interface PartialEntityRepository extends JpaRepository<PartialEntity, Long> {
  
}