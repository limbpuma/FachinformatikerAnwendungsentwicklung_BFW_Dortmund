package Arrays;

public class Ubung47_6Min
{
	public static void main ( String[] args )
	  {

	    int[] array =  { -20, 19, 1, 5, -1, 27, 19, 5 } ;
	    int   min;

	    // das gegenwärtige Minimum initialisieren
	    min = array[ 0 ];

	    // das Array durchsuchen
	    for ( int index = 0; index < array.length; index++ )
	    {
	    	 if ( array[ index ] < min )

	    	        min = array[ index ] ;
	    }

	    System.out.println("Das Minimum dieses Arrays ist: " + min );
	  }
}
