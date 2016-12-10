package it.unipa.community.davideproietto.prg.esempiss.es732;

public class Main {

	public static void main(String[] args) {

		Dipendente [] arr = new Dipendente[180];
		arr [0]  = new Dirigente();
		arr [1]  = new Programmatore();
		arr [2]  = new AgenteDiVendita();
		//...
		
		for(int i =3 ; i <180 ; i++){
			arr[i] = new Programmatore();
		}
	
public void pagaDipendente (Dipendente dip){
	if (dip instanceof Programmatore){			// cerca per reference nelle sottoclassi
		Programmatore pro = (Programmatore) dip;  // casting esplicito per accedere alle variabili d'istanza della sotto classe tramite un reference della superclasse
		if (pro.getAnniDiEsperienza() > 2){
			dip.getStipendio() = 1800;
		}else{
		dip.getStipendio() = 1200;
	}
		}
	else if (dip instanceof Dirigente){
		dip.stipendio = 3000;
	}
	else if (dip instanceof AgenteDiVendita){
		dip.stipendio = 1000;
	}
	  System.out.println(dip.getClass().getNome() + " - Stipendio = " + dip.stipendio);
}
		
for (Dipendente dipendente : arr ){		// con un cilco foreach passiamo tutta la collezione eterogenea al metodo pagaDipendente
	pagaDipendente(dipendente);
}
	}

}
