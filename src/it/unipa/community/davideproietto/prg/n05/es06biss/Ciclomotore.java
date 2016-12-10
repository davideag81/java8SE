package it.unipa.community.davideproietto.prg.n05.es06biss;

public class Ciclomotore extends VeicoloAMotore {
	private Ruota anteriore, posteriore;

	public Ciclomotore(){
		anteriore = new Ruota();
		posteriore = new Ruota();		
	}

}