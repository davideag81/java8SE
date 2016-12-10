package it.unipa.community.davideproietto.prg.esempiss.es83;

public class Ecc1 {

	public static void main(String[] args) {
	int a= 10;
	int b= 0;

try {
	 int c = a/b;
} catch (ArithmeticException exc) {
	exc.printStackTrace();	// STACKTRACE
}
finally{
System.out.println(""+"c"+"");
	}
}

}
