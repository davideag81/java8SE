package it.unipa.community.davideproietto.prg.n06.es02;
import it.unipa.community.davideproietto.prg.n06.es01.Vettore2D;
public abstract class Veicolo {
	private Vettore2D posizione, velocita, accelerazione; // vettori

	public Veicolo(){
		System.out.println("Costruttore Veicolo");
		setPosizione(new Vettore2D());
		setVelocita(new Vettore2D());
		setAccelerazione(new Vettore2D());
	}

	public Veicolo setPosizione(Vettore2D p){
		posizione = new Vettore2D(p.getVX(), p.getVY());
		return this;
	}

	public Vettore2D getPosizione() {
		return posizione;
	}

	public Vettore2D getVelocita() {
		return velocita;
	}

	public Vettore2D getAccelerazione() {
		return accelerazione;
	}

	public Veicolo setVelocita(Vettore2D v){
		velocita = new Vettore2D(v.getVX(), v.getVY());
		return this;
	}

	public Veicolo setAccelerazione(Vettore2D a){
		accelerazione = new Vettore2D(a.getVX(), a.getVY());
		return this;
	}

	public abstract void muovi(double deltaT);
	
@Override
	public String toString() {
		return "p: " + posizione + " - v: " + velocita + " - a: " + accelerazione;
	}
}