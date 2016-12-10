package it.unipa.community.davideproietto.prg.n06.es03;
import java.math.*;;
public class Moneta extends Lancio implements Launch {
private String face[]={" TESTA ", " CROCE "};

	@Override
	public boolean result() {
			int lancio = (int)(Math.random()*4);
			boolean res = false;
			if(lancio%2 == 0)
				res= true;	
			return res;
	}

	public Moneta() {
		super();
		boolean  = face[0];
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Moneta [face()=" + face() + ", combination()=" + combination() + ", isRsset()=" + isRsset()
				+ ", getFace()=" + getFace() + ", draw()=" + draw() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	public Moneta(int face) {
		setFace(face);
	}

	@Override
	public int face() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int combination() {
		// TODO Auto-generated method stub
		return 0;
	}

}
