package aufgaben;
import java.io.*;
public class Aufgabe18_1
{
	public static void main(String [] args) throws IOException
	{
		System.out.println("Versandkosten-Kalkulator");
		
		BufferedReader userIn = new BufferedReader( new InputStreamReader( System.in ) );

		int gewicht;
		double gebuehr = 0;
		final double	VERSANDKOSTEN = 3.0, // Grundgebühr bis 10 Pfund inklusive
							AUFSCHLAG = 0.25, 	// je weiteres Pfund Gewicht
							GEWICHTLIMIT = 10.0;

		// Gewicht holen
		System.out.println( "Gewicht der Sendung:" );
		gewicht = Integer.parseInt( userIn.readLine() );
		
		while ( gewicht > 0 )
		{
//			if ( gewicht <= GEWICHTLIMIT )
//				gebuehr = VERSANDKOSTEN;
//			else
//				gebuehr = VERSANDKOSTEN + ( gewicht - GEWICHTLIMIT ) * AUFSCHLAG;

			// Alternative zum if - else:
//			gebuehr = VERSANDKOSTEN;
//			if ( gewicht > GEWICHTLIMIT )
//				gebuehr += ( gewicht - GEWICHTLIMIT ) * AUFSCHLAG;

			//	oder so
			gebuehr = ( gewicht <= GEWICHTLIMIT ) ? VERSANDKOSTEN : VERSANDKOSTEN + ( gewicht - GEWICHTLIMIT ) * AUFSCHLAG;
			
			// Kosten ausgeben
			
			System.out.println( "Versandkosten: $" + gebuehr );

			// den nächsten Wert vom Anwender holen
			System.out.println( "Gewicht der Sendung:" );
			gewicht = Integer.parseInt( userIn.readLine() ); // "frischer" Wert zum Testen
		}	
		
		
	}
}
