package aufgaben;

import java.util.Scanner;

public class Aufgabe10_1 {
	public static void main (String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Geben Sie den Radius ein: ");
		int radiusInput = scan.nextInt();
		
		final double PI = 3.14159265358979;
		
		double ergebnis = PI*Math.pow(radiusInput, 2);
		
		
		System.out.println("Der radius ist: "+ ergebnis);
	}

}
