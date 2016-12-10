package it.unipa.community.marcolacascia.prg.n05.es06;
import it.unipa.community.marcolacascia.prg.n05.es03.Point2D;

public class Vettore2D {
	Point2D p;

	public Vettore2D(double vx, double vy){
		p = new Point2D(vx, vy);
	}

	public Vettore2D(){
		this(0.0, 0.0);
	}

	public double modulo() {
		return Math.sqrt(p.getX()*p.getX() + p.getY()*p.getY());
	}

	public double fase() {
		return Math.atan(p.getY()/p.getX());
	}

	public double getVX(){
		return p.getX();
	}

	public double getVY(){
		return p.getY();
	}

	public Vettore2D somma(Vettore2D v){
		Vettore2D ris = new Vettore2D(getVX()+v.getVX(), getVY()+v.getVY());
		return ris;
	}

	public Vettore2D moltiplica(double k){
		Vettore2D ris = new Vettore2D(getVX()*k, getVY()*k);
		return ris;
	}

	public String toString(){
		return p.toString();
	}
}