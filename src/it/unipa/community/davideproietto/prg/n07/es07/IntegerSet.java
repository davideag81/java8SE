package it.unipa.community.davideproietto.prg.n07.es07;
import java.util.Arrays;
//import java.util.Arrays.*;
public class IntegerSet {

	private boolean arr[];	
	
	public IntegerSet(){	// costruttore di default
		boolean [] arr = new boolean[99];
			for(int i = 0 ; i < arr.length; i++)
				Arrays.fill(arr, false);		// nomeclasse.metodo.argomento,parametro:  inizializza tutti gli elementi a false
			}

	public IntegerSet(int ... n){	// costruttore parametrizzato con VARARGS
			this();
			for ( int tmp : n){ // foreach per assegnare ogni varargs
				arr[tmp] = true;
			}
			}
	
}
