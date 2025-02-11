package aufgaben;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Kapitel20_U4
{
	public static void main (String [] args) throws IOException{
		
		System.out.println("Eingabe einer Note!!");

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

		String input, question;
		int startY, endY, startX, endX, result= 0, a ,b, zahlen= 0;
		boolean tabelle = true;

		
		
		
		
		while(tabelle) {
			
			String spalte = ("_ _ _"), kreuz =("+"), tab = ("|");
			
			System.out.println("Startzeile eingeben: ");
			input = scan.readLine();
			startY = Integer.parseInt(input);
			
			System.out.println("Endzeile eingeben: ");
			input = scan.readLine();
			endY = Integer.parseInt(input);
			
			System.out.println("Startspalte eingeben: ");
			input = scan.readLine();
			startX = Integer.parseInt(input);
			
			System.out.println("Endspalte eingeben: ");
			input = scan.readLine();
			endX = Integer.parseInt(input);
			
			for( a = startY ; a < endY+1; a++) {
				
				//System.out.print(" | " + a + " | ");
				
				
				
				for( b = startX ; b < endY+1; b++) {
					result = a * b;
					
				//	System.out.println(result + " ");
					
				}
				
				for (zahlen=zahlen; zahlen < a ; zahlen++) {
					
					System.out.print(tab+a);
							
				}
				
				
				//System.out.println();
			}
			
			
			
			System.out.println(" Noch eine Tabelle ausgeben (J/N)? ");
			question = scan.readLine();
			if(question == "n" ||question == "N") {
				tabelle = false;
				System.out.println(tabelle);
			}
		}

		
	}
}
