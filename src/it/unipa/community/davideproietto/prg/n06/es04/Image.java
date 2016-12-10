package it.unipa.community.davideproietto.prg.n06.es04;
import java.util.Random;
//import it.unipa.community.davideproietto.prg.n05.es03.Point2D;


public class Image {
private final int R,C;
private int data[][];
	
	public Image (int r, int c) { // costruttore parametrizzato che genera e alloca una matrice pseudocasuale
		
	this.R = r;
	this.C = c;
	Random rand = new Random(); // generatore di numeri pseudo  casuali
	
	data = new int[R][];	//  itera le righe creandole
		for (int i = 0 ; i< R; i++)
			data[i]= new int [C]; // itera le colonne creandole
		
				for (int i=0; i< R; i++)	// adesso riempie la matrice con valori pseudocasuali
					for (int j = 0 ; j < C; j++)
						this.data[i][j] = rand.nextInt(256);
	}
	public Image () {	// costruttore default
		this(256, 256);
	}

	public Image getRoiImage(Roi r){  // estrae una porzione d'immagine ROI
		Image imm;
		if(r.isValid()){
			imm = new Image(r.getHeight(), r.getWidth());
			for(int i=0; i<r.getHeight(); ++i) // indice di riga
				for(int j=0; j<r.getWidth(); ++j) // indice di colonna
					imm.data[i][j] = this.data[(int)r.getTopLeft().getCordY()+i][(int)r.getTopLeft().getCordX()+j];
		} else {
			imm = new Image(0, 0);
		}
		return imm;
	}
	
	
}
