package com.poc.domain.repository;

import org.springframework.data.neo4j.repository.GraphRepository;

import com.poc.domain.model.GraphNodeEntity;

public interface GraphNodeEntityRepository extends GraphRepository<GraphNodeEntity> {
  
}