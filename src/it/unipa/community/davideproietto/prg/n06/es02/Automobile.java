package it.unipa.community.davideproietto.prg.n06.es02;


public class Automobile extends VeicoloAMotore {
	private Ruota asx, adx, psx, pdx;

	public Automobile(){
		this.asx = new Ruota();
		this.adx = new Ruota();		
		this.psx = new Ruota();
		this.pdx = new Ruota();		
	}

}