package it.unipa.community.davideproietto.prg.n07.es03;

public class Square extends Rectangle {
private double side;
	public Square(double side) {
	super(side,side);
	this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public double perimeter() {
		return this.side * 4;
	
	}

	@Override
	public double area() {
		return this.side * this.side;
	}
	
	@Override
	public String toString() {
		return ("Quadrato di lato m: " + getSide() + " , di perimetro m: " + perimeter() + " , e di area m2 : " + area());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}