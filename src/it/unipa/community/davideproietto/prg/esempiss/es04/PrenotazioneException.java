package it.unipa.community.davideproietto.prg.esempiss.es04;

public class PrenotazioneException extends Exception {
public PrenotazioneException(){
	super("Problema con la prenotazione");
}
	@Override
	public String toString() {
		return getMessage() + " : posti esauriti!"; // getMessage() è un metodo di Throwable
	}

}
