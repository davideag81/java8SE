package it.unipa.community.davideproietto.prg.n04.es02;

public class Complex {

		private double re, im;

		public Complex(){
			this(0.0, 0.0);
		}

		public Complex(double re, double im){
			this.re = re;
			this.im = im;
		}

		public Complex somma(Complex c){
			Complex ris = new Complex();
			ris.re = this.re + c.re;
			ris.im = this.im + c.im;
			return ris;
		}

		public void stampa(){
			System.out.println(this.re + " + i " + this.im);
		}

		public static Complex somma(Complex a, Complex b){
			Complex ris = new Complex();
			ris.re = a.re + b.re;
			ris.im = a.im + b.im;
			return ris;		
		}

		public static void stampa(Complex c){
			System.out.println(c.re + " + i " + c.im);
		}
	}
