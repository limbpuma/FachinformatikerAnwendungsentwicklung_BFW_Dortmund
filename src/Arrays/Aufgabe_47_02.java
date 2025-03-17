package Arrays;

public class Aufgabe_47_02
{
	public static void main ( String[] args )
	  {
	    int[] array = { 15, 12, -5, -7, -4, -1, -3, -13, -2 };
	    
	    // Variablen für die zwei größten Elemente deklarieren und initialisieren
	    int max = array[0];
	    int max2 = array[1];
	    // die zwei größten Elemente berechnen
	    
	    
	    
	    for ( int index= 1; index < array.length; index++ )
	    {
	    	if(array[index]>max ) {
	    		max2 = max;
	    		max = array[ index ];
	    		
	    	}else if(array[index]>max2){
	    		max2 = array[index];
	    	}
	    	
	    }

	    // die zwei größten Elemente ausgeben
	    System.out.println("Max 1: " + max + " max2: " + max2 );

	  }
}
