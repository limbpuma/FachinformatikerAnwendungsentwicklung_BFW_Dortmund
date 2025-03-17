package Arrays;

public class Ubung47_5
{
	public static void main ( String[] args )
	  {

	    int[] array =  { -20, 19, 1, 5, -1, 27, 19, 5 } ;
	    int   max;

	    // das gegenwärtige Maximum initialisieren

	    max = array[0];

	    // das Array durchsuchen
	    for ( int index = 0; index < array.length; index++ )
	    {

	      if ( index < array.length )  // das gegenwärtige Element untersuchen

	        max = array[ index ];      // wenn es bis dahin das Größte ist, max ändern

	    }

	    System.out.println("Das Maximum dieses Arrays ist: " + max );

	  }
}
