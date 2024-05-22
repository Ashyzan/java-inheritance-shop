package it.shopinheritance.rosa;

import java.util.Scanner;

public class Carrello {
//	Durante la richiesta di valorizzazione chiedete all’utente se sta inserendo 
//	uno Smarphone o un Televisore o Cuffie e in base alla scelta dell’utente 
//	utilizzate il costruttore opportuno.
//	
//	Al termine dell’inserimento stampate il carrello (fate l’override 
//	del metodo toString per restituire le informazioni da stampare per ogni classe)
	
	public static void main(String[] args) {
		
		
		System.out.println("Ecco il tuo carrello! Inserisci i prodotti che vuoi acquistare..\n"
				+ "scegli tra: smartphone , televisore o cuffie");
		
		Scanner input = new Scanner(System.in);
		
		String sceltaProdotto = input.nextLine();

		Prodotto x = null;
		
		switch(sceltaProdotto) {
		
		case "smartphone":
			x = new Smartphones(389593, "Smarthone", "Apple", 500);
		break;
		
		case "televisore":
			x = new Televisori(1251 , "Monitor TV" , "HP" , 800 , 125, true);
		break;
		
		case "cuffie":
			x = new Cuffie(42343, "Cuffie" , "DR.Beats" , 500 , "Verdi");
			break;
		default: 
			System.out.println("Inserimento non corretto");
		
		}
		
		System.out.println("Hai acquistato: " + sceltaProdotto.toString());
		
		if (x != null) {
			
			//x.toString();
			
			System.out.println(x);
			
		}
	}
}
