package org.java.ticketTrain;

public class Ticket {

	
	int km;
	int age;
    
    
	public double getPrezzoTotale(int age, int km)throws Exception {
		 double prezzoBase = km * 0.21;
		 double prezzoScontato = 0 ;
		
		 if(age <= 0 || km <= 0)
				
			throw new Exception("");

		if(age < 18) {
			
			prezzoScontato = prezzoBase  * 0.8;
			
			prezzoScontato = Math.round(prezzoScontato * 100.0) / 100.0;
			
		} 
		if(age > 65)  {
			
			prezzoScontato = prezzoBase  * 0.6;
			
			prezzoScontato = Math.round(prezzoScontato * 100.0) / 100.0;
		}
		
		
		
		return  prezzoScontato;
	}
	
	
   
    
    

}
