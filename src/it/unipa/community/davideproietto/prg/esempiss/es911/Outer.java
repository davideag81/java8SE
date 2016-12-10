package it.unipa.community.davideproietto.prg.esempiss.es911;

public class Outer {
	
	
private String messaggio = "Nella Classe";
private void stampaMessaggio(){
	System.out.println(messaggio + "Esterna");
	}

public class Inner{
	public void metodo(){
		System.out.println(messaggio + "Interna");
	}
	
	public void chiamaMedoto(){
		stampaMessaggio();
	}

}

}
