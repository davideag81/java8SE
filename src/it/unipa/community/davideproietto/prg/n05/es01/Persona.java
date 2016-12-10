package it.unipa.community.davideproietto.prg.n05.es01;
import it.unipa.community.davideproietto.prg.n04.es04.Date;
public class Persona {
private Date dataDiNascita;
private String nome;
private String cognome;
private String codiceFiscale;
private String indirizzo;
private String citta;
private String cap;
	
/*	public Persona(String dataDiNascita, String nome, String cognome, String codiceFiscale, String indirizzo, String citta, String cap){
		this(new Date(dataDiNascita), nome, cognome, codiceFiscale, indirizzo, citta, cap);
	}
*/	
	public Persona(Date dataDiNascita, String nome, String cognome, String codiceFiscale, String indirizzo, String citta, String cap){ // costruttore parametrizzato
		this.setDataDiNascita(dataDiNascita);
		this.setNome(nome);
		this.setCognome(cognome);
		this.setCodiceFiscale(codiceFiscale);
		this.setIndirizzo(indirizzo);
		this.setCitta(citta);
		this.setCap(cap);
	}
	
	public Persona(Persona persona) { // costruttore a cui viene passato un oggetto persona
        this(persona.getDataDiNascita(), persona.getNome(), persona.getCognome(), persona.getCodiceFiscale(), persona.getIndirizzo(), persona.getCitta(), persona.getCap());
    }
	
	public Persona(){// costruttore di default
		this(new Date(1,1,1970), "nome", "cognome", "codiceFiscale", "indirizzo", "citta", "cap");
	}
	
	
	public Date getDataDiNascita() {
		return dataDiNascita;
	}

	public Date setDataDiNascita(Date dataDiNascita) {
		return this.dataDiNascita = dataDiNascita;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public String getCap() {
		return cap;
	}

	public void setCap(String cap) {
		this.cap = cap;
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
    return s.toString();
//	return ("Persona: " + getDataDiNascita() + getNome() + getCodiceFiscale() + getIndirizzo() + getCitta() + getCap());
}
	
	public static void main(String[] args) {
		Persona p1 = new Persona();
		Persona p2 = new Persona((new Date(1,2,1985)),"mario","rossi","mrirss085a02g273r","via verdi","palermo","90120");
		p1.toString();
		p2.toString();

	}

}
