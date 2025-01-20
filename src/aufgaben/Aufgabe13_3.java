package aufgaben;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 Der Hersteller eines Mikrowellenherds empfiehlt beim Erhitzen von zwei Posten 50% mehr Erhitzungszeit und beim Erhitzen von drei Posten, die Erhitzungszeit zu verdoppeln. Das Erhitzen von mehr als drei Posten wird nicht empfohlen.

Schreiben Sie ein Programm, das den Anwender nach der Anzahl der Posten und nach der Erhitzungszeit für einen Posten fragt. Das Programm gibt dann die empfohlene Erhitzungszeit aus.
 */

public class Aufgabe13_3
{
	public static void main (String [] args) throws IOException{
		
		System.out.println("Mikrowellenherd!!");
		
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

		String inputOne, inputTwo;
		int posten, erhitzen, empfohleneZeit;
		
		System.out.println("Geben Sie die Anzahl der Posten: ");
		inputOne = scan.readLine();
		posten = Integer.parseInt(inputOne);
		
		
		System.out.println("Geben Sie die Erhitzungszeit für einen Posten: ");
		inputTwo = scan.readLine();
		erhitzen = Integer.parseInt(inputTwo);
		
		
		if (posten == 1) {
			posten= posten;		
		} else if(posten >= 2 & posten <= 3) {
			posten+= (posten/2);
		} else {
			posten+= (posten/2);
			System.out.println("Das Erhitzen von mehr als drei Posten wird nicht empfohlen!");
		}
		
		
		empfohleneZeit = posten * erhitzen;
		
		System.out.println("Die Empfohlene zeit ist: " + empfohleneZeit);
		
		
		
	}
}
