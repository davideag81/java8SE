package it.unipa.community.marcolacascia.prg.n05.es06;

public class Bicicletta extends Veicolo {
	public Ruota anteriore, posteriore;

	public Bicicletta(){
		anteriore = new Ruota();
		posteriore = new Ruota();		
	}

	public String toString(){
		return "Bicicletta: " + super.toString();
	}	
}