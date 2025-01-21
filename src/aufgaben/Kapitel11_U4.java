package aufgaben;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kapitel11_U4
{
	public static void main (String [] args)throws IOException {
		System.out.println("Aufgabe 2");
	BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

	String input1, input2;
	double berechung1, berechung2, x, y, umzaeunungskosten = 60;


	System.out.println("Bitte geben Sie die Länge des Ackers: ");
	input1 = scan.readLine();
	x = Integer.parseInt(input1);
	
	System.out.println("Bitte geben Sie die Breite des Ackers: ");
	input2 = scan.readLine();
	y = Integer.parseInt(input2);
	
	berechung1 = Math.pow(x,2) + Math.pow(y,2);
	berechung2 = berechung1 * umzaeunungskosten;
	
	
	System.out.println(berechung2);
	
	
	}
	
}
