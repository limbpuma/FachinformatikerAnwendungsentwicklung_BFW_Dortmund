package Arrays;

public class Aufgabe2
{
	public static void main ( String[] args )
	  {
	    int[] arr = { 13, -4, 82, 17 };
	    int[] doppelt; 

	    System.out.println( "Ursprüngliches Array: "
	        + arr[ 0 ] + " " + arr[ 1 ] + " " + arr[ 2 ] + " " + arr[ 3 ] );

	    // Konstruieren Sie ein Arrayobjekt für doppelt.
	    doppelt = new int[arr.length]; 
	    
	    // Stellen Sie Werte in doppelt, die zweimal so groß sind
	    // wie ihre entsprechenden Werte in arr
	    for (int i = 0; i < arr.length; i++) {
            doppelt[i] = arr[i] * 2;
        }
	    

	    System.out.println( "Neues Array: "
	        + doppelt[ 0 ] + " " + doppelt[ 1 ] + " " + doppelt[ 2 ] + " " + doppelt[ 3 ] );
	   }
}
