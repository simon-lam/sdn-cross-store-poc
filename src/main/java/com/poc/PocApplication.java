package com.poc;

import org.neo4j.graphdb.GraphDatabaseService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.neo4j.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.cross_store.config.CrossStoreNeo4jConfiguration;
import org.springframework.data.neo4j.rest.SpringCypherRestGraphDatabase;

@SpringBootApplication
public class PocApplication {

  @Configuration
  @EnableNeo4jRepositories(basePackages = "com.poc.domain.repository")
  @EnableJpaRepositories(basePackages = "com.poc.domain.repository.jpa")
  static class Config extends CrossStoreNeo4jConfiguration {

    public Config() {
      setBasePackage("com.poc.domain.model");
    }

    @Bean
    public GraphDatabaseService graphDatabaseService() {
      return new SpringCypherRestGraphDatabase("http://localhost:7474/db/data/", "neo4j", "neo4j");
    }
  }

  public static void main(String[] args) throws Exception {
    SpringApplication.run(PocApplication.class, args);
  }

}
