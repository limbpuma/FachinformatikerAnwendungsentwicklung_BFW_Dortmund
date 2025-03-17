package Arrays;

public class Ubung47_7
{
	public static void main ( String[] args )
	  {
	    double[] array =  { -47.39, 24.96, -1.02, 3.45, 14.21, 32.6, 19.42 } ;

	    // Summe deklarieren und initialisieren
	    double summe =  0.0  ;

	    // jedes Element des Arrays zur Summe hinzuaddieren
	    for ( int index = 0; index < array.length; index++ )
	    {

	      summe =  array[index]  ;

	    }

	    System.out.println("Die Summe ist: " + summe );
	  }
	
}
