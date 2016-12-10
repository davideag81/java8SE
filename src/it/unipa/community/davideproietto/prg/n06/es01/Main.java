package it.unipa.community.davideproietto.prg.n06.es01;


public class Main {
	public static void main(String args[]){
		Bicicletta b = new Bicicletta();
		System.out.println(b);

		Ciclomotore c = new Ciclomotore();
		System.out.println(c);
		c.setAccelerazione(new Vettore2D(1.0, 3.0));
		c.muovi(3);
		System.out.println(c);

		Automobile a = new Automobile();
		System.out.println(a);
		a.setVelocita(new Vettore2D(20.0, 5.0));
		a.setAccelerazione(new Vettore2D(10.0, 4.0));
		a.muovi(10);
		System.out.println(a);
	}
}