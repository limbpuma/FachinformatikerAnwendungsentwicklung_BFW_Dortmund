package aufgaben;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Aufgabe16_01
{
	public static void main(String[] args) throws IOException
	{	
		BufferedReader stdin = new BufferedReader( new InputStreamReader( System.in ) );

		int n, zaehler;

		double summe;

		System.out.print("Geben Sie n ein:");
		n = Integer.parseInt(stdin.readLine());

		System.out.println();

		zaehler = 1;
		summe = 0;
		while (zaehler <= n) {

			summe += 1.0 / zaehler; // summe = summe + 1.0 / zaehler;
			zaehler++; // zaehler = zaehler + 1;
		}
		System.out.println("Die Summe ist: " + summe);

// Alternativ
		zaehler = 1;
		summe = 0;
		System.out.println();

		while (zaehler <= n)
			summe += 1.0 / zaehler++;

		System.out.println("Die Summe ist: " + summe);

// Alternativ
		zaehler = 0;
		summe = 0;
		System.out.println();
		while (zaehler++ < n)
			summe += 1.0 / zaehler;
		System.out.println("Die Summe ist: " + summe);

// Alternativ
		zaehler = 0;
		summe = 0;
		System.out.println();
		while (++zaehler <= n)
			summe += 1.0 / zaehler;
		System.out.println("Die Summe ist: " + summe);

	}
}
