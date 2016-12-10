package it.unipa.community.davideproietto.prg.n01.es06;
import it.unipa.community.davideproietto.prg.n01.es06.Cliente;

public class CartaFedelta {
private int punti;
private int numeroCarta;
private final int VALORE_PUNTO = 10;



public CartaFedelta(int punti, int numeroCarta){
	this.punti=punti;
	this.numeroCarta=numeroCarta;
	
	}

public CartaFedelta() {
		this(0, 0000);
		}

	public int accumulaPunti(double spesa){
		return	punti += (spesa/VALORE_PUNTO);

		
	}
	
	public int utilizzaPunti(int riscatto){
		return	punti -= (riscatto);	
	}
	
	public void stampa(){
		
	}
	
@Override
public String toString(){
	System.out.println("DATI CARD: " + this.numeroCard + " "+ this.punti +"\n"+
										"\t\t" + getNumeroCard()+" " + getPunti());
}

public int getPunti() {
	return punti;
}

public void setPunti(int punti) {
	this.punti = punti;
}

public int getNumeroCarta() {
	return numeroCarta;
}

public void setNumeroCarta(int numeroCarta) {
	this.numeroCarta = numeroCarta;
}

public int getVALORE_PUNTO() {
	return VALORE_PUNTO;
}

}
