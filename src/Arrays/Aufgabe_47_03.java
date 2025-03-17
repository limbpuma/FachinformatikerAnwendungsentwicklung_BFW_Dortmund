package Arrays;

public class Aufgabe_47_03
{
	public static void main ( String[] args )
	  {
	    int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };
	   // int[] ziel = new int [array.length];
	    //Daten umkehren
	    for ( int j = array.length-1; j >= 0; j-- )
	    {
	    	System.out.print(" " +array[j]+" ");
	    }
	    
	    System.out.println();
	    // neuen Daten ausgeben
	    for ( int j = 0; j < array.length; j++ )
	    {
	    	System.out.print(" " + array[j]+" ");
	    }

	  }
}
