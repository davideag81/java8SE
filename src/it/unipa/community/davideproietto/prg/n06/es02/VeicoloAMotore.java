package it.unipa.community.davideproietto.prg.n06.es02;
import it.unipa.community.davideproietto.prg.n06.es01.Vettore2D;

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

	@Override
	public void muovi(double deltaT) {
		Vettore2D p = new Vettore2D();
		p = (getPosizione().somma(getVelocita().moltiplica(deltaT))).somma(getAccelerazione().moltiplica(deltaT*deltaT));	
		setPosizione(p);
	}

}