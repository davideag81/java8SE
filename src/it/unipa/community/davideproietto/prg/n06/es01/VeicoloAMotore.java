package it.unipa.community.davideproietto.prg.n06.es01;


public abstract class VeicoloAMotore extends Veicolo {
	private int cilindrata;

	public VeicoloAMotore(){
		System.out.println("Costruttore VeicoloAMotore");
		cilindrata = 0;
	}

	public VeicoloAMotore setCilindrata(int cil){
		this.cilindrata = cil;
		return this;	// ritorna se stesso per incremento nuovo parametro( anche se in questo caso è solo uno)
	}

	public int getCilindrata(){
		return cilindrata;
	}
}