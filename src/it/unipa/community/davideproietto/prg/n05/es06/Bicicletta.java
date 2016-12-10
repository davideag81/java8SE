package it.unipa.community.davideproietto.prg.n06.es01;

public class Bicicletta extends Veicolo {
private final int ruote;
	public Bicicletta(double posX0, double vectorSpeed, double vectorAcceleretor) {
		super(posX0, vectorSpeed, vectorAcceleretor);
		this.ruote = 2;
		// TODO Auto-generated constructor stub
	}

	public Bicicletta() {
		this(0,0,0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double muovi(double deltaT) {
		// TODO Auto-generated method stub
		return 0;
	}

}
