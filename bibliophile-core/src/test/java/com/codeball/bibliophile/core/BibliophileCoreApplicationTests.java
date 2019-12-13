package com.codeball.bibliophile.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=BibliophileCoreApplication.class)
class BibliophileCoreApplicationTests {

	@Autowired
	private GenericEntityRepository genericEntityRepository;
	
	@Test
	public void givenGenericEntityRepository_whenSaveAndRetrieveEntity_thenOK() {
		var genericEntity = genericEntityRepository.save(new GenericEntity("test"));
		var foundEntity = genericEntityRepository.findById(genericEntity.getId());
		
		assertNotNull(foundEntity);
		assertEquals(genericEntity.getValue(), foundEntity.get().getValue());
	}

}
