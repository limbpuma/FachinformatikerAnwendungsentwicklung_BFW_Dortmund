package aufgaben;
import java.io.*;
public class Aufgabe17_4
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader userIn = new BufferedReader(new InputStreamReader(System.in));
		int anzahlZeilen, // die Anzahl der Zeilen
				zeilenZaehler, leerzeichenZaehler, sterneZaehler; // Laufvariablen

		int maxSterne = 1; // Nur für alternative Lösung benötigt

		// Input vom Anwender sammeln
		System.out.println("Wie viele Zeilen?");
		anzahlZeilen = Integer.parseInt(userIn.readLine());

		// Baumkrone
		zeilenZaehler = 1;
		while (zeilenZaehler <= anzahlZeilen) { /*
												 * Leerzeichen es muss immer ein Leerzeichen weniger pro Zeile
												 * ausgegeben werden, also wird die innere Laufvariable mit dem Wert der
												 * äußeren Laufvariablen initialisiert
												 */
			leerzeichenZaehler = zeilenZaehler;
			while (leerzeichenZaehler <= anzahlZeilen) // Das <= sorgt dafür, dass immer mindestens ein Leerzeichen
			{
				System.out.print(" "); // gesetzt wird und das führt automatisch dazu, dass der Baum
				leerzeichenZaehler++; // auch mit nur einer Zeile korrekt ausgegeben wird
			}

			// Sterne für Baum
			sterneZaehler = 1;

			while (sterneZaehler <= maxSterne) {
				System.out.print("*"); // Sternchen ausgeben
				sterneZaehler++;
			}
			maxSterne += 2;

			// Alternative für die Sterne: --------------------------
//			sterneZaehler = 1;
//			while ( sterneZaehler < zeilenZaehler * 2 )
//			{	System.out.print( "*" ); // Sternchen ausgeben
//				sterneZaehler++;
//			}
			// ------------------------------------------------------

			System.out.println(); // notwendig um jede Zeile zu beenden
			zeilenZaehler++; // nächste Zeile
		}

		// Baumstamm
		// dreimal 3 Sterne ausgeben
		zeilenZaehler = 1;
		while (zeilenZaehler <= 3) // also 3 Zeilen
		{ /* Leerzeichen */
			leerzeichenZaehler = 1;
//			while ( leerzeichenZaehler <= ( 2 * anzahlZeilen - 1 ) / 2 ) // Die Formel (in Abhängigkeit von der Anzahl der Sterne) für die Anzahl an Leerzeichen muss z. B. durch Ausprobieren ermittelt werden.
			while (leerzeichenZaehler < anzahlZeilen) // Hier besser: Die Formel (in Abhägigkeit von der Nr. der Zeile)
														// für die Anzahl an Leerzeichen
			{
				System.out.print(" ");
				leerzeichenZaehler++;
			}

			sterneZaehler = 1;
			while (sterneZaehler <= 3) {
				System.out.print("*"); // Sterne ausgeben
				sterneZaehler++;
			}

			System.out.println(); // notwendig um jede Zeile zu beenden

			zeilenZaehler++;
		}
		System.out.println("----------------------------");

		/* **********************************************************************/
		// Alternative
		int anzahlLeerzeichen;

		zeilenZaehler = 0;
		while (zeilenZaehler++ < anzahlZeilen) {
			leerzeichenZaehler = zeilenZaehler;
			while (leerzeichenZaehler++ <= anzahlZeilen)
				System.out.print(" "); // Leerzeichen ausgeben

			sterneZaehler = 1;
			int zweimal = zeilenZaehler + zeilenZaehler;
			while (sterneZaehler++ < zweimal) // Addition ist schneller als Multiplikation
				System.out.print("*"); // Sternchen ausgeben // Noch schneller wäre ( sterneZaehler++ < ( zeilenZaehler
										// << 1 ) )
										// Und noch besser wäre es die Berechnung vor der Schleife zu machen und in
										// einer Variablen zu speichern
			System.out.println(); // notwendig um jede Zeile zu beenden
		}

		String txt = "";
		anzahlLeerzeichen = anzahlZeilen - 1; // Berechnung aus der Schleife herausnehmen spart sehr viel Prozessor-Zeit
		leerzeichenZaehler = 1; // <---------------------------------------------------- alternativ diese Zeile
								// weglassen
								// |
		while (leerzeichenZaehler++ <= anzahlLeerzeichen) // <-- und diese so ändern: while ( anzahlLeerzeichen-- > 0 )
			txt += " "; // Leerzeichen anhängen|

		txt += "***"; // Da klar ist, dass es immer 3 Sterne sein werden

		zeilenZaehler = 1;
		while (zeilenZaehler++ <= 3)
			System.out.println(txt); // Baumstammzeilen ausgeben
		/* **********************************************************************/
		// Die Letzte Version nochmals ohne Kommentare

		zeilenZaehler = 0;
		while (zeilenZaehler++ < anzahlZeilen) {
			leerzeichenZaehler = zeilenZaehler;
			while (leerzeichenZaehler++ <= anzahlZeilen)
				System.out.print(" ");

			sterneZaehler = 1;
			int zweimal = zeilenZaehler + zeilenZaehler;
			while (sterneZaehler++ < zweimal)
				System.out.print("*");

			System.out.println();
		}

		txt = "";
		anzahlLeerzeichen = anzahlZeilen - 1;
		leerzeichenZaehler = 1;

		while (leerzeichenZaehler++ <= anzahlLeerzeichen)
			txt += " ";
		txt += "***";
		/*
		 * zeilenZaehler = 1; while ( zeilenZaehler++ <= 3 ) System.out.println( txt );
		 * // Baumstammzeilen ausgeben txt = "\n"; anzahlLeerzeichen = anzahlZeilen - 1;
		 * leerzeichenZaehler = 1;
		 * 
		 * while ( leerzeichenZaehler++ <= anzahlLeerzeichen ) txt += " "; txt += "***";
		 */
		zeilenZaehler = 1;
		while (zeilenZaehler++ <= 3)
			System.out.println(txt); // Baumstammzeilen ausgeben

		/* **********************************************************************/
		// Noch eine Version mit nur einer Schleife für die Baumkrone
		// Noch nicht perfekt, da sie mit nur einer Zeile noch nicht korrekt
		// funktioniert
		int z = 0;
		int s = 1;
		while (z < anzahlZeilen) {
			System.out.print((s < anzahlZeilen - z || s > anzahlZeilen + z) ? " " : "*");

			if (s % (2 * anzahlZeilen - 1) == 0) {
				System.out.println();
				z++;
				s = 0;
			}
			s++;
		}

		txt = "";
		z = 1;
		while (++z < anzahlZeilen)
			txt += " ";
		txt += "***";

		z = 1;
		while (z++ <= 3)
			System.out.println(txt);
	}
}
