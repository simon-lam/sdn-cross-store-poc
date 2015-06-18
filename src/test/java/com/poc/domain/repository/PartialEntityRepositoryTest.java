package com.poc.domain.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.poc.PocApplication;
import com.poc.domain.model.PartialEntity;
import com.poc.domain.repository.jpa.PartialEntityRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = PocApplication.class)
public class PartialEntityRepositoryTest {
  
  @Autowired
  private PartialEntityRepository repository;
  
  @Test
  public void testPersistOperation() {
    PartialEntity node = new PartialEntity();
    repository.save(node);
  }
}