package it.unipa.community.davideproietto.prg.n05.es06;

public abstract class VeicoloAMotore extends Veicolo {

	private float cilindrata;
	public VeicoloAMotore(double posX0, double vectorSpeed, double vectorAcceleretor) {
		super(posX0, vectorSpeed, vectorAcceleretor);
		// TODO Auto-generated constructor stub
	}

	public VeicoloAMotore() {
		System.out.println("Costruttore VeicoloAMotore");
		this.cilindrata = 0;
	}
	
	public VeicoloAMotore(float cilindrata) {
		System.out.println("Costruttore VeicoloAMotore");
		this.cilindrata = cilindrata;
	}

	public float getCilindrata() {
		return cilindrata;
	}

	public void setCilindrata(float cilindrata) {
		this.cilindrata = cilindrata;
	}

	@Override
	public double muovi(double deltaT) {
		// TODO Auto-generated method stub
		return 0;
	}

}
