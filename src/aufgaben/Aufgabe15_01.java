package aufgaben;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Aufgabe15_01
{
	public static void main (String [] args) throws IOException{
		System.out.println("Start- und Endwert!");

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

		String input;
		int startWert, endWert;
		
		
		System.out.println("Startwert: ");
		input = scan.readLine();
		startWert = Integer.parseInt(input);
		
		
		System.out.println("Endwert: ");
		input = scan.readLine();
		endWert = Integer.parseInt(input);
		

		while(startWert <= endWert)                             
		{
		  System.out.println( "Zaehler ist:" + startWert );
		  startWert = startWert + 1;                                 
		}

	}
}
