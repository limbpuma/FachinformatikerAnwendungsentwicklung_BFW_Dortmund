package aufgaben;
import java.io.*;
/*
 In einem Fantasy-Rollenspiel können die Spieler ihre Spielfiguren entwerfen, indem Sie einen Punktwert für jedes von drei Merkmalen vergeben:

Stärke, von 1 bis 10
Gesundheit, von 1 bis 10
Glück, von 1 bis 10
Schreiben Sie ein Programm, das nach dem Namen der Spielfigur und nach den Punktwerten der einzelnen drei Merkmale fragt. Aber, die Gesamtpunktzahl darf maximal 15 sein. Wenn die Gesamtpunktzahl 15 überschreitet, dann werden jedem Merkmal 5 Punkte zugewiesen.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Aufgabe13_4
{
	public static void main(String[] args) throws IOException
	{

		System.out.println("Willkommen zu Yertle's Schatzsuche!!");

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

		String inputOne, inputTwo, inputThree;
		int staerke, gesundheit, glueck, berechnung;
		String spielfigur;

		System.out.println("Geben Sie den Namen der Spielfigur ein: ");
		spielfigur = scan.readLine();

		System.out.println("Stärke eingeben (1-10): ");
		inputOne = scan.readLine();
		staerke = Integer.parseInt(inputOne);

		System.out.println("Gesundheit eingeben (1-10): ");
		inputTwo = scan.readLine();
		gesundheit = Integer.parseInt(inputTwo);

		System.out.println("Glück eingeben (1-10): ");
		inputThree = scan.readLine();
		glueck = Integer.parseInt(inputThree);

		berechnung = staerke + gesundheit + glueck;

		if (berechnung > 15) {
			staerke = 5;
			gesundheit = 5;
			glueck = 5;
			System.out.println(
					"Sie haben Ihrer Spielfigur zu viele Punkte gegeben!\nEs wurden die Standardwerte zugewiesen:");
		}

		System.out.printf("""
				\n%s, Stärke: %d, Gesundheit: %d, Glück: %d
				""", spielfigur, staerke, gesundheit, glueck);
	}

}
