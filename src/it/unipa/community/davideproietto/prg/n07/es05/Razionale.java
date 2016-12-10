package it.unipa.community.davideproietto.prg.n07.es05;

public class Razionale extends Numero implements AritmeticaRazionale {

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
			
@Override			
public Razionale somma(Razionale r){
			Razionale rz = new Razionale();
			rz.setNum(this.num*r.den + this.den*r.num);
			rz.setDen(this.den * r.den);
			rz.Semplifica();
			return rz;	
			}
			
public Razionale sottrazione(Razionale r){
	Razionale r = 
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
			


@Override
public Razionale somma(Numero n) {
	Razionale r =  (Razionale)n;
	Razionale rz = new Razionale();
	rz.setNum(this.num*n.den + this.den*n.num);
	rz.setDen(this.den * n.den);
	rz.Semplifica();
	return rz;	
	}

@Override
public Numero sottrazione(Numero n) {
		// TODO Auto-generated method stub
	return null;
	}

@Override
public Numero moltiplicazione(Numero n) {
		// TODO Auto-generated method stub
	return null;
	}

@Override
public Numero divisione(Numero n) {
		// TODO Auto-generated method stub
	return null;
	}
*/
}