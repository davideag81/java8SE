package it.unipa.community.davideproietto.prg.n07.es02;

public class Razionale implements Comparable<Razionale> {
	private int num = 1;
	private int den = 1;

		public Razionale(int num, int den) {  // OVERLOAD
			this.num = num;
			this.den = (den != 0 ? den : 1); // operatore ternario
		}

		public Razionale() {
			this(1,1); // costruttore default
		}
		
		public Razionale(int num) {
			this(num,1); // costruttore numeri interi
		}

		@Override
		public String toString(){
			return ("  " +num +"\n"
					+ "-----\n"
					+ "  "+ den + "   \n\t");
		}
		
		public void Semplifica(){
			for(int i = 13; i>=2; i--){
			if (this.num%i ==0 && this.den%i==0){
				this.num/=i;
				this.den/=i;
			//return 0;
				}
			}
		}
		
		
		public Razionale somma(Razionale r){
			Razionale rz = new Razionale();
			rz.setNum(this.num*r.den + this.den*r.num);
			rz.setDen(this.den * r.den);
			rz.Semplifica();
			return rz;	
		}
		
		public Razionale sottrazione(Razionale r){
			Razionale rz = new Razionale();
			rz.setNum(this.num*r.den - this.den*r.num);
			rz.setDen(this.den * r.den);
			rz.Semplifica();
			return rz;	
		}
		
		public Razionale moltiplicazione(Razionale r){
			Razionale rz = new Razionale();
			rz.setNum (this.num * r.num);
			rz.setDen(this.den * r.den);
			rz.Semplifica();
			return rz;	
		}
		
		public Razionale divisione(Razionale r){
			Razionale rz = new Razionale();
			rz.setNum(this.num * r.den);
			rz.setDen(this.den * r.num);
			rz.Semplifica();
			return rz;	
		}
		
		public int setNum(int num){
			return this.num = num;
		}
			
		public int setDen(int den){
			return this.den = den;
		}
		
		public int getNum(){
			return this.num;
		}
			
		public int getDen(){
			return this.den;
		}
		
		public static void main(String[] args) {
			Razionale raz1 = new Razionale();
			System.out.println(raz1.toString());

			Razionale raz2 = new Razionale(14,7);
			System.out.println(raz2.toString());
			raz2.Semplifica();
			System.out.println(raz2.toString());
			
			Razionale raz3 = new Razionale(2,3);
			System.out.println(raz3.toString());
			
			raz2.somma(raz3);
			System.out.println(raz2.toString());
			
			raz1.sottrazione(raz3);
			System.out.println(raz1.toString());
			
			raz1.moltiplicazione(raz2);
			System.out.println(raz1.toString());
			
			raz3.divisione(raz1);
			System.out.println(raz3.toString());
			
			
			System.out.println(raz1.compareTo(raz2));
			System.out.println(raz2.compareTo(raz1));
			System.out.println(raz3.compareTo(raz3));
			System.out.println(raz1.compareTo(raz3));
			System.out.println(raz3.compareTo(raz1));
			System.out.println(raz3.compareTo(raz2));
		}

@Override	
public int compareTo(Razionale o){
	if (this.num * o.den - this.den * o.den > 0) return 1;
	if (this.num * o.den - this.den * o.den < 0) return -1;
	return 0;
}
}