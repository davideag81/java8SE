package it.unipa.community.davideproietto.prg.n08.es07;

public class Mazzo {
private final int NUM_CARTE =40;
public final Carta[] siciliane = new Carta[NUM_CARTE];

	public Mazzo(){
		int id ;
		semeCarta seme[] = semeCarta.values();
		valoreCarta value[] = valoreCarta.values();
		
		for (semeCarta tmp : seme){
			for (valoreCarta tmp2 : value){
				for(id=1; id< NUM_CARTE; id++)	
				this.siciliane[id] = new Carta(tmp, tmp2);
				}
		}
	}
//@Override	
	public Carta getCarta(int id) { 
	        if (id >= NUM_CARTE) { 
            throw new ArrayIndexOutOfBoundsException("Il mazzo è composto da sole " + NUM_CARTE + " carte!"); 
	       } 
	     return this.siciliane[id]; 
		  } 

		public Carta[] getSiciliane() {
		return siciliane;
	}


		@Override
		public String toString(){
			return ""  ;
	}
}