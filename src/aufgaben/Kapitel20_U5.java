package aufgaben;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kapitel20_U5
{
	public static void main(String[] args) throws IOException
	{

		System.out.println("Quersumme!");

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

		String input, question, zahlString;
		int quersumme, number, zahl= 0, summe = 0, laenge;
		boolean questionLoop = false;
		

		while (!questionLoop) {

			System.out.println("Bitte geben Sie die Zahl ein von der die \n Quersumme berechnet werden soll: ");
			input = scan.readLine();
			number = Integer.parseInt(input);
			laenge = String.valueOf(number).length();
			
			System.out.println(laenge);

			for (int i = 1; i <= laenge; i++) {

				System.out.println("i: " + i);
				
				for (int j = 1; j >= i; input.substring( 0, 1 + 1 )) {
					
					System.out.println("j: " + j);
					summe += laenge;
					System.out.println("summe: " + summe);
					
					
				}
					
				
				
			}

			System.out.println(" Noch eine Quersumme berechnen (J/N)? ");
			question = scan.readLine();
			if (question == "n" || question == "N") {
				questionLoop = false;
				System.out.println(questionLoop);
			}
		}

	}
}
