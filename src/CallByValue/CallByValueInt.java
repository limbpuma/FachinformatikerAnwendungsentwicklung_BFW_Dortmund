package CallByValue;

public class CallByValueInt
{
	public static void main (String[]args) {
		int zahl = 10;
		System.out.println("Vorher: "+ zahl);
		verdoppeln(zahl);
		System.out.println("Nachher: "+ zahl);
	}
	
	static void verdoppeln(int x) {
		x = x * 2; // Nur die Kopie wir verändert
		System.out.println("In der Methode: " + x);
	}
} 
