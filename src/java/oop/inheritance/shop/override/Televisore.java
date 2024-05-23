package java.oop.inheritance.shop.override;

public class Televisore extends Prodotto {
	
	private int dimensioni;
	private boolean smart;  
	
    //Costruttore
    public Televisore(String nome, String marca, float prezzo, int iva, int dimensioni, boolean smart) {  
        super(nome, marca, prezzo, iva);
        this.dimensioni = dimensioni;
        this.smart = smart;
      }
 
	public int getDimensioni() {
		return dimensioni;
		}

	public void setDimensioni(int dimensioni) {
		this.dimensioni = dimensioni;
	}

	public boolean getSmart() {
		return smart;
	}

	public void setSmart(boolean smart) {
		this.smart = smart;
	}	
	
	@Override
	public String toString() {
		return super.toString() + " Dimensioni " + this.dimensioni + " Smart " + this.smart;
	}
}

