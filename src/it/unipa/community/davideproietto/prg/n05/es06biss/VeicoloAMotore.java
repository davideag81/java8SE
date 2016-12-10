package it.unipa.community.davideproietto.prg.n05.es06biss;

public abstract class VeicoloAMotore extends Veicolo {
	private int cilindrata;

	public VeicoloAMotore(){
		System.out.println("Costruttore VeicoloAMotore");
		cilindrata = 0;
	}

	public VeicoloAMotore setCilindrata(int cil){
		this.cilindrata = cil;
		return this;
	}

	public int getCilindrata(){
		return cilindrata;
	}
}