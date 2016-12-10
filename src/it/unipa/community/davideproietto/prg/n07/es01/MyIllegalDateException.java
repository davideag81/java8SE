package it.unipa.community.davideproietto.prg.n07.es01;

public class MyIllegalDateException extends Exception {

	public MyIllegalDateException() {
	this("Data non valida");
	}

	public MyIllegalDateException(String s) {
		super(s);
	}

	@Override
	public String toString() {
		return "MyIllegalDateException [getMessage()=" + getMessage() + ", toString()=" + super.toString() + "]";
	}

	
	

}
