package aufgaben;

/*
 Erstellen Sie ein Programm, das für die Eingabe einer Note die entsprechende Zensur im Klartext ausgibt:

1 sehr gut
2 gut
3 befriedigend
4 ausreichend
5 mangelhaft
6 ungenügend
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kapitel40_U1
{
	public static void main (String [] args) throws IOException{
			
			System.out.println("Eingabe einer Note!!");

			BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
			
			String input;
			int note;

			System.out.println("Geben Sie eine NOTE von 1 bis 6: ");
			input = scan.readLine();
			note = Integer.parseInt(input);
			
			switch (note) {
			case 1:
				System.out.println("sehr gut");
				break;
			case 2:
				System.out.println("gut");
				break;
			case 3:
				System.out.println("befriedigend");
				break;
			case 4:
				System.out.println("ausreichend");
				break;
			case 5:
				System.out.println("mangelhaft");
				break;
			case 6:
				System.out.println("ungenügend");
				break;	
			default:	System.out.println("Falsche Eingabe, bitte geben Sie eine note zwischen '1 und 6'");
			}
	}
}
