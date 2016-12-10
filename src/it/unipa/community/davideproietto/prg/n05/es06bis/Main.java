package it.unipa.community.marcolacascia.prg.n05.es06;

public class Main {
	public static void main(String args[]){
		Bicicletta b = new Bicicletta();
		System.out.println(b);

		Ciclomotore c = new Ciclomotore();
		System.out.println(c);
		c.setAccelerazione(new Vettore2D(1.0, 0.0));
		c.muovi(2);
		System.out.println(c);

		Automobile a = new Automobile();
		System.out.println(a);
		a.setVelocita(new Vettore2D(2.0, 3.0));
		a.setAccelerazione(new Vettore2D(1.0, 0.0));
		a.muovi(5);
		System.out.println(a);
	}
}