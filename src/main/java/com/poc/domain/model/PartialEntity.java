package com.poc.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;

@Entity
@Table(name = "partial_entity")
@NodeEntity(partial = true)
public class PartialEntity {

  @Id
  @GraphId
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id")
  Long id;

  public String name;

  public PartialEntity() {}

  public PartialEntity(String name) {
    this.name = name;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
