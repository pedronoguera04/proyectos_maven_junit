package com.endes.servicio;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.endes.dao.ProductDAO;

class ProductManagerImplTest {
	
	private ProductManager productManager;
	private ProductDAO productDAOMock;
	
	@BeforeEach
	void setUp() throws Exception {
		productDAOMock = mock(ProductDAO.class);
		productManager = new ProductManagerImpl(productDAOMock);
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
