package java.oop.inheritance.shop.override;

public class Smartphone extends Prodotto {
	
	private int codiceIMEI;
	private int quantitaMemoria;
	
    //Costruttore
    public Smartphone(String nome, String marca, float prezzo, int iva, int codiceIMEI, int quantitaMemoria) {  
        super(nome, marca, prezzo, iva);
        this.codiceIMEI = codiceIMEI;
        this.quantitaMemoria = quantitaMemoria;
      }

	public int getCodiceIMEI() {
		return codiceIMEI;
	}

	public void setCodiceIMEI(int codiceIMEI) {
		this.codiceIMEI = codiceIMEI;
	}

	public int getQuantitaMemoria() {
		return quantitaMemoria;
	}

   public void setQuantitaMemoria(int quantitaMemoria) {
	   this.quantitaMemoria = quantitaMemoria;
   }

   @Override
	public String toString() {
		return super.toString() + " CodiceIMEI " + this.codiceIMEI + " Quantita di memoria " + this.quantitaMemoria;
	}
     
}