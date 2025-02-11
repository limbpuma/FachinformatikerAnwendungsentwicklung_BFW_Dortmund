package aufgaben;

import java.util.Scanner;

public class Aufgabe12_1
{

	public static void main (String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Geben Sie den Gesamtbetrag ein: ");
		double inputX = scan.nextDouble();
		
		double discount = inputX - (inputX / 10);
		
		
		if (inputX > 10) {
			System.out.println("Discountpreis: " + discount + " $");
		}else System.out.println("Du bekommst kein Discountpreis: " + inputX +" $");
		
		
		
		
		
		
		
		
	}
	
}
