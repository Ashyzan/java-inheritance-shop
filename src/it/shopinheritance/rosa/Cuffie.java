package it.shopinheritance.rosa;

import java.util.Scanner;

public class Cuffie extends Prodotto {
	//- Cuffie, caratterizzate dal colore e se sono wireless o cablate
	
		private String colore;
		private String cablaggio;
	
	// gettere e setter 
		public String getCablaggio() {
			return cablaggio;
		}

		public void setCablaggio(String cablaggio) {
			this.cablaggio = cablaggio;
		}
	
		public Cuffie(int codice, String nome, String marca, double prezzo, String colore ) {
		super(codice, nome, marca, prezzo);
		
		this.colore =  colore;
		
		Scanner input = new Scanner(System.in);
		// apre il field per inserimento dati utente
		System.out.println("Scrivi se le cuffie sono wireless o cavo");
		// attribuisce alla variabile nome l'input inserito dall'utente
		String inputCablaggio = input.next();
		setCablaggio(inputCablaggio);
		
		
		if (cablaggio.equals("wireless")) {
			
			System.out.println("hai scelto cablaggio wireless!");
		}
		
		else if (cablaggio.equals("cavo")) {
			
			System.out.println("hai scelto cablaggio cavo!");
		}
		
		else {
			System.out.println("Non hai inserito correttamente il cablaggio");
		}
	
	}
	
	// metodo toString
	
	public String toString() {
	return super.toString() + " Colore: " + colore + " Cablaggio: " + cablaggio;
	}
	
	
}
