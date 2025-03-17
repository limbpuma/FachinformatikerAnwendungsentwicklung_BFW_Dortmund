package CallByValue;

public class ArrayAendernTest
{
	static void ausgeben ( int[] x )
	  {
	    for ( int j=0; j < x.length; j++ )
	      System.out.print( x[j] + " " );
	    System.out.println( );
	  }

	  static void setElementZero ( int[] x, int index )    // 6.
	  {
	    if ( index < x.length )                            // 7.
	      x[ index ] = 0;                                  // 8.
	  }
	  
	  public static void main ( String[] args )        // 1.
	  {
	    int[] arr = {27, 19, 34, 5, 12} ;              // 2.
	    System.out.println( "Vorher:" );               // 3.
	    ausgeben( arr );                               // 4.

	    setElementZero( arr, 0 );                      // 5.
	    System.out.println( "Nachher:" );              // 9.
	    ausgeben( arr );
	  }
}
