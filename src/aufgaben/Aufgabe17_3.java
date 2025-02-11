package aufgaben;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Keil von Sternen
Schreiben Sie ein Programm, das Sterne in Keilform ausgibt. Der Anwender gibt die Anfangszahl für die Sterne
 ein und das Programm gibt Zeilen von Sternen aus, wobei jede Zeile einen Stern weniger hat als die vorhergehende.
 */
public class Aufgabe17_3
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("Keil von Sternen!");

		BufferedReader userIn = new BufferedReader(new InputStreamReader(System.in));

		int anzahlSterne, anzahlZeilen, i, j, z, s;

// Input vom Anwender sammeln
		System.out.println("Wie viele Sterne?");
		anzahlSterne = Integer.parseInt(userIn.readLine());

// Vorwärts zählen
		anzahlZeilen = anzahlSterne;
		z = 1;
		while (z <= anzahlZeilen) {
			s = 1;

			while (s <= anzahlSterne) {
				System.out.print("*"); // Sternchen ausgeben
				s++;
			}

			System.out.println(); // notwendig um jede Zeile zu beenden
			anzahlSterne--; // für den nächsten Durchlauf der inneren Schleife ein Durchgang weniger
			z++;
		}
	}
}
