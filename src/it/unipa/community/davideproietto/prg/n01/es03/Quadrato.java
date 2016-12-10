package it.unipa.community.davideproietto.prg.n01.es03;

public class Quadrato {
private double lato;
private final int NUMLATI = 4;

public Quadrato(double lato){
	this.lato = lato;
}

public Quadrato(){
	this(1);
}

public double getLato() {
	return lato;
}
public void setLato(double lato) {
	this.lato = lato;
}
public double perimetro(){
	return this.lato * NUMLATI;
}
public double area(){
	return Math.pow(lato, 2);
}

}
