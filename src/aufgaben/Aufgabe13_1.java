package aufgaben;
/*
 * Sam & Ellas Delikatessen-Versand braucht ein Programm, das Bestellungen über ein 
 * Internetformular entgegen nimmt. Das Programm fragt welchen Artikel der Kunde möchte, 
 * den Preis und ob der Artikel per Express verschickt werden soll. Für Artikel unter $10 betragen
 *  die Versandkosten $2.00. Kostet der Artikel $10 oder mehr betragen sie $3.00. 
 *  Der Expresszuschlag beträgt $5.00.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Aufgabe13_1
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("Sam & Ellas Delikatessen!!");

		String artikel;
		double artikelPreis;
		boolean expressversand;
		double berechnung;
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Geben Sie den Artikel ein: ");
		artikel = scan.readLine();
		// System.out.println("Sie haben eingegeben: " + artikel);

		System.out.println("Geben Sie den Preis ein: ");
		artikelPreis = Double.parseDouble(scan.readLine());
		// System.out.println("Sie haben eingegeben: " + artikelPreis);

		System.out.println("Expressversand (0==nein, 1==ja) ");
		expressversand = scan.readLine().equals("0"); // false
		// System.out.println("Sie haben eingegeben: " + expressversand);

		double versandPreis, versandPreisExpress = 5;

		boolean isArtikelPreis = artikelPreis < 10;

		if (isArtikelPreis) {
			versandPreis = 2;
		} else {
			versandPreis = 3;
		}
		
		if(!expressversand) {
			versandPreis += versandPreisExpress;
		}
		
		double berechung = versandPreis + artikelPreis;
		


		System.out.printf("""
				\n-----Rechnung-----\n
				%s : %.2f\n
				Versand: %.2f\n
				Gesamt: %.2f
				""",artikel, artikelPreis, versandPreis, berechung);

		

	}
}