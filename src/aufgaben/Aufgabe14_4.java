package aufgaben;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Aufgabe14_4
{
	public static void main(String[] args) throws IOException
	{

		System.out.println("Reifendruck!!!");

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

		String input;
		int reifendruckVorne, reifendruckHinten, rechtsVorne, linksVorne, rechtsHinten, linksHinten, druckOK;

		System.out.println("Reifendruck rechter Vorderreifen: ");
		input = scan.readLine();
		rechtsVorne = Integer.parseInt(input);

		System.out.println("Reifendruck linker Vorderreifen: ");
		input = scan.readLine();
		linksVorne = Integer.parseInt(input);

		System.out.println("Reifendruck rechter Hinterreifen: ");
		input = scan.readLine();
		linksHinten = Integer.parseInt(input);

		System.out.println("Reifendruck linker Hinterreifen: ");
		input = scan.readLine();
		rechtsHinten = Integer.parseInt(input);

		reifendruckVorne = rechtsVorne - linksVorne;
		System.out.println(reifendruckVorne);
		
		reifendruckHinten = linksHinten - rechtsHinten;
		System.out.println(reifendruckHinten);

		boolean isDruckOK = (reifendruckVorne > -3 & reifendruckVorne < 3)
				&& (reifendruckHinten > -3 & reifendruckHinten < 3);
		
		System.out.println(isDruckOK);
		
		if (!isDruckOK) {

			System.out.println("Der Reifendruck ist NICHT OK.");

		} else {
			System.out.println("Der Reifendruck ist OK.");

		}

	}
}
