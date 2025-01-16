package aufgaben;
import java.util.Scanner;

public class Aufgabe10_3
{
	public static void main (String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Geben Sie das Wechselgeld ein:");
		int kundeInput = scan.nextInt();
		
		//int Dollar;
		
		//int Quarter= 25, Dime = 10 , Nickel = 5 , Cent = 5;
		System.out.println(kundeInput / 100 + " Dollar");
		kundeInput %= 100;
		
		System.out.println(kundeInput /25 + " Quarter");
		kundeInput %= 25;
		
		System.out.println(kundeInput /10 + " Dime");
		kundeInput %= 10;
		
		
		System.out.println(kundeInput /5 + " Nickel");
		kundeInput %= 5;
		
		
		System.out.println(kundeInput + " Cent");
		

	}

}
