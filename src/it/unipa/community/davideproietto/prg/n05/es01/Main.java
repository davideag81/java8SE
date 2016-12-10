package it.unipa.community.davideproietto.prg.n05.es01;

import it.unipa.community.davideproietto.prg.n04.es04.Date;

public class Main {

public static void main(String[] args) {
Persona cliente1 = new Persona((new Date(1,2,1985)),"mario","rossi","mrirss085a02g273r","via verdi","palermo","90120");
Abbonato cliente2 = new Abbonato();
AbbonatoPrenium cliente3 = new AbbonatoPrenium();

System.out.println(cliente1.toString());
System.out.println();
System.out.println(cliente2.toString());
System.out.println();
System.out.println(cliente3.toString());
	}

}
