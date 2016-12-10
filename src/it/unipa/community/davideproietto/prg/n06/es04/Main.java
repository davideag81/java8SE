package it.unipa.community.davideproietto.prg.n06.es04;
import it.unipa.community.davideproietto.prg.n05.es03.Point2D;

public class Main {

	public static void main(String[] args) {
		Image i = new Image(200, 320);
		Roi r1 = new Roi(new Point2D(20, 20), new Point2D(140, 160));
		Roi r2 = new Roi(new Point2D(30, 20), new Point2D(130, 150));
		Roi r3 = new Roi(new Point2D(50, 40), new Point2D(90, 100));
		Roi r4 = new Roi(new Point2D(10, 60), new Point2D(110, 160));
		 i.getRoiImage(r1);
		i.getRoiImage(r2);
		 i.getRoiImage(r3);
		i.getRoiImage(r4);
		
	}

}
