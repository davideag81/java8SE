package it.unipa.community.davideproietto.prg.n06.es03;

public abstract class Lancio implements Launch {
private boolean rsset;
private int face;

	public boolean isRsset() {
	return rsset;
}

public void setRsset(boolean rsset) {
	this.rsset = rsset;
}

public int getFace() {
	return face;
}

public void setFace(int face) {
	this.face = face;
}

	public Lancio() {
		this.rsset= true;// TODO Auto-generated constructor stub
	}
	
	public abstract int face();
	public abstract int combination();
	
	public boolean draw(){
		//boolean tmp;
	return this.rsset;
	}

}
