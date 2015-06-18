package com.poc.domain.repository;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.poc.PocApplication;
import com.poc.domain.model.PartialEntity;
import com.poc.domain.repository.jpa.PartialEntityRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = PocApplication.class)
@IntegrationTest 
public class PartialEntityRepositoryTest {
  
  @Autowired
  private PartialEntityRepository repository;
  
  @Test
  @Transactional
  public void testPersistOperation() {
    PartialEntity node = new PartialEntity();
    node = repository.save(node);
    assertNotNull(node.getId());
  }
}