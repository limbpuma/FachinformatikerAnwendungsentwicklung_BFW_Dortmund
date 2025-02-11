package aufgaben;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kapitel42_U1
{
	public static void main(String[] args) throws IOException
	{

		System.out.println("Fahrkartenschalter!!");

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

		String input;
		int personenAnzahl, kartenTyp, i, freikarteValue, freikarteValuePreis;
		final double FAHRKARTENPREIS = 10;
		double gesamtePreis, preisProPerson, rabatt = 0, gruppenPreis, einzehlPreis, freikarte, gesamtePreisProPerson;
		boolean schleife = false;

		while (!schleife) {
			System.out.println("Wie viel farhkarten brauchen Sie? ");
			input = scan.readLine();
			personenAnzahl = Integer.parseInt(input);

			preisProPerson = FAHRKARTENPREIS * personenAnzahl;

			if (personenAnzahl < 5) {
				einzehlPreis = preisProPerson;
				System.out.println(einzehlPreis);
			} else if (personenAnzahl >= 5 & personenAnzahl < 10) {
				rabatt = 10;

			} else if (personenAnzahl >= 10 & personenAnzahl < 20) {
				rabatt = 25;

			} else {
				rabatt = 50;

			}

			gesamtePreis = preisProPerson - (preisProPerson * rabatt / 100);
			System.out.println("gesamtePreis: " + gesamtePreis);
			gesamtePreisProPerson = gesamtePreis / personenAnzahl;
			System.out.println("gesamtePreis pro Person: " + gesamtePreisProPerson);

			if (personenAnzahl >= 10) {
				freikarte = personenAnzahl / FAHRKARTENPREIS;
				freikarteValue = (int) freikarte;
				freikarteValuePreis = freikarteValue;

				System.out.printf("""
						  	\nFahrkartenpreis: %.2f \n
						    Anzahl Personen: %d \n
						    Der Einzelpreis einer Fahrkarte beträgt %.2f Euro \n
						    Der Preis pro Karte reduziert sich damit auf: %.2f %%\n
						    Außerdem erhalten Sie %d Freikarten.\n
						    Der Gesamtpreis beträgt demnach: %.2f \n
						    Pro Person sind: %.2f zu bezahlen \n
						""", FAHRKARTENPREIS, personenAnzahl, FAHRKARTENPREIS, rabatt, freikarteValue, gesamtePreis,
						gesamtePreisProPerson);

			} else {
				System.out.printf("""
						  	\nFahrkartenpreis: %.2f \n
						    Anzahl Personen: %d \n
						    Der Gesamtpreis beträgt demnach: %.2f \n
						    Pro Person sind: %.2f zu bezahlen \n
						""", FAHRKARTENPREIS, personenAnzahl, gesamtePreis, gesamtePreisProPerson);
			}

			System.out.println("Noch mal? (J/N) ");
			input = scan.readLine();
			if (input == "J") {
				schleife = true;
			}

		}

	}
}
