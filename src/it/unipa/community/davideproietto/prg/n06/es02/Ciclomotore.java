package it.unipa.community.davideproietto.prg.n06.es02;


public class Ciclomotore extends VeicoloAMotore {
	private Ruota anteriore, posteriore;

	public Ciclomotore(){
		this.anteriore = new Ruota();
		this.posteriore = new Ruota();		
	}

}