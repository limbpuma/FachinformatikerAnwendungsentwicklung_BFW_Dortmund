package aufgaben;
import java.io.*;
public class Aufgabe16_3
{
	public static void main (String [] args) throws IOException{
		
		BufferedReader stdin = new BufferedReader( new InputStreamReader( System.in ) );

		int	n, 				
				zaehler;
		
		double 	zahl,
					summe, 
					summeQ = 0, 
					quadrat = 0,
					durchschnitt,
					durchschnitt2,
					durchschnittQ,
					sd;

		System.out.print( "Geben Sie an wie viele Zahlen eingegeben werden: " );
		n = Integer.parseInt( stdin.readLine() );

		System.out.println();

		zaehler = 1; 
		summe = 0.0;
		while ( zaehler <= n )
		{	
			System.out.print( "Geben Sie die " + zaehler + ". Zahl ein: " );
			zahl = Double.parseDouble( stdin.readLine() );
			summe += zahl; // summe = summe + zahl;
			quadrat = zahl * zahl;
			summeQ += quadrat; //summeQ = summeQ + quadrat; oder summeQ += zahl * zahl
			zaehler++; //zaehler = zaehler + 1;
		}

		durchschnitt = summe / n;
		durchschnitt2 = durchschnitt * durchschnitt;
		durchschnittQ = summeQ / n;
		sd = Math.sqrt( durchschnittQ - durchschnitt2 );

		System.out.println( "Summe: " + summe );
		System.out.println( "SummeQ: " + summeQ );
		System.out.println( "Durchschnitt: " + durchschnitt );
		System.out.println( "Durchschnitt²: " + durchschnitt2 );
		System.out.println( "DurchschnittQ: " + durchschnittQ );
		System.out.println( "Die Standardabweichung ist: " + sd );
		
	}
}
