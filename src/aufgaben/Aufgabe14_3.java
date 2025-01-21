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
		double reifendruck, rechtsVorne, linksVorne, rechtsHinten, linksHinten;


		System.out.println("Reifendruck rechter Vorderreifen: ");
		inputOne = scan.readLine();
		rechtsVorne = Double.parseDouble(inputOne);
		
		System.out.println("Reifendruck linker Vorderreifen: ");
		inputTwo = scan.readLine();
		linksVorne = Double.parseDouble(inputOne);
		
		System.out.println("Reifendruck rechter Hinterreifen: ");
		inputThree = scan.readLine();
		linksHinten = Double.parseDouble(inputOne);
		
		System.out.println("Reifendruck linker Hinterreifen: ");
		inputFour = scan.readLine();
		rechtsHinten = Double.parseDouble(inputOne);
		
		
		
		if (linksHinten != rechtsHinten) {
			System.out.println("Die Reifendruck ist NICHT ok");	
		}else{System.out.println("Die Reifendruck ist ok");}
		
		
		
	}
}
