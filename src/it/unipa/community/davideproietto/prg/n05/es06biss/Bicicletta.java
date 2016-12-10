package it.unipa.community.davideproietto.prg.n05.es06biss;

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