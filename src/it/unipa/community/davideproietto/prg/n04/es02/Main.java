package it.unipa.community.davideproietto.prg.n04.es02;
import it.unipa.community.davideproietto.prg.n03.es08.Razionale;
public class Main {
	public static void main(String args[]){
		// operazioni coi complessi
		Complex a, b, ris;
		a = new Complex(2, 4);
		b = new Complex(-1, 3);

		ris=a.somma(b);
		ris.stampa();

		ris = Complex.somma(a, b);
		Complex.stampa(ris);

		// operazioni coi razionali
		Razionale r1 = new Razionale(5);
		Razionale r2 = new Razionale(3, 4);
		Razionale r3;
		r3 = r1.somma(r2);
		r3.stampa();
	}
}