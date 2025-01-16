package aufgaben;

import java.util.Scanner;

public class Aufgabe10_2 {
	public static void main (String [] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Geben Sie die Cent ein: ");
		int kundeInput = scan.nextInt();
		
		int changeToDollar =  kundeInput/100;
		
		int changeToCent = kundeInput%100;
		
		// System.out.println(changeToCent);
		
		// System.out.println(changeToDollar);
		
		System.out.println("Das ergibt " + changeToDollar + " Dollar und " + changeToCent + " Cent.");
		
	}
}
