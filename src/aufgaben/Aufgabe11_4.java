package aufgaben;

import java.util.Scanner;

public class Aufgabe11_4
{

	public static void main (String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Geben Sie ein double ein: ");
		double inputX = scan.nextDouble();
		
		double logaritmus = Math.log(inputX)/Math.log(2);
		
		System.out.println("Der Zweierlogarithmus von:" + inputX + " ist " + logaritmus);
		
		
		
	}
	
}
