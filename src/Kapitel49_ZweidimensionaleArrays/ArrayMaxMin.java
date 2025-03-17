package Kapitel49_ZweidimensionaleArrays;

import java.io.IOException;

public class ArrayMaxMin
{
	public static void main ( String[] args ) throws IOException
	  {
	    int[][] data = { { 15, 2, 5 },
	                     {  1, 4, 4, 8, 13 },
	                     {  -9, 1, 0, 2 },
	                     {  0, 2, 6, 3, -1, -8 } };

	    // max und min deklarieren
	    int max = data[0][0];
	    int min = data[0][0];

	    // max und min berechnen
	    for ( int zeile = 0; zeile < data.length; zeile++ )
	    {
	    	System.out.println(" ");
	      for ( int spalte=0; spalte < data[ zeile ].length; spalte++ )
	      {
	    	  System.out.print(data[zeile][spalte]+ " | ");
	      }
	    }

	    // Ergebnisse ausgeben
	    System.out.println(  );

	  }
}
