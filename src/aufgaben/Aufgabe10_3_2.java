package aufgaben;
import java.util.Scanner;


public class Aufgabe10_3_2
{
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Geben Sie das Wechselgeld ein:");
		int kundeInput = scan.nextInt();
		
		
		int dollar = kundeInput;
		System.out.println(dollar / 100 + " dollar");
		
		int quarter = kundeInput %= 100;
		System.out.println(quarter / 25 + " quarter");
		
		int dime = kundeInput %= 25;
		System.out.println(dime / 10 + " dime");
		
		int nickel = kundeInput %= 5;
		System.out.println(nickel / 5 + " nickel");
		
		int cent = kundeInput ;
		System.out.println(nickel + " cent");
		
	}

}
