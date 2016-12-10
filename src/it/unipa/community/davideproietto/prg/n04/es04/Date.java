package it.unipa.community.davideproietto.prg.n04.es04;

public class Date {
private int giorno;
private int mese;
private int anno;
// per comodità negli array non uso indice 0
private static final String[] nomeMese = {"", "Gennaio", "Febbraio", "Marzo", "Aprile", "Maggio", "Giugno", 
									"Luglio", "Agosto", "Settembre", "Ottobre", "Novembre", "Dicembre"};
private static final int[] giorniMese = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public Date(){ 	// costruttore di default
		this(1,1,1970);
	}
	
	public Date(int giorno, int mese, int anno){ 	// costruttore parametrizzato
		setDate(giorno, mese, anno);
		
	}
	
	public Date(int giorno, int anno){ 	// costruttore parametrizzato *nota: non esiste un controllo per il bisestile
		int gg, mm;
		gg = mm = 1;
		//if(giorno>31 && <=365){
			for(int i=1; i<=12; i++){
				giorno -= giorniMese[i];
				if(giorno<=0){
					mm = i ;
					gg = giorno + giorniMese[i];
					break;
			}
				
		}
		setDate(gg, mm, anno);
	}
		
	public Date(int giorno, String mese, int anno){ 	// costruttore parametrizzato
		int mm = 1;
		for(int i=1; i<=12; i++){
			if (mese == nomeMese[i]){
				mm = i;
				break;
			}
			
		}
		setDate(giorno, mm, anno);
		
	}
	
	public int getGiorno() {
		return giorno;
	}

	public void setGiorno(int giorno) {
		this.giorno = giorno;
	}

	public int getMese() {
		return mese;
	}

	public void setMese(int mese) {
		this.mese = mese;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public void setDate(int giorno, int mese, int anno) {
		// verifica che la data è valida e setta le variabili d'istanza
		// se non è valida setta una data convenzionale (es. 1/1/1970)
		if(mese>=1 && mese <=12 && giorno >= 1 && giorno <= giorniMese[mese]){
			this.giorno = giorno;
			this.mese = mese;
			this.anno = anno;
		} else {
			this.giorno = 1;
			this.mese = 1;
			this.anno = 1970;
		}
	}	
	

//public String toString(){
	public void stampa2(){	// GG/MM/AA
		System.out.println(giorno + "/" + this.mese + "/" + (this.anno-1900));
	}

	public void stampa3(){	// GG mese AAAA
		System.out.println(this.giorno + " " + nomeMese[this.mese] + " " + this.anno);
	}
@Override
	public String toString(){
		return(this.giorno + " " + nomeMese[this.mese] + " " + this.anno);		
	}
//}
	
	public static void main(String[] args) {
		// Main per test
		Date d1 = new Date();
		d1.stampa2();

	}

}
