package it.shopinheritance.rosa;

public class Main {
	
	public static void main(String[] args) {
		
		Prodotto prodottoGenerico = new Prodotto( 541 , "Prodotto generico", "marca generica", 12);
		
		System.out.println("Info sul prodotto: " + prodottoGenerico.toString());
		
		
		Smartphones iphone8 = new Smartphones( 622 , "Iphone 8", "Apple" , 737);
		
		System.out.println("Info sullo smartphone: " + iphone8.toString());
		
		
		Televisori hp = new Televisori(1251 , "Monitor TV" , "HP" , 800 , 125, true);
		System.out.println("Info sulla TV: " + hp.toString());
		
		Cuffie Beats = new Cuffie(42343, "Cuffie" , "DR.Beats" , 500 , "Verdi");
		System.out.println("Info sulle Cuffie: " + Beats.toString());
	}

}
