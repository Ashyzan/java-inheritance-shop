package it.shopinheritance.rosa;

public class Prodotto {
	
	
	// attributi classe
		
		private final int codice;
		
		private String nome;

		private String marca;
		
		private double prezzo;
		
		private static final double iva = 0.22;
		
		private double prezzoIva;
			
	
		
	// costruttore

		
	public Prodotto(int codice, String nome, String marca, double prezzo) {
		this.codice = codice;
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
		this.prezzoIva = prezzo * iva + prezzo;
	}

	// metodi getter setter

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public double getPrezzo() {
			return prezzo;
		}

		public void setPrezzo(double prezzo) {
			this.prezzo = prezzo;
		}

		public static double getIva() {
			return iva;
		}

		public double getPrezzoIva() {
			return prezzoIva;
		}

		public void setPrezzoIva(double prezzoIva) {
			this.prezzoIva = prezzoIva;
		}

		public int getCodice() {
			return codice;
		}
		
		// metodo toString
		
		public String toString() {
			
			return "Codice: " + codice + " Nome: " + nome + " Marca: " + marca + " Prezzo: " + prezzo;
		}
	

}
