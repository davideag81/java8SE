package it.unipa.community.davideproietto.prg.n07.es03;

public class Main {

	public static void main(String[] args) {

Circle cerchio1 = new Circle(5);
System.out.println(cerchio1.toString());

Circle cerchio2 = new Circle(3);
System.out.println(cerchio2.toString());
	
Rectangle rettangolo1 = new Rectangle(5,9);
System.out.println(rettangolo1.toString());

Rectangle rettangolo2 = new Rectangle(5,3);
System.out.println(rettangolo2.toString());

Square quadrato1 = new Square(12);
System.out.println(quadrato1.toString());

Square quadrato2 = new Square(4);
System.out.println(quadrato2.toString());
	
System.out.println(cerchio1.compareTo(rettangolo1));



	}

}

