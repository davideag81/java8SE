package it.unipa.community.davideproietto.prg.n06.es01;


public class Bicicletta extends Veicolo {
	public Ruota anteriore, posteriore;

	public Bicicletta(){
		this.anteriore = new Ruota();
		this.posteriore = new Ruota();		
	}

@Override
	public String toString(){
		return "Bicicletta: " + super.toString(); // invocazione della toString di Veicolo
	}	
}