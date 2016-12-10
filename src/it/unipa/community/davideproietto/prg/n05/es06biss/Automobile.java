package it.unipa.community.davideproietto.prg.n05.es06biss;

public class Automobile extends VeicoloAMotore {
	private Ruota asx, adx, psx, pdx;

	public Automobile(){
		asx = new Ruota();
		adx = new Ruota();		
		psx = new Ruota();
		pdx = new Ruota();		
	}

}