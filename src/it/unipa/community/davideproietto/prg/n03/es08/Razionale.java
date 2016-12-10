package it.unipa.community.davideproietto.prg.n03.es08;

public class Razionale {
	private int num = 0;
	private int den = 1;

	public Razionale(int num, int den){
		this.num = num;
		this.den = (den != 0 ? den : 1);
	}

	public Razionale (int num){
		this(num, 1);
	}

	public Razionale() {
		this(0, 1);
	}

	public void stampa() {
		System.out.println(num + "/" + den);
	}

	public void semplifica() {
		// DA IMPLEMENTARE DOPO
	}

	public Razionale somma(Razionale r) {
		Razionale ris = new Razionale();
		ris.num = this.num*r.den + r.num*this.den;
		ris.den = this.den*r.den;
		ris.semplifica();
		return ris;
	}

	public Razionale sottrai(Razionale r) {
		Razionale ris = new Razionale();
		ris.num = this.num*r.den - r.num*this.den;
		ris.den = this.den*r.den;
		ris.semplifica();
		return ris;
	}

	public Razionale moltiplica(Razionale r) {
		Razionale ris = new Razionale();
		ris.num = this.num*r.num;
		ris.den = this.den*r.den;
		ris.semplifica();
		return ris;
	}

	public Razionale dividi(Razionale r) {
		Razionale ris = new Razionale();
		ris.num = this.num*r.den;
		ris.den = this.den*r.num;
		ris.semplifica();
		return ris;
	}
}
