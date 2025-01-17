package aufgaben;

import java.util.Scanner;
/*
 * Schreiben Sie ein Programm, dass den Anwender nach seinem Geburtsjahr fragt, 
 * kodiert als zwei Ziffern (wie "62"), und nach dem aktuellen Jahr fragt, 
 * ebenfalls kodiert als zwei Ziffern (wie 99). Das Programm soll das richtige Alter des Anwenders 
 * in Jahren ausgeben.
 */
public class Aufgabe12_5
{
	public static void main (String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Geburtsjahr: ");
		int iGeburtsjahr = scan.nextInt();
		
		System.out.println("Aktuelles Jahr: ");
		int iAktuellesJahr = scan.nextInt();
		
		
		System.out.printf("""
				Geburtsjahr: %d\n
				Aktuelles Jahr: %02d\n
				""",iGeburtsjahr,iAktuellesJahr);
		
		if (iGeburtsjahr > iAktuellesJahr) {
			iAktuellesJahr+=100;}
		
		int berechung = iAktuellesJahr - iGeburtsjahr;
		
		System.out.println("Ihr Alter ist: " + berechung);
		
	}

}
