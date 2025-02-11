package aufgaben;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Aufgabe14_3
{
	public static void main (String [] args) throws IOException{
		
		System.out.println("Reifendruck!!!");

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

		String inputOne, inputTwo, inputThree, inputFour;
		int reifendruck, rechtsVorne, linksVorne, rechtsHinten, linksHinten;


		System.out.println("Reifendruck rechter Vorderreifen: ");
		inputOne = scan.readLine();
		rechtsVorne = Integer.parseInt(inputOne);
		
		System.out.println("Reifendruck linker Vorderreifen: ");
		inputTwo = scan.readLine();
		linksVorne = Integer.parseInt(inputTwo);
		
		System.out.println("Reifendruck rechter Hinterreifen: ");
		inputThree = scan.readLine();
		linksHinten = Integer.parseInt(inputThree);
		
		System.out.println("Reifendruck linker Hinterreifen: ");
		inputFour = scan.readLine();
		rechtsHinten = Integer.parseInt(inputFour);
		
		
		if (linksHinten == rechtsHinten) {
			System.out.println("Die Reifendruck ist ok");
		}else{System.out.println("Die Reifendruck sind NICHT ok");	}
		
		
		
	}
}
