package it.unipa.community.davideproietto.prg.n07.es03;

public class Rectangle extends Shape {
private double width;
private double length;
	public Rectangle(double width, double length){
		this.width = width;
		this.length = length;
		
	}
	public Rectangle(){ //linea
		this.width = 1;
		this.length = 0;
		
	}

	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	@Override
	public double perimeter() {
		
		return 2*(this.width + this.length);
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.width * this.length;
	}
	
	@Override
	public String toString() {
		return ("Rettangolo: Altezza m " + getWidth() + " Largezza m " +getLength() + " , di perimetro m: " + perimeter() + " , e di area m2 : " + area());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
