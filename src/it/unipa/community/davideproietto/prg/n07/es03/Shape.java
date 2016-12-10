package it.unipa.community.davideproietto.prg.n07.es03;

public abstract class Shape implements Comparable <Shape> {  // inplementa l'interfaccia Comparable tra poligoni <>
private String color[] = {"BLACK", "WHITE", "YELLOW", "RED", "GREEN", "BLUE", "PURPLE", "BROWN"};
private boolean filled;
	public Shape() {
		setColor(color);
		setFilled(true);
	}

public abstract double perimeter();	 // METODI CHE DOVRANNO ESSERE IMPLEMENTATI MA NON OBBLIGATORIAMENTI
public abstract double area();	 

@Override	
public int compareTo(Shape r){ // comparo tra figure l'area
	if (this.area()< r.area())
		return -1;
	if (this.area()> r.area())
		return 1;
	return 0;
}



public String[] getColor() {
	return color;
}
public void setColor(String[] color) {
	this.color = color;
}
public boolean isFilled() {//getFilled
	return filled;
}
public void setFilled(boolean filled) {
	this.filled = filled;
}
public static void main(String[] args) {
	// TODO Auto-generated method stub

}
}
