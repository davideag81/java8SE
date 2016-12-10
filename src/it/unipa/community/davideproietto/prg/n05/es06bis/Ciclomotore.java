package it.unipa.community.marcolacascia.prg.n05.es06;

public class Ciclomotore extends VeicoloAMotore {
	private Ruota anteriore, posteriore;

	public Ciclomotore(){
		anteriore = new Ruota();
		posteriore = new Ruota();		
	}

}