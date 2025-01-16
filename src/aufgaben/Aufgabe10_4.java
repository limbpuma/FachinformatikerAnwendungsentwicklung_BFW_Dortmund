package aufgaben;

import java.util.Scanner;

/* 
 * I = U/R  
	U = iSpannung
	R = iWiderstand
*/

public class Aufgabe10_4
{

	public static void main (String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Gibt die Spannung deines Gerät:");
		int iSpannung = scan.nextInt();
		
		System.out.println("Gibt die Widerstand deines Gerät:");
		int iWiderstand = scan.nextInt();
		
		
		double iStromstaerke = (iSpannung + 0.0)/iWiderstand;
		
		System.out.println(iStromstaerke);
		
	}
	
}
