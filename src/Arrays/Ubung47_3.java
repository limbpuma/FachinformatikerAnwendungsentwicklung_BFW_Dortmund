package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ubung47_3
{
	public static void main(String[]args) throws NumberFormatException, IOException {

	    BufferedReader inData =
	        new BufferedReader ( new InputStreamReader( System.in ) );
	    int[] array;

	    // Größe des Arrays bestimmen und das Array konstruieren
	    System.out.println( "Welche Laenge hat das Array?" );
	    int laenge  = Integer.parseInt( inData.readLine() );

	    array     = new int[ laenge ]; 

	    // Daten einlesen
	    for ( int index = 0; index < array.length; index++ )
	    {
	      System.out.println( "Geben Sie einen Integer ein: " );
	      array[ index ] = Integer.parseInt( inData.readLine() );
	    }

	    // Daten ausgeben
	    for ( int index = 0; index < array.length; index++ )
	    {
	      System.out.println( "array[ " + index + " ] = " + array[ index ] );
	    }
	}
}
