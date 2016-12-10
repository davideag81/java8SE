package it.unipa.community.marcolacascia.prg.n05.es06;

public abstract class Veicolo {
	private Vettore2D posizione, velocita, accelerazione;

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

	public Veicolo setVelocita(Vettore2D v){
		velocita = new Vettore2D(v.getVX(), v.getVY());
		return this;
	}

	public Veicolo setAccelerazione(Vettore2D a){
		accelerazione = new Vettore2D(a.getVX(), a.getVY());
		return this;
	}

	public void muovi(double deltaT){
		posizione = (posizione.somma(velocita.moltiplica(deltaT))).somma(accelerazione.moltiplica(deltaT*deltaT));
	}

	public String toString() {
		return "p: " + posizione + " - v: " + velocita + " - a: " + accelerazione;
	}
}