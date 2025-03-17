package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ubung47_2
{
	public static void main (String [] args) throws NumberFormatException, IOException {
		int[] array = new int[ 5 ];
	    int   data;

	    BufferedReader inData =
	        new BufferedReader ( new InputStreamReader( System.in ) );

	    // Daten einlesen
	    for ( int index = 0 ; index < array.length ; index++ )
	    {
	      System.out.println( "Geben Sie einen Integer ein: " );
	      data           = Integer.parseInt( inData.readLine() );
	      array[ index ] = data ;
	    }

	    // Daten ausgeben
	    for ( int index = 0 ; index < array.length ; index++  )
	    {
	      System.out.println( "Array[ " + index + " ] = " + array[ index ] );
	    }
	}
}
