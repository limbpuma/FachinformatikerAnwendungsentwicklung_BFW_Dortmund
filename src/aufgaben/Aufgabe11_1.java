package aufgaben;

import java.util.Scanner;

public class Aufgabe11_1
{
	public static void main (String [] args) {
		
Scanner scan = new Scanner(System.in);
		
		System.out.println("Geben Sie den Preis pro Kilowattstunde in Cent ein: ");
		double iKwStunde = scan.nextDouble();
		
		System.out.println("Geben Sie die Anzahl der Kilowattstunden pro Jahr ein: ");
		double iKwJahr = scan.nextDouble();
		
		double ergenis = (iKwStunde/100) * iKwJahr;
	
	System.out.println("Jahreskosten in Euro:" + ergenis);
		
	}

}
