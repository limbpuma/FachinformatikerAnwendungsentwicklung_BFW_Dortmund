package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Aufgabe_10_1b
{	
	
	public static void ausgeben( int[] a )
	{	for ( int index = 0; index < a.length; index++ )
			System.out.print( a[ index ] + " " );
		System.out.println();
	}
	
	public static void main( String[] args ) throws NumberFormatException, IOException
	{
		BufferedReader inData = new BufferedReader( new InputStreamReader( System.in ) );
		boolean gefunden;
		int such;
		int[] data = new int[ 10 ];
		int ersetz= 77;
		// Daten in das Array einlesen
		
		/**********************************************************************/
		System.out.println( "\n*** PP10-1-a *************************" );
		
		System.out.println( "Bitte geben Sie nacheinander 10 ganze Zahlen ein." );
		for ( int index = 0; index < data.length; index++ )
		{	System.out.print( "Wert " + ( index + 1 ) + ": " );
			data[ index ] = Integer.parseInt( inData.readLine() );
		}
		
		System.out.println( "ursprüngliches Array: " );
		ausgeben( data );
		
		System.out.print( "Bitte geben Sie eine Zahl ein, nach der gesucht werden soll: " );
		such = Integer.parseInt( inData.readLine() );
		
		gefunden = false;
		for ( int index = 0; index < data.length; index++ )// Hemos quitado la condicion ! gefunden 
			if ( such == data[ index ] )
			{	
				System.out.println( "Die gesuchte Zahl wurde am Index " + index 
											+ " = Position " + ( index + 1 ) + " gefunden." );
				data[index]= ersetz;
				System.out.println("Ersetz "+ data[index]);
				gefunden = true;
			}
		if ( ! gefunden )
			System.out.println( "Die gesuchte Zahl wurde nicht gefunden." );
		
		System.out.println( "Resultierendes Array: " );
		ausgeben( data );
//		int[] data2 = data.clone();
	}
}
