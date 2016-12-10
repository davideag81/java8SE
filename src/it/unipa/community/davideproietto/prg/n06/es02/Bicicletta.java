package it.unipa.community.davideproietto.prg.n06.es02;
import it.unipa.community.davideproietto.prg.n05.es03.Point2D;
import it.unipa.community.davideproietto.prg.n06.es01.Vettore2D;

public class Bicicletta extends Veicolo {
	public Ruota anteriore, posteriore;

	public Bicicletta(){
		this.anteriore = new Ruota();
		this.posteriore = new Ruota();		
	}

	
@Override	
	public void muovi(double deltaT) {
		Vettore2D p = new Vettore2D();
		p = (getPosizione().somma(getVelocita().getVX().(moltiplica(deltaT)))).somma(getAccelerazione().moltiplica(deltaT*deltaT));	
		setPosizione(p);
	}



@Override
	public String toString(){
		return "Bicicletta: " + super.toString(); // invocazione della toString di Veicolo
	}	
}