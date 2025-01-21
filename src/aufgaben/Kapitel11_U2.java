package aufgaben;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kapitel11_U2
{
	public static void main (String [] args)throws IOException {
		System.out.println("Aufgabe 2");
		
		// 2.1 > // System.out.print("7");
		
		/*2.2
		  int summe = 3+4;
		  System.out.print(summe);
		*/
		
		/*2.3
		  int berechung = Math.pow(6/2,3);
		 
		 */
		
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

		String input;
		int berechung, x;


		System.out.println("Bitte geben Sie Ihre Gewicht ein: ");
		input = scan.readLine();
		x = Integer.parseInt(input);
		
		berechung = x * 3;
		
		System.out.println(berechung);
		
		
	}
}
