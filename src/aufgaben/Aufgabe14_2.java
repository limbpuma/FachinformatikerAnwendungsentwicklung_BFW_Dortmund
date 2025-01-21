package aufgaben;

/*
 Wettbewerb "Torten essen"
Beim State Fair Pie Eating Contest müssen alle Teilnehmer in der Schwergewichtsklasse zwischen 235 und 265 
Pfund wiegen. Schreiben Sie ein Programm, das nach dem Gewicht des Teilnehmers fragt und dann ausgibt, 
ob er zum Wettbewerb zugelassen ist oder nicht.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Aufgabe14_2
{
 public static void main (String  []args) throws IOException{
	 
	 System.out.println("Wettbewerb 'Torten essen'");

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

		String inputOne;
		double gewicht;


		System.out.println("Bitte geben Sie Ihre Gewicht ein: ");
		inputOne = scan.readLine();
		gewicht = Double.parseDouble(inputOne);

		if (gewicht > 235 && gewicht < 265) {
			System.out.println("Sind Sie wettbewerb zugelassen");
		}
		
		System.out.println("Leider, Sind Sie wettbewerb nicht zugelassen");
 	}

}