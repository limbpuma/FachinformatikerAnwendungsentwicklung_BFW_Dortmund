package aufgaben;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kapitel20_U7
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("Balkendiagramm!");

		String input, ausgabe = "X";
		int zahlInput, number = 0, laenge, summe;
		boolean questionLoop = false;

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		
		
		while (!questionLoop) {
			
			System.out.println(" Bitte geben Sie eine positive ganze Zahl ein (e = Ende): ");
			
				
			input = scan.readLine();
			number = Integer.parseInt(input);
			/*
			laenge = String.valueOf(number).length();
			*/
			
			for (int i = 0; i < input.length(); i++) {
				System.out.print(number + (" "));

				for (int j = 0; j < number; j++) {

					System.out.print("X");
				}
			}
			
			
			if (input.equalsIgnoreCase("e")) {
				questionLoop = false;
				System.out.println(questionLoop);
				System.out.println("Exit from question loop...");
			} else {
				
			}
			

		}

	}

}
