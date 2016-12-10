package it.unipa.community.davideproietto.prg.n05.es05;

public abstract class Shape {
private String color[] = {"BLACK", "WHITE", "YELLOW", "RED", "GREEN", "BLUE", "PURPLE", "BROWN"};
private boolean filled;
	public Shape() {
		setColor(color);
		setFilled(true);
	}

public abstract double perimeter();	 // METODI CHE DOVRANNO ESSERE IMPLEMENTATI MA NON OBBLIGATORIAMENTI
public abstract double area();	 



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
