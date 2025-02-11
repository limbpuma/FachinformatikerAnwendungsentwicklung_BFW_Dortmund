package aufgaben;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Schreiben Sie ein Programm mit 2 verschachtelten while-Schleifen, welches von einem Startguthaben (z.B. 200 Tacken)
einen Kaufbetrag abzieht (Eingabe Kaufbetrag). Das Programm zeigt das neue Guthaben an (Ausgabe Guthaben) und 
fordert erneut zur Eingabe des Kaufbetrags auf (Eingabe Kaufbetrag). Falls der eingegebene Betrag das Guthaben Ã¼bersteigt, 
soll solange zur Eingabe eines passenden Kaufbetrags aufgefordert werden, bis Guthaben - Kaufbetrag
>= 0. Wenn das Guthaben verbraucht ist, wird eine Meldung ausgegeben (Guthaben verbraucht) und das Programm beendet.
 */


public class Aufgabe15_Public1
{
	public static void main (String [] args)throws IOException{
	
	System.out.println("Zaehler!");

	BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

	String inputString;
	double startGuthaben = 200, kaufbetrag, newGuthaben, berechnung;
	boolean schleife = true;
	
	
	
	
	while(schleife) {
		
		
		System.out.println("Geben Sie das erste Wort ein: ");
		inputString = scan.readLine();
		kaufbetrag = Double.parseDouble(inputString);
		
		 
		
			newGuthaben = startGuthaben - kaufbetrag;
			startGuthaben= newGuthaben;
			System.out.println(startGuthaben);
			if (startGuthaben <= 0 )
			{
			schleife = false;
			System.out.println("Ende");
			}
					
	}
		
	}
}
