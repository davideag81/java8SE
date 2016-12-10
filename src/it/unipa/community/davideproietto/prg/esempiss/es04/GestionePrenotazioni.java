package it.unipa.community.davideproietto.prg.esempiss.es04;

public class GestionePrenotazioni {

	public static void main(String[] args) {
		
	Botteghino botteghino = new Botteghino(); // crea botteghino
	try{// blocco try con codice potenzialmente pericoloso
	for(int i= 1 ; i<=101; i++){	 // effettua prenotazioni
		botteghino.prenota();
		System.out.println("Prenotato posto n° " + i);
	}

	}
	catch (PrenotazioneException exc){	// cattura l'eccezione
		System.out.println(exc.toString());	//messaggio personalizzato
}
	}
}