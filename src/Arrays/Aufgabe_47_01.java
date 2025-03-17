package Arrays;

public class Aufgabe_47_01
{
	public static void main ( String[] args )
	  {
	    int[] array = { 3, 2, 5, 7, 9, 12, 97, 24, 54 };
	    
	    // drei Variablen für die Summen deklarieren und initialisieren
	    int summeGerade = 0; 
        int summeUngerade = 0;
        int zahl = 0;
	    

	    // Summen berechnen
	    for ( int index = 0; index < array.length; index++ )
	    {
	    	zahl += array[index];
	    	
	    	if(array[index] % 2 == 0)
	    	{
	    		summeGerade += array[index];
	    	}else{
	    		summeUngerade += array[index];
	    	}
	    	
	    }

	    // Summen ausgeben
	    System.out.println("zahl Summe: " + zahl );
	    System.out.println("Gerade summe: " + summeGerade );
	    System.out.println("unGerade summe: " + summeUngerade );

	  }
}
