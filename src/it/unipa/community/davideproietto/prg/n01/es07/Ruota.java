package it.unipa.community.davideproietto.prg.n01.es07;
import java.util.Random;
public class Ruota {
private double pressione = 100;
private Random coef = new Random();
private double sgonfia;



	public Ruota() {
		this.coef.nextDouble();
	    this.pressione = 0;
	}
	
	
	public double cammina(double km){
		sgonfia = coef.nextDouble();
		return this.pressione -= (sgonfia*km);
	}

	public double getPressione() {
		return pressione;
	}


	public void setPressione(double pressione) {
		this.pressione = pressione;
	}

}
