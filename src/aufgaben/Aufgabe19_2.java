package aufgaben;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Aufgabe19_2
{
	public static void main(String[] args)
	{
		double wirkstoffgehalt = 1; // = 100 %;
		final double VERLUST = 0.04; // = 4 %
		int i = 0;

		while (wirkstoffgehalt >= 0.5) // = 50 %
		{
			System.out.println("Monat: " + i + "\tWirkstoffgehalt: " + wirkstoffgehalt);
			// wirkstoffgehalt = wirkstoffgehalt - ( wirkstoffgehalt * VERLUST );

			// entspricht durch Übersetzung in die Kurzschreibweise von Java:
			// wirkstoffgehalt -= wirkstoffgehalt * VERLUST;

			// entspricht durch mathematische Umformung der ursprünglichen Formel:
			// wirkstoffgehalt = wirkstoffgehalt * ( 1 - VERLUST );

			// entspricht durch Übersetzung in die Kurzschreibweise von Java:
			wirkstoffgehalt *= (1 - VERLUST);
			i++;
		}

		System.out.println("Monat: " + i + "\tWirkstoffgehalt: " + wirkstoffgehalt + " ABGELAUFEN");

		// dasselbe ohne Kommentare
		i = 0;

		while (wirkstoffgehalt >= 0.5) {
			System.out.println("Monat: " + i + "\tWirkstoffgehalt: " + wirkstoffgehalt);
			wirkstoffgehalt *= (1 - VERLUST);
			i++;
		}

		// Alternativ (kürzer, aber unübersichtlicher)
		wirkstoffgehalt = 1;
		i = 0;

		while (wirkstoffgehalt >= 0.5) {
			System.out.println("Monat: " + i++ + "\tWirkstoffgehalt: " + wirkstoffgehalt);
			wirkstoffgehalt *= (1 - VERLUST);
		}
		wirkstoffgehalt = 1;
	}
}
