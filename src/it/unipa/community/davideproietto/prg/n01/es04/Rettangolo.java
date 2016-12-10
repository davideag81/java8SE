package it.unipa.community.davideproietto.prg.n01.es04;

public class Rettangolo {
	private double base, altezza;
	
	public Rettangolo(double base, double altezza){
	this.base = base;
	this.altezza = altezza;
	}

	public Rettangolo(){
	this(1,1);
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}
	
	public double perimetro(){
		return (this.base * 2 + this.altezza * 2);
	}
	public double area(){
		return base* altezza;
	}


}
