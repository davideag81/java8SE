package it.unipa.community.davideproietto.prg.n06.es01;

import java.util.Random;

public class Ruota {
	public int pressione = 100; // la ruota nuova è gonfia
	public double sgonfiamento;

	public Ruota() {
		System.out.println("Costruttore Ruota");
		Random r = new Random();
		sgonfiamento = r.nextDouble();
	}

	public void sgonfia(int km) {
		pressione -= km*sgonfiamento;
		if(pressione<0) pressione=0;
	}

	public void stampaPressione(){
		System.out.println(pressione);
	}

	public void revisiona(int pmin){
		if(pressione<pmin) pressione=100;
	}
}