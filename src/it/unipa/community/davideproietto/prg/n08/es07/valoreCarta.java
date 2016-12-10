package it.unipa.community.davideproietto.prg.n08.es07;

public enum valoreCarta  {
ASSO(1), DUE(2), TRE(3), QUATTRO(4), CINQUE(5), SEI(6), SETTE(7), DONNA(8), CAVALLO(9), RE(10);

	private int value;
	
	private valoreCarta(){// COSTRUTTORE E' PRIVATO SEMPRE!!
		this(0);
	}
	
	private valoreCarta(int value) {
	setValue(value);
	}
	
	public void setValue(int value){
		this.value = value;
	}
	
	public int getValue(){
		return this.value;
	}
	
	public int punti(){
		switch(this){	// passa la stessa enumerazione
		case ASSO:
			return 11;
		case TRE:
			return 10;
		case DONNA:
			return 2;
		case CAVALLO:
			return 3;
		case RE:
			return 4;
		default:
			return 0;
		}
	}
	
	}
