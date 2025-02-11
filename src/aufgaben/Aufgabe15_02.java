package aufgaben;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Aufgabe15_02
{
	public static void main (String [] args) throws IOException{
		System.out.println("Zaehler!");

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

		String inputString;
		int laenge;
		
		
		System.out.println("Die Länge des eingegebenen Textes ist: ");
		inputString = scan.readLine();
		laenge = inputString.length();


		

		while(laenge > 0) {                             
			System.out.println(inputString);
		laenge--;
		}
	}
}
