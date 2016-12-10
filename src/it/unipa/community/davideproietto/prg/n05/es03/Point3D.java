package it.unipa.community.davideproietto.prg.n05.es03;

public class Point3D extends Point2D {
private double cordZ;

	public Point3D() { /// punto sulle origini
		super();
		this.cordZ = 0D;
	}

	public Point3D(double cordX, double cordY, double cordZ) {
		super(cordX, cordY);
		this.cordZ = cordZ;
		
	}
	
@Override
public double distanceFromOrig(){
	double tmp = (Math.pow(getCordX(), 2) + Math.pow(getCordY(), 2));
	tmp += Math.pow(cordZ,2);
	return Math.sqrt(tmp);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
