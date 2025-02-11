package aufgaben;

public class Ubung10_02
{
	public static void main (String  [] args) {
		int a = 5;
		int b = 7;
		
		
		a=a-b;
		
		
		b=a+b;
		
		
		System.out.println("a=" + b + "-" + a); // So sehen wir den wert
		a=b-a; 
		
		System.out.println("a = " + (b-a ) + " -> a" + a + "> b" + b);
		System.out.println("a="+a);
		
	}
}
