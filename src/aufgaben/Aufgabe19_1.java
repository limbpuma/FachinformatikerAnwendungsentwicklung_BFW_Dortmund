package aufgaben;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 Ratenzahlung
Angenommen Sie schulden Ihrer Kreditkartengesellschaft 1000.00$. 
Die Gesellschaft berechnet Ihnen monatlich 1.5% Zinsen für den gewährten Kredit. 
Sie entscheiden sich die Kreditkarte nicht mehr zu verwenden und Ihren Kredit 
monatlich mit einem bestimmten Betrag n zurückzuzahlen. Schreiben Sie ein Programm, 
das nach dem monatlichen Rückzahlungsbetrag fragt, dann den Saldo und den Gesamtbetrag 
der Zahlungen für jeden Monat ausgibt, bis der Saldo Null oder weniger beträgt.
 */

public class Aufgabe19_1
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

		double saldo, // zu zahlender Betrag
				zinssatz, rate, zins, gesamt = 0.0;
		int m = 0; // Monat

		// Ursprüngliches Programm
		saldo = 1000.0;
		zinssatz = 0.015;
		System.out.println("Geben Sie den monatlichen Betrag ein:");
		rate = Double.parseDouble(stdin.readLine());

		while (saldo > 0) {
			zins = saldo * zinssatz;
			saldo += zins - rate;
			gesamt += rate;
			m++;
			System.out.println("\nMonat: " + m + "\tSaldo: " + saldo + "\tGesamtbetrag: " + gesamt);
		}

	}
}
