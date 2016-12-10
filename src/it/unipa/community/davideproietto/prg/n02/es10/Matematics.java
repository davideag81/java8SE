package it.unipa.community.davideproietto.prg.n02.es10;

import java.util.Random;

public class Matematics {
	Random rand = new Random();
	
	public  void genVector(int length){
		int k[] = new int[length];
		for (int i = 0; i<length ;i++){
			k[i]=rand.nextInt(100);
		}
//			return  k[];
	}

}

