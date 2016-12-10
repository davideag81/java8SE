package it.unipa.community.davideproietto.prg.n07.es03;

public class Circle extends Shape {
private double radius;
private final double pGreco = 3.14;

public Circle() {  // circonferenza unitaria
	setRadius(1);
}

public Circle(double radius) { // cerchio da raggio
	setRadius(radius);
		
	}
	public double setPerimeter(){
		return this.radius * 2 * pGreco;
		}
	
	public double setArea(){
		return (this.radius*this.radius) * pGreco;
		}

	@Override
	public double perimeter() {
		return this.radius * 2 * pGreco;
	
	}

	@Override
	public double area() {
		return (this.radius*this.radius) * pGreco;
	
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return ("Cerchio di raggio m: " + getRadius() + " , di perimetro m: " + perimeter() + " , e di area m2 : " + area());
		
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
