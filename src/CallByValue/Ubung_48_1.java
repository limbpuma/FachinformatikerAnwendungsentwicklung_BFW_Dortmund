package CallByValue;

public class Ubung_48_1
{
	// Konstruktor
    static int[] gewicht( int[] init )
    {   int[] daten;
        // konstruiert ein Array mit der gleichen Länge wie das durch init referenzierte.
        daten = new int[ init.length ];

        // kopiert die übergebenen Werte nach daten.
        for ( int j = 0; j < init.length; j++ )
            daten[ j ] = init[ j ];
        return daten;
    }

    // Ausgabe
    static void ausgeben( int[] daten )
    {
    	// for schleife
    	for(int i = 0; i < daten.length; i++) {
    		
    		if(i%7==0) {
    			System.out.println("\n");
    		}
    		System.out.print(daten[i]+" ");
    	}
    }

    public static void main( String[] args )
    {
        int[] werte = { 98, 99, 98, 99, 100, 101, 102, 100, 104, 105,
                        105, 106, 105, 103, 104, 103, 105, 106, 107, 106,
                        105, 105, 104, 104, 103, 102, 102, 101, 100, 102 };
        int[] juni = gewicht( werte );
        ausgeben( juni );
    }
}
