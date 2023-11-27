package org.java.calcolator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalcolatorTest {
	
	
   private Calcolator c ;
   
   @BeforeEach
	public void init() throws Exception {
		
		c = new Calcolator();
	}
	
	
	
	@Test 
	
	public void addTest() {
		
		float result = c.add(2.5f, 2.5f);
        assertEquals(result, 5, "test non riuscito");
	}
	
	
	@Test 
	public void substractTest() {
		
		float result = c.substract(5.0f, 2.5f);
		assertEquals(result, 2.5f, "test non riuscito");
	}
	
	@Test 
	public void multiplyTest() {
        float result = c.multiply(5.0f, 3.0f);
        assertEquals(result, 15.0f, "test non riuscito");
    }
	
	@Test
	public void divideTest() {
		assertThrows(IllegalArgumentException.class,
		() -> c.divide(10, 0),
		"test non riuscito un numero on è divisibile per 0");
		
	}

}
