package aufgaben;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kapitel40_U2
{
	public static void main (String [] args) throws IOException{
		
		System.out.println("Vergabe von Zensuren!!");

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		
		String input;
		int note;
		
		System.out.println("Bitte geben Sie eine note zwischen 1 und 100: ");
		input = scan.readLine();
		note = Integer.parseInt(input);
		
		
		if (note > 92 ) {
			System.out.println("sehr gut");
		} else if(note >= 80 & note < 92 ) {
			System.out.println("gut");
		} else if(note >= 67 & note < 80 ) {
			System.out.println("befriedigend");
		} else if(note >= 50 & note < 67 ) {
			System.out.println("ausreichend");
		} else if(note >= 30 & note < 50 ) {
			System.out.println("mangelhaft");
		} else if(note >= 30 & note < 50 ) {
			System.out.println("ungenügend");
		} else {
		  	System.out.println("Bitte geben Sie eine note zwischen 1 und 100");
		}
		
	}
}
