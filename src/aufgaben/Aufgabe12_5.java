package aufgaben;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
/*
 * Schreiben Sie ein Programm, dass den Anwender nach seinem Geburtsjahr fragt, 
 * kodiert als zwei Ziffern (wie "62"), und nach dem aktuellen Jahr fragt, 
 * ebenfalls kodiert als zwei Ziffern (wie 99). Das Programm soll das richtige Alter des Anwenders 
 * in Jahren ausgeben.
 */
public class Aufgabe12_5
{
	public static void main (String [] args) throws IOException  {
		
		System.out.println("Y2K Problem-Detektor");

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		
		String input;
		int iGeburtsjahr,iAktuellesJahr;
		
		System.out.println("Geburtsjahr: ");
		input = scan.readLine();
		iGeburtsjahr = Integer.parseInt(input);
		
		System.out.println("Geburtsjahr: ");
		input = scan.readLine();
		iAktuellesJahr = Integer.parseInt(input);
		
		System.out.printf("""
				Geburtsjahr: %02d\n
				Aktuelles Jahr: %02d\n
				""",iGeburtsjahr,iAktuellesJahr);
		
		if (iGeburtsjahr > iAktuellesJahr) {
			iAktuellesJahr+=100;}
		
		int berechung = iAktuellesJahr - iGeburtsjahr;
		
		System.out.println("Ihr Alter ist: " + berechung);
		
	}

}
