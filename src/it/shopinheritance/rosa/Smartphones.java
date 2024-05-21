package it.shopinheritance.rosa;

import java.util.Scanner;

//- Smarphone, estende la superclasse prodotto ed è caratterizzata anche dal codice IMEI e dalla quantità di memoria

public class Smartphones extends Prodotto {
	
	// attributi
	private int codiceIMEI;
	
	private double memoriaRAM;
	
	// gettere e setter 
	public int getCodiceIMEI() {
		return codiceIMEI;
	}

	public void setCodiceIMEI(int codiceIMEI) {
		this.codiceIMEI = codiceIMEI;
	}

	public double getMemoriaRAM() {
		return memoriaRAM;
	}

	public void setMemoriaRAM(double memoriaRAM) {
		this.memoriaRAM = memoriaRAM;
	}
	
	
	// costruttore
	public Smartphones(int codice, String nome, String marca, double prezzo) {
		super(codice, nome, marca, prezzo);

		
		Scanner input = new Scanner(System.in);
		// apre il field per inserimento dati utente
		System.out.println("Inserisci il codice IMEI");
		// attribuisce alla variabile nome l'input inserito dall'utente
		int IMEI = input.nextInt();
		setCodiceIMEI(IMEI);
		
		System.out.println("Inserisci il valore RAM");
		// attribuisce alla variabile nome l'input inserito dall'utente
		int RAM = input.nextInt();
		setMemoriaRAM(RAM);
		
	}
	
	// metodo toString
	
			public String toString() {
			return super.toString() + " RAM: " + memoriaRAM + " IMEI: " + codiceIMEI;
			}

	
	

}
