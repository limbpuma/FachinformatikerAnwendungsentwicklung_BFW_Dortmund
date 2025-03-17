package CallByValue;

public class CallByValueDemo
{
	public static void main(String []args) {
		int a = 10;
		System.out.println("Vor dem Methodenaufruf; a =" + a);
		
		changeValue(a); // Ubergibt eine KOPIE von "a"
		
		System.out.println("Nach dem Methodenaufruf: a = "+ a);
	}
	
	static void changeValue(int x) {
		x = 20; // Änder nur die KOPIE, nicht das Original
		System.out.println("In der Methode: x = "+ x);
	}
}


/*

Vor dem Methodenaufruf: a = 10
In der Methode: x = 20
Nach dem Methodenaufruf: a = 10

*/