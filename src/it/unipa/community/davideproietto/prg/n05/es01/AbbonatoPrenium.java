package it.unipa.community.davideproietto.prg.n05.es01;


public class AbbonatoPrenium extends Abbonato {
private double acquistoGratuito = 0.0;

	public AbbonatoPrenium() {  // costruttore default
			this.setAcquistoGratuito(acquistoGratuito);			
	}

	public double getAcquistoGratuito() {
		return acquistoGratuito;
	}

	public void setAcquistoGratuito(double acquistoGratuito) {
		this.acquistoGratuito = acquistoGratuito;
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
	    s.append("\nAcquistoGratuito: ").append(this.getAcquistoGratuito());
	    return s.toString();
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
