package aufgaben;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kapitel11_U3
{

	public static void main (String [] args)throws IOException {
		System.out.println("Aufgabe 2");
	BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

	String input1, input2;
	double berechung1, berechung2, x, y;


	System.out.println("Bitte geben Sie die Längeeines Rechtecks: ");
	input1 = scan.readLine();
	x = Integer.parseInt(input1);
	
	
	berechung1 = 2 * Math.PI * (Math.pow(x, 2));

	System.out.println(berechung1);
	
	}
}
