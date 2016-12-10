package it.unipa.community.davideproietto.prg.esempiss.es04;

public class Botteghino {
private int postiDisponibili;

public Botteghino(){
	postiDisponibili =100;
}

public void prenota() throws PrenotazioneException{	// lancia la propagazione dell'eccezione{
	
		if(postiDisponibili ==0){
			throw new PrenotazioneException();
		}
		postiDisponibili --;
}
	

}