package aufgaben;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kapitel11_U1
{
	public static void main (String [] ags) throws IOException{
		System.out.println("Aufgabe 1");

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

		String name;


		System.out.println("Bitte geben Sie Ihre Gewicht ein: ");
		name = scan.readLine();
		
		System.out.print("Hallo ," + name);
		
		// System.out.print("Hallo");
	}
}
