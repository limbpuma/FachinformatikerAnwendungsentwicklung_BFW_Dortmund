package aufgaben;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Die maximal mögliche Effizienz einer Dampfmaschine ist abhängig von der Dampftemperatur im Heizkessel und von der Außentemperatur der Luft:

effizienz = 1 - tLuft / tDampf
wobei tLuft die Lufttemperatur und tDampf die Dampftemperatur ist. Die Temperaturen werden in Kelvin angegeben. Die normale Lufttemperatur beträgt ungefähr 300oK (Kelvin). Der Siedepunkt liegt bei 373oK.

Schreiben Sie ein Programm, das den Anwender nach der Luft- und Dampftemperatur fragt und die maximal mögliche Effizienz der Dampfmaschine ausgibt. Aber, wenn die Dampftemperatur weniger als 373oK beträgt, dann gibt es keinen Dampf und die Effizienz beträgt 0.
 */

public class Aufgabe13_2
{
	public static void main (String [] args) throws IOException{ 
		
		System.out.println("Effizienz von Dampfmaschinen!!");
		
		String inputOne, inputTwo;
		double tLuft, tDampf, effizienz;
		
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Geben Sie die Lufttemperatur ein: ");
		inputOne = scan.readLine();
		
		System.out.println("Geben Sie die Dampftemperatur ein: ");
		inputTwo = scan.readLine();
		
		tLuft = Double.parseDouble(inputOne);
		tDampf = Double.parseDouble(inputTwo);
		
				
		if (tDampf < 373) {
			effizienz = 0 - tLuft / tDampf;
		}else {
			effizienz = 1 - tLuft / tDampf;
		}
		
		System.out.println("Die Effizienz beträgt:" + effizienz);
		
		
	}
}
