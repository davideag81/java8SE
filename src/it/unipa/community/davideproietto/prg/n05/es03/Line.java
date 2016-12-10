package it.unipa.community.davideproietto.prg.n05.es03;

public class Line {
private double x;
private double y;

	public Line(double x1, double y1, double x2, double y2) {   // retta per due punti Patametrizzata
		// retta per 2 punti (y-y1)/(y2-y1) && (x-x1)/(x2-x1);
	this.y = y1/(y2-y1);
	this.x = x1/(x2-x1);	

	}

	//y-y1/y2-y1 = x-x1/x2-x1
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
