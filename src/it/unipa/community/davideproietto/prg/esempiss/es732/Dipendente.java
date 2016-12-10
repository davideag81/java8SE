package it.unipa.community.davideproietto.prg.esempiss.es732;

public /*abstract */class Dipendente {
private String nome;
private int stipendio;
private int matricola;
private String dataDiNascita;
private String dataDiAssunzione;



public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public int getStipendio() {
	return stipendio;
}
public void setStipendio(int stipendio) {
	this.stipendio = stipendio;
}
public int getMatricola() {
	return matricola;
}
public void setMatricola(int matricola) {
	this.matricola = matricola;
}
public String getDataDiNascita() {
	return dataDiNascita;
}
public void setDataDiNascita(String dataDiNascita) {
	this.dataDiNascita = dataDiNascita;
}
public String getDataDiAssunzione() {
	return dataDiAssunzione;
}
public void setDataDiAssunzione(String dataDiAssunzione) {
	this.dataDiAssunzione = dataDiAssunzione;
}



}
