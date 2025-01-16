package aufgaben;

import java.util.Scanner;

// formel = (1/2) * G * z*z  > 1000 meter

public class Aufgabe11_2
{

	public static void main (String [] args) {
		
Scanner scan = new Scanner(System.in);
		
		System.out.println("Geben Sie die Anzahl der Sekunden ein: ");
		double inputZ = scan.nextDouble();
		
		final double erdbeschleunigung = 9.81;
		
		double formel = (1000/2)* erdbeschleunigung * Math.pow(inputZ, 2); 
		
		System.out.println("Die Entfernung e betragt: " + formel + " Meter");
	}
	
}
