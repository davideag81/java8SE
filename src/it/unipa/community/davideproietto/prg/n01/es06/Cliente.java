package it.unipa.community.davideproietto.prg.n01.es06;

public class Cliente {
private String nome;
private String cognome;
//private CartaFedeltà card;

public Cliente(){
	this("Nome", "Cognome");
}

	public Cliente(String nome, String cognome) {
		this.nome=nome;
		this.cognome=cognome;
	//	this card = new CartaFedelta();
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


}