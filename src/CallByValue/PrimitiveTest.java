package CallByValue;

public class PrimitiveTest
{
	public static void main (String []args) {
		double preis = 50.5;
		System.out.println("Vorher: "+ preis);
		
		rabattGeben(preis);
		
		System.out.println("Nachher: "+ preis);
	}
	
	static void rabattGeben(double p) {
		p -= 10.0; // p = p - 10, nur die Kopie wird verändert
		System.out.println("In der Methode: "+ p);
	}
}

/*
Vorher: 50.5
In der Methode: 40.5
Nachher: 50.5
 
*/
