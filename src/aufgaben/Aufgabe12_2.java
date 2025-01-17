package aufgaben;

import java.util.Scanner;

public class Aufgabe12_2
{

	public static void main (String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		final int schraubePreis = 5;
		final int mutterPreis = 3;
		final int unterlegscheibePreis = 1;
		
		System.out.println("Anzahl der Schrauben: ");
		int iSchraube = scan.nextInt() * schraubePreis;
		
		System.out.println("Anzahl der Muttern: ");
		int iMutter = scan.nextInt() * mutterPreis;
		
		System.out.println("Anzahl der Unterlegscheiben: ");
		int iUnterleg = scan.nextInt() * unterlegscheibePreis;
		
		
		
		int berechnung = iSchraube + iMutter + iUnterleg;
		
		System.out.println("Kontrollieren Sie Ihre Bestellung! \n\nGesamtbetrag: " + berechnung);
		
	}
	
}
