package it.unipa.community.davideproietto.prg.n07.es05;


public class Complex extends Numero implements AritmeticaComplex {

		private double re, im;

		public Complex(){
			this(0.0, 0.0);
		}

		public Complex(double re, double im){
			this.re = re;
			this.im = im;
		}
@Override
		public Complex somma(Numero n){
			Complex c = (Complex)n;  // si crea un oggetto polimorfismo per metodi
			Complex ris = new Complex();//e invocazione metodo virtuale
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
