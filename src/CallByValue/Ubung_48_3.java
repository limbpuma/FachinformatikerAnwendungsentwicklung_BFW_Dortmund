package CallByValue;

public class Ubung_48_3
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

    static double durchschnitt( int[] daten )
    {
    	double summe= 0.0;
        //Schleife
    	for(int i = 0; i < daten.length; i++) {
    		summe += daten[i];
    		
    	//	System.out.println("durchschnitt in Methode: "+ summe);
    	}
    	return summe/daten.length;
    }
    
 //   static double subDurchschnitt( int[] daten, int start, int ende ){
    	
 //   }
    
    

    public static void main( String[] args )
    {
        int[] werte = { 101, 102, 103, 104, 105, 106, 107, 108, 109, 110,
                111, 112, 113, 114, 115, 116, 117, 118, 119, 120,
                121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131 };
        
        int[] juni = gewicht( werte );
     
        int start = werte[1], ende = werte[16];
        
    	double durchschnitt = durchschnitt( juni );
        double subDurchschnitt = subDurchschnitt( start, ende);
        
        System.out.println("Durschnitt = " + durchschnitt );
    }
}

/*
101 102 103 104 105 106 107 108 109 110 111 112 113 114 115 116 
Start: 1 Ende: 16

dividiert durch: 16
Durchschnitt 1 - 16: 108.5

116 117 118 119 120 121 122 123 124 125 126 127 128 129 130 131 
Start: 16 Ende: 31

dividiert durch: 16
Durchschnitt 16 - 31: 123.5
Die Differenz der Durchschnitte beträgt: 15.0

*/