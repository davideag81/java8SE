package it.unipa.community.davideproietto.prg.n01.es04;

public class Main extends Rettangolo {

	public static void main(String[] args) {

Rettangolo rett1 = new Rettangolo();
rett1.setBase(5);
rett1.setAltezza(6);

System.out.println(rett1.perimetro());
System.out.println(rett1.area());
	
Rettangolo rett2 = new Rettangolo();
rett2.setBase(8);
rett2.setAltezza(7);

System.out.println(rett2.perimetro());
System.out.println(rett2.area());
	
	
	}

}
