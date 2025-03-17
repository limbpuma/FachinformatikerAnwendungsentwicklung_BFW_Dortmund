package Arrays;

public class Aufgabe_47_04
{
	public static void main ( String[] args )
	  {
	    int[] signal  = { 1, 5, 4, 5, 7, 6, 8, 6, 5, 4, 5, 4 };
	    int[] geglaettet = new int[signal.length];

	    System.out.println("geglaettet = "+geglaettet.length);
	    // berechnen Sie den geglätteten Wert für jeden Slot
	    // von Array geglaettet
	    int num1 = signal[0];
	    int num2 = signal[1];
	    int berechnung = 0;
	    
	    for ( int j = 0; j < geglaettet.length; j++  )
	    {
	    	num1 = signal[j] ;
	    	System.out.print(" "+ num1 + " ");
	    }
	    System.out.println();
	    // Geben Sie den Input aus
	    for ( int j = 0; j < signal.length; j++ )
	    {
	    	num2 +=num1/2;
	    	System.out.print(" "+ num2 + " ");
	    }

	    // Geben Sie das Ergebnis aus
	    for ( int j = 0; j < geglaettet.length; j++ )
	    {
	    	
	    }

	  }
}
