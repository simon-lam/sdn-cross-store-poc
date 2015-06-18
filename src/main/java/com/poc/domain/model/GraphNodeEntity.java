package com.poc.domain.model;

import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;

@NodeEntity
public class GraphNodeEntity {

  @GraphId
  Long id;
  public String name;

  public GraphNodeEntity() {}

  public GraphNodeEntity(String name) {
    this.name = name;
  }

}
