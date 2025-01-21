package aufgaben;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kapitel11_U4_2
{
	public static void main (String [] args)throws IOException {
		System.out.println("Aufgabe 2");
	BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

	String input1, input2, input3;
	double berechung1, berechung2, x, y, z,rasenAbstand = 2;


	System.out.println("Bitte geben Sie die Länge des Fußballplatzes: ");
	input1 = scan.readLine();
	x = Integer.parseInt(input1);
	
	System.out.println("Bitte geben Sie die Breite des Fußballplatzes: ");
	input2 = scan.readLine();
	y = Integer.parseInt(input2);
	
	System.out.println("Bitte geben Sie die Rasenpreis pro m2: ");
	input3 = scan.readLine();
	z = Integer.parseInt(input3);
	
	berechung1 = Math.pow(x-2,2) + Math.pow(y-2,2);
	berechung2 = berechung1 * z;
	
	System.out.println(berechung2);
	
	
	}
}
