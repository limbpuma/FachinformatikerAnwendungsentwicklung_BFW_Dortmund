package aufgaben;

import java.util.Scanner;

import com.sun.jdi.FloatValue;

// formel > H = 2 / ( 1/x + 1/y )

public class Aufgabe11_3
{

	public static void main (String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Geben Sie x ein:");
		double inputX = scan.nextDouble();
		
		System.out.println("Geben Sie y ein:");
		double inputY = scan.nextDouble();
		
		
		double arithmetischesMittel = ( inputX + inputY ) /2 ;
		System.out.println("Arithmetisches Mittel " + arithmetischesMittel);
			
		double harmonischeMittel =  2 / ( 1/inputX + 1/inputY );
		System.out.println("Harmonische Mittel " + harmonischeMittel);
		

		
		
		
	}
	
}
