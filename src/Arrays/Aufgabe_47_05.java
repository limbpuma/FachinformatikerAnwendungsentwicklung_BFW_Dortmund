package Arrays;

public class Aufgabe_47_05
{
	public static void main(String []args) {
		double[] data = { 5.6, 6.2, 6.0, 5.5, 5.7, 6.1, 7.4, 5.5, 5.5, 6.3, 6.4, 4.0, 6.9 };
		double durchschnitt, summe;
		
				// Daten ausgeben
				for ( int index = 0; index < data.length; index++ )
					System.out.println( "data[ " + index + " ] = " + data[ index ] );

				// Variablen initialisieren
				summe = 0.0;

				// Durchschnitt berechnen und ausgeben
				for ( int index = 0; index < data.length; index++ )
					summe += data[ index ];

				durchschnitt = summe / data.length;
				System.out.println( "Durchschnitt: " + durchschnitt );
				
				// Das am weitesten vom Durchschnitt entfernte Element bestimmen
				int indexmaxEntfernung = 0; // Zum Speichern des Indexes des gefundenen Elements
				double entfernung; // Die Entfernung des aktuellen Wertes vom Durchschnitt
				double maxEntfernung = 0.0; // Die größte Abweichung
				
				for ( int index = 0; index < data.length; index++ )
				{	entfernung = Math.abs( data[ index ] - durchschnitt );
					
					if ( entfernung > maxEntfernung )
					{	maxEntfernung = entfernung;
						indexmaxEntfernung = index;
					}
				}
				System.out.println( "entferntester Wert: " + data[ indexmaxEntfernung ] );
				data[ indexmaxEntfernung ] = -1; // Eigentlich unnötig, aber laut Aufgabenstellung verlangt
				
				// Neuen Durchschnitt berechnen
				summe = 0.0;
				durchschnitt = 0.0;
				
				for ( int index = 0; index < data.length; index++ )
				{
					if ( data[ index ] != -1 ) // Es ginge auch so: if ( index != indexmaxEntfernung )
						summe += data[ index ];
				}
				durchschnitt = summe / ( data.length - 1 ); // - 1 da ein Element nicht gewertet wird
				System.out.println( "neuer Durchschnitt: " + durchschnitt );
				
				// Anstatt den Durchschnitt wie von Zeile 58 bis 67 beschrieben zu berechnen,
				// geht es auch einfacher:
				 durchschnitt = ( summe - data[ indexmaxEntfernung ] ) / ( data.length - 1 );
		
	}
}
