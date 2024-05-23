package java.oop.inheritance.shop.override;

public class Cuffie extends Prodotto {
	
	private String colore;
	private String tipo;
	
    //Costruttore
    public Cuffie(String nome, String marca, float prezzo, int iva, String colore, String tipo) {  
        super(nome, marca, prezzo, iva);
        this.colore = colore;
        this.tipo = tipo;
      	}

	public String getColore() {
	     return colore;
	}

	public void setColore(String colore) {
	     this.colore = colore;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Colore " + this.colore + " Tipo " + this.tipo;
	}
}
