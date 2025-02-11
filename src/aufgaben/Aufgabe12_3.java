package aufgaben;

/*
 Al's Last Chance Gas Station befindet sich an der Straße 190 am Rande des Death Valley. 
 Die nächsten 200 Meilen gibt es keine weitere Tankstelle. Sie sollen ein Programm schreiben, 
 das den Fahrern hilft zu entscheiden, ob sie tanken sollen oder nicht. Das Programm fragt nach:

Der Tankkapazität in Gallonen (3,78l)
Der Benzinanzeige in Prozent (voll= 100, drei viertel voll = 75 usw.)
Dem Benzinverbrauch des Fahrzeuges in Meilen pro Gallone.
 */

import java.util.Scanner;

public class Aufgabe12_3
{

	public static void main(String[] args)
	{

		System.out.println("Wellcome to Last Chance Gas Station!\n");

		Scanner scan = new Scanner(System.in);

		System.out.println("Tankkapazität: ");
		double iTankkapazitaet = scan.nextDouble();

		System.out.println("Benzinanzeige: ");
		double iBenzinanzeige = scan.nextDouble();

		System.out.println("Meilen pro Gallone: ");
		double iGallone = scan.nextDouble();
		
	
		
		double aktuelleGalone = iTankkapazitaet *(iBenzinanzeige/100);
		// System.out.print(aktuelleGalone);
		
		double verbraucht = aktuelleGalone * iGallone;
		// System.out.print(verbraucht);
		
		int naschteTankstelle = 200;
		// System.out.print(naschteTankstelle);
		
		if(verbraucht < naschteTankstelle) {
			System.out.println("Bitte Tanken!");
		}else {
			System.out.println("Können Sie Weiterfahren");
		}
		
		

	}

}
