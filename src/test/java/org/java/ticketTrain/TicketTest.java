package org.java.ticketTrain;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TicketTest {
	
	private Ticket t;
	
	@BeforeEach
	public void init()throws Exception {
		
		t = new Ticket();
	}
	
	@Test
	public void getPrezzoTotaleMinoriTest() throws Exception {
		
		double result = t.getPrezzoTotale(12, 20);
		assertEquals(result, 3.36, "test non riuscito");
	}
	
	@Test
    public void getPrezzoTotaleAdultiTest() throws Exception {
		
		double result = t.getPrezzoTotale(66, 20);
		assertEquals(result, 2.52, "test non riuscito");
	}
	
	@Test
    public void getPrezzoTotaleConEtàUgualeAzeroTest(){
    	
		assertThrows(Exception.class, 
		() -> t.getPrezzoTotale(0, 20),
           "l'età non può essere uguale a 0. Non è possibile creare il biglietto");
        }
		
	
	@Test
    public void getPrezzoTotaleConEtàNegativaTest(){
    	
		assertThrows(Exception.class, 
		() -> t.getPrezzoTotale(-1, 20),
		"l'età  non può essere negativa. Non è possibile creare il biglietto");

    }
	
	@Test
	public void getPrezzoTotaleConKmUgualeAzeroTest(){
		
		assertThrows(Exception.class, 
		() -> t.getPrezzoTotale(18, 0),
		"il numero di Km non può essere uguale a 0. Non è possibile creare il biglietto");

	}
	
	
	
	@Test
	public void getPrezzoTotaleConKmNegativoTest() {
		
		 assertThrows(Exception.class, 
		 () -> t.getPrezzoTotale(18, -1),
		 "il numero di Km non può essere negativo. Non è possibile creare il biglietto");

	}
	
	
}
