package it.unipa.community.davideproietto.prg.n08.es07;

public class Carta{
private  final semeCarta SEME;		// caratteristica non modificabile di una carta
private final valoreCarta VALORE_CARTA;	//		//			//	//			//	//	//

public Carta(semeCarta seme, valoreCarta valoreCarta) {
	this.SEME = seme;
	this.VALORE_CARTA = valoreCarta;
}

@Override
public String toString(){
	return "" + this.SEME + this.VALORE_CARTA;
}
public semeCarta getSeme() {
	return SEME;
}
//public void setSeme(String seme) {
	//this.SEME = seme;
//}
public valoreCarta getValoreCarta() {
	return VALORE_CARTA;
}
//public void setValoreCarta(int valoreCarta) {		// i metodi set sono disabilitati perchè non si può modificare seme e valore di una carta dopo che è stata istanziata
	//this.VALORE_CARTA = valoreCarta;
//}



}
