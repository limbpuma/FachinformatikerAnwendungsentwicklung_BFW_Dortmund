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
		
		int iSpannung, iWiderstand;
		
		System.out.println("Gibt die Spannung deines Gerät:");
		iSpannung = scan.nextInt();
		
		System.out.println("Gibt die Widerstand deines Gerät:");
		iWiderstand = scan.nextInt();
		
		
		double iStromstaerke = (iSpannung + 0.0)/iWiderstand;
		
		System.out.println(iStromstaerke);
		
	}
	
}
