package java.oop.inheritance.shop.override;

import java.util.Random;
import java.util.Scanner;

public class Prodotto {
	
		//Campi
		 private int codice;
		 private String nome;
		 private String marca;
		 private float prezzo;
		 private int iva;
		 
		 //Costruttore
		 public Prodotto (String nome, String marca, float prezzo, int iva)
		 {	 //Si usa la classe Random per generare un numero intero
			 Random c = new Random();
			 this.codice = c.nextInt(19);
			 this.nome = nome;
			 this.marca = marca;
			 this.prezzo = prezzo;
			 this.iva = iva;
		   }

		 //Metodi 
		  public int getCodice() {
			    return codice;
			 } 
		  
		  public String getNome() {
			    return nome;
			 } 
		  
		  public void setNome (String nome) {
			  this.nome = nome;
			 }
		  
		  public String getMarca() {
			    return marca;
			 } 
		  
		  public void setMarca (String descrizione) {
			  this.marca = marca;
			 }  
		   
		  public float getPrezzo() {
			    return prezzo;
			 } 
		  
		  public void setPrezzo (float prezzo) {
			  this.prezzo = prezzo;
			 }
		    
		  public int getIva() {
			    return iva;
			 } 
		  
		  public void setIva (int iva) {
			  this.iva = iva;
			 }
		  
		  public float prezzoTot () {
			  float tot = this.prezzo + (this.prezzo * iva)/100;
			  return tot;
		     }
		  
		  public String codNome() {
			  String cn = this.codice + "-" + this.nome;
			  return cn;
		     }
		  
		  public String toString() {
				return "Codice del prodotto " + this.codice + 
						" Nome del prodotto " + this.nome;
			}
 
}
