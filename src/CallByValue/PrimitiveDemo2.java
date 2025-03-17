package CallByValue;

public class PrimitiveDemo2
{
	public static void main(String[]args) {
		double preis = 10.0;
		boolean status = false;
		
		System.out.println("Preis vorher: "+ preis);
		System.out.println("Status vorher: "+ status);
		
		rabattGeben(preis);
		statusAendern(status);
		
		System.out.println("Preis nachher: "+ preis);
		System.out.println("Status nachher: "+ status);
	}
	
	static void rabattGeben(double p) {
		p-=20; // p wird nur lokal geandert
		System.out.println("In der Methode (status): "+ p);
	}
	
	static void statusAendern(boolean s) {
		s = true; // s wird nur lokal geandert
		System.out.println("In der Methode (Status): "+ s);
	}
}
