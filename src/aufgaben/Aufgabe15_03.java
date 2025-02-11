package aufgaben;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Aufgabe15_03
{
	public static void main (String [] args) throws IOException{
		System.out.println("Zaehler!");

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

		String inputString, punkten, inputErsteWord, inputZweiteWord;
		int langeWorten, ersteWort, zweiteWort, berechnungPuntken ;
		
		
		System.out.println("Geben Sie das erste Wort ein: ");
		inputErsteWord = scan.readLine();
		ersteWort = inputErsteWord.length();

		System.out.println("Geben Sie das zweite Wort ein: ");
		inputZweiteWord = scan.readLine();
		zweiteWort = inputZweiteWord.length();
		
		berechnungPuntken = ersteWort+zweiteWort;
		
		System.out.print(inputErsteWord);
		
		while (berechnungPuntken <=30) {
		berechnungPuntken++;
		punkten = Integer.toString(berechnungPuntken);
		punkten = (".");
		
		System.out.print(punkten);
		}
		
		System.out.print(inputZweiteWord);
	

		
		
	}
}
