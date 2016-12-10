package it.unipa.community.davideproietto.prg.n06.es04;
import it.unipa.community.davideproietto.prg.n05.es03.Point2D;
public class Roi {
	private Point2D topLeft;
	private Point2D bottomRight;


	public Roi(Point2D topLeft, Point2D bottomRight) {		// costruttore parametrizzato
		if(topLeft.getCordX() <= bottomRight.getCordX() && topLeft.getCordY() <= bottomRight.getCordY()){
			this.topLeft = new Point2D(topLeft.getCordX(), topLeft.getCordY());
			this.bottomRight = new Point2D(bottomRight.getCordX(), bottomRight.getCordY());
		}else{
			this.topLeft = new Point2D(0.0, 0.0);	// se il due puntio non individuano uno spazio imposta tutto sull'origine
			this.bottomRight = new Point2D(0.0, 0.0);	
		}
	}
	
	public Roi(){	// ROI a 0
			this(new Point2D(0.0, 0.0), new Point2D(0.0, 0.0));
	}
			
public int getHeight(){	//restituisce il numero di righe
	return (int)(bottomRight.getCordY() - topLeft.getCordY());//cast esplicito

}

public int getWidth(){ //restituisce il numero di colonne
	return (int)(bottomRight.getCordX() - topLeft.getCordX());
}
	
public boolean isValid(){	// verifica se l'immagine è valida
	return (getWidth()>0 && getHeight()>0);
}

public Point2D getTopLeft() {
	return topLeft;
}

public void setTopLeft(Point2D topLeft) {
	this.topLeft = topLeft;
}

public Point2D getBottomRight() {
	return bottomRight;
}

public void setBottomRight(Point2D bottomRight) {
	this.bottomRight = bottomRight;
}
		
		
	}