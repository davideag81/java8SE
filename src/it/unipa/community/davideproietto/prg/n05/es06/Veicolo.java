package it.unipa.community.davideproietto.prg.n05.es06;
//import it.unipa.community.davideproietto.prg.n05.es03.Point2D;

public abstract class Veicolo {
private double posX0 ;
private double vectorSpeed;
private double vectorAccelerator;

public Veicolo(double posX0, double vectorSpeed, double vectorAcceleretor) { // costruttore parametrizzato
	this.posX0 = posX0;
	this.vectorSpeed = vectorSpeed;
	this.vectorAccelerator = vectorAcceleretor;
}

	public Veicolo() { // veicolo Parcheggiato!!
		this(0, 0, 0);
	}
public abstract double muovi(double deltaT);



	public double getPosX0() {
	return posX0;
}

public void setPosX0(double posX0) {
	this.posX0 = posX0;
}

public double getVectorSpeed() {
	return vectorSpeed;
}

public void setVectorSpeed(double vectorSpeed) {
	this.vectorSpeed = vectorSpeed;
}

public double getVectorAccelerator() {
	return vectorAccelerator;
}

public void setVectorAccelerator(double vectorAccelerator) {
	this.vectorAccelerator = vectorAccelerator;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
