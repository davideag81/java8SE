package it.unipa.community.davideproietto.prg.n05.es01;

import it.unipa.community.davideproietto.prg.n04.es04.Date;

public class Abbonato extends Persona {
private double sconto;

public Abbonato(){
	super(new Date(1,1,1970), "nome", "cognome", "codiceFiscale", "indirizzo", "citta", "cap");
	this.setSconto(sconto);
}

public double getSconto() {
	return sconto;
}



public void setSconto(double sconto) {
	this.sconto = sconto;
}

@Override
public String toString(){
    StringBuilder s = new StringBuilder();
    s.append("Cognome: ").append(this.getCognome());
    s.append("\nNome: ").append(this.getNome());
    s.append("\nNato il ").append(this.getDataDiNascita());
    s.append("\nIndirizzo: ").append(this.getIndirizzo()).append("\n");
    s.append(this.getCap()).append(" ").append(this.getCitta());
    s.append("\nCodice Fiscale: ").append(this.getCodiceFiscale());
    s.append("\nSconto: ").append(this.getSconto());
    return s.toString();
//	return ("Persona: " + getDataDiNascita() + getNome() + getCodiceFiscale() + getIndirizzo() + getCitta() + getCap());
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
