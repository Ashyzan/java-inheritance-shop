package it.shopinheritance.rosa;

public class Televisori extends Prodotto {

	
	// - Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no

	int dimensioni;
	
	boolean smart;
	
	public Televisori(int codice, String nome, String marca, double prezzo, int dimensioni, boolean smart) {
		
		super(codice, nome, marca, prezzo);
		
		this.smart = smart;
		this.dimensioni = dimensioni;
		
		if (this.smart == true) {
			
			smart = true;
			
			
		}
		
		
		
		
	}
	
	// metodo toString
	
				public String toString() {
				return super.toString() + " Dimensioni: " + dimensioni + " È smart: " + smart;
				}


}
