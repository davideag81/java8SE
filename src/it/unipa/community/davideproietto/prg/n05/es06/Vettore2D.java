package it.unipa.community.davideproietto.prg.n05.es06;

import it.unipa.community.davideproietto.prg.n05.es03.Point2D;

public class Vettore2D extends Point2D {
	Point2D p;// crea un oggetto punto2d

	
	public Vettore2D() {
		this(0.0, 0.0);
	}

	public Vettore2D(double cordX, double cordY) {
		p = new Point2D(cordX, cordY);
	}

	public Vettore2D somma(Vettore2D v){
		Vettore2D ris = new Vettore2D(getCordX()+v.getCordX(), getCordY()+v.getCordY());
		return ris;
	}

	public Vettore2D moltiplica(double k){// per uno scalare
		Vettore2D ris = new Vettore2D(getCordX()*k, getCordY()*k);
		return ris;
	}
	
	public double modulo() {
		return Math.pow(getCordX(), 2) + Math.pow(getCordY(), 2);
	}

	public double fase() {
		return Math.atan(p.getCordY()/p.getCordX());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
