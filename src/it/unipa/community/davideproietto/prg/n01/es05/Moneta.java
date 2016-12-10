package it.unipa.community.davideproietto.prg.n01.es05;
import java.util.Random;
public class Moneta {
	private String faccia [] = {"Testa", "Croce"};
	private Random r;
	private int face;
	
	public Moneta() { // genera una moneta casuale
		this.r = new Random();
		this.faccia[0]= "Testa";
	}
	
	
	public void lancia(){
		this.face = r.nextInt(2);
		}


@Override
public String toString(){
	return "Lancio la monenta ... ed esce ... "+ faccia[face];
	}


public static void main(String args[]){
	Moneta m1 = new Moneta();
	try {
	m1.lancia();
	System.out.println(m1.toString());
	}
	catch (NullPointerException exc){
		System.out.println(" Hai lanciato nel cesso... ora come ti dico cosa è uscito??!!");
	}
}
}

