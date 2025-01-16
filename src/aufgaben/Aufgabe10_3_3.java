package aufgaben;

import java.util.Scanner;

public class Aufgabe10_3_3
{

	public static void main(String[] args)
	{

		Scanner scan = new Scanner(System.in);

		System.out.println("Geben Sie das Wechselgeld ein:");
		int kundeInput = scan.nextInt();

		/*
		 * int dollar = kundeInput / 100; 
		 * int quarter = kundeInput % 100; 
		 * int dime = kundeInput % 25; 
		 * int nickel = kundeInput % 5; 
		 * int cent = nickel;
		 */
		
		int dollar = kundeInput / 100, quarter = kundeInput % 100, dime = kundeInput % 25, nickel = kundeInput % 5,
				cent = nickel;
		

		System.out.printf("""
				\nDollar: %d
				\nQuarter: %d
				\nDime: %d
				\nNickel: %d
				\nCent: %d
				""", dollar, quarter / 25, dime / 10, nickel / 5, cent);

	}

}
