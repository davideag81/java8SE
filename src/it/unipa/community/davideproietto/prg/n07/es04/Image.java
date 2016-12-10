package it.unipa.community.davideproietto.prg.n07.es04;
import it.unipa.community.davideproietto.prg.n05.es03.Point2D;
import java.util.Random;

import javax.xml.crypto.Data;

public class Image {
private final int  R,C;
private int data[][];
	
public Image (int R, int C) {
	this.R = R;
	this.C = C;
	this.data = new int [R][C];
		setData(R,C);
		}
	

public Image (int R) {
	this.R = R;
	this.C = 1;
	}

public Image (){
	this(1,1);
	setData(this.C, this.R);
}

	public int getR() {
		return R;
	}

	/*public void  setR(int R) {
		this.R = R;
	}*/

	public int getC() {
		return C;
	}

	/*public void setC(int C) {
		this.C = C;
	}*/
/*
	public int[][] getData() {
		Random rand = new Random();
		int[][] 
		for (int i=0 ; i<=R; i++){
			for (int j=0; j<=C ; j++){
				data[i][j] = rand.nextInt(255);
				}
			}
		return data;
	}*/

	public void setData(int R, int C) {
		Random rand = new Random();
		for (int i=0 ; i<data.length; i++){
			for (int j=0; j<data[i].length ; j++){
				this.data[i][j] = rand.nextInt(255);

		//return data;
	}

}
}
	@Override 
	public String toString(){
		return Arrays.ToString(data);
	}
}
