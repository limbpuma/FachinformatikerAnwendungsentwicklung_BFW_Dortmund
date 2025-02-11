package aufgaben;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kapitel20_Ubung1
{
	public static void main(String [] args)throws IOException{
		
		System.out.println("Aufgabe 1");

		/* BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		String input;
		int note;
		System.out.println("Bitte geben Sie eine note zwischen 1 und 100: ");
		input = scan.readLine();
		note = Integer.parseInt(input);
		*/
		
		int min = 1, max = 10, summe=0;
		
		while (min<=max) {
			summe += min;
			min++;
			
		}
		System.out.print(summe);
		System.out.println();
		
		if(summe %2 == 0) {
			
			System.out.print(summe);
		}
		
		max = 100;
		
		while (min<=max) {
			summe += min;
			min++;
			
			
		}
		System.out.print(summe);
		
		int zahl = 0, summ=0;
		while(zahl < 10) {
			if(zahl % 2 == 0) {
				summ += zahl;
				zahl++;
			}
		System.out.print(summ);
		}
		
		
		
	}
}
