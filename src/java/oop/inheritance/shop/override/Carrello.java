package java.oop.inheritance.shop.override;

import java.util.Scanner;

public class Carrello {
	
		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("inserire il prodotto, (Smartphone/Televisore/Cuffie)");
			
			String prodottoInput= input.nextLine();
			
			Prodotto prodotto = null;
			
			switch(prodottoInput) {
				case "Smartphone":
					prodotto = inizializzaSmartphone();
					break;
				case "Televisore":
					prodotto = inizializzaTelevisore();
					break;
				case "Cuffie":
					prodotto = inizializzaCuffie();
					break;
				default:
					System.out.println("dato non valido");
			      }
			//Stampa i dati del prodotto
			System.out.println(prodotto);	
        }

		
		public static Prodotto inizializzaSmartphone () {
	  		Scanner input = new Scanner(System.in);
	  		System.out.println("Inserire il nome dello Smartphone");
			String nome = input.nextLine();
			System.out.println("Inserire la marca dello Smartphone");
			String marca = input.nextLine();
			System.out.println("Inserire il prezzo");
			float prezzo = input.nextFloat();
			System.out.println("Inserire l'iva");
			int iva = input.nextInt();
			System.out.println("Inserire il codice IMEI");
			int codiceIMEI = input.nextInt();
			System.out.println("Inserire la quantità di memoria");
			int quantitaMemoria = input.nextInt();
			input.nextLine();
			Prodotto prodotto = new Smartphone(nome, marca, prezzo, iva, codiceIMEI, quantitaMemoria);
			return prodotto;
	  	}

	
	  	public static Prodotto inizializzaTelevisore () {
	  		Scanner input = new Scanner(System.in);
	  		System.out.println("Inserire il nome del televisore");
	  		String nome = input.nextLine();
	  		System.out.println("Inserire la marca del televisore");
	  		String marca = input.nextLine();
	  		System.out.println("Inserire il prezzo");
	  		float prezzo = input.nextFloat();
	  		System.out.println("Inserire l'iva");
	  		int iva = input.nextInt();
	  		System.out.println("Inserire la dimensione");
			int dimensione = input.nextInt();
			System.out.println("Inserire se il televisore è smart (true/false)");
			boolean smart = input.nextBoolean();		
			input.nextLine();
			Prodotto prodotto = new Televisore(nome, marca, prezzo, iva, dimensione, smart);
			return prodotto;
	  	}
	  	
	  	
		public static Prodotto inizializzaCuffie () {
	  		Scanner input = new Scanner(System.in);
	  		System.out.println("Inserire il nome delle cuffie");
			String nome = input.nextLine();
			System.out.println("Inserire la marca delle cuffie");
			String marca = input.nextLine();
			System.out.println("Inserire il prezzo");
			float prezzo = input.nextFloat();
			System.out.println("Inserire l'iva");
			int iva = input.nextInt();
			input.nextLine();
			System.out.println("Inserire il colore");
			String colore = input.nextLine();
			System.out.println("Inserire il tipo, (wireless/cablate)");
			String tipo = input.nextLine();
			Prodotto prodotto = new Cuffie(nome, marca, prezzo, iva, colore, tipo);	
			return prodotto;
		 }	
}