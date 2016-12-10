package it.unipa.community.davideproietto.prg.n05.es03;

public class Point2D{
	private double cordX;
	private double cordY;
	//private final double orig = 0.0D;
	
	
	public Point2D() { // punto 2d sull'origine
		this.setCordX(0.0);
		this.setCordY(0.0);
	
	}

	public Point2D(double cordX, double cordY) {
		this.cordX = cordX;
		this.cordY = cordY;
		
	}
	public double getCordX() {
		return cordX;
	}

	public void setCordX(double cordX) {
		this.cordX = cordX;
	}

	public double getCordY() {
		return cordY;
	}

	public void setCordY(double cordY) {
		this.cordY = cordY;
	}
	
	public double distanceFromOrig(){
		double tmp = Math.pow(cordX, 2) + Math.pow(cordY, 2);
		return Math.sqrt(tmp);
	}
	
@Override
public String toString(){
	return ("(<" + getCordX() + "> , <" + getCordY() + ">)");
}

	public static void main(String[] args) {
		

	}

}
