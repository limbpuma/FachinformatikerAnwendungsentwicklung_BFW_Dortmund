package CallByValue;

public class UngeradeBsp3
{
	public static void main( String[] arg )
	  {
	    // ein 2D-Array deklarieren und konstruieren
	    int[][] ungerade =
	        { { 1, 9, 4 },
	          { 0, 2 },
	          { 0, 1, 2, 3, 4 } };

	    // das Array ausgeben
	    for ( int zeile = 0; zeile < ungerade.length; zeile++ )
	    {
	      System.out.print( "Zeile " + zeile + ": ");
	      for ( int spalte = 0; spalte < ungerade[ zeile ].length; spalte++ )
	        System.out.print( ungerade[ zeile ][ spalte ] + " ");
	      System.out.println();
	    }

	  }
}
