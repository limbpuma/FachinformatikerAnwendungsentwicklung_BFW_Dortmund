package Uebungen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

public class Funk02Superhirn
{
	final static String TITEL = " S U P E R H I R N";
	final	static int MAX = 5; // Anzahl der Ziffern in der Vorgabe. Kann später problemlos auf andere Werte geändert werden
	final	static int MAX_VERSUCHE = 12; // Maximale Anzahl der Versuche, die zum Raten zur Verfügung stehen. S.o.
	final static boolean KONSOLE = true;
	
	private static String eingabeMitTest( String text, String s1, String s2, String titel ) throws IOException
	{	if ( KONSOLE )
			return eingabeMitTestK( text, s1, s2 );
		else
			return eingabeMitTestW( titel, text );
	}
	
	private static String eingabeMitTestK( String text, String s1, String s2 ) throws IOException
	{	String ein;
		BufferedReader stdin = new BufferedReader( new InputStreamReader( System.in ) );
		do
		{	System.out.print( text );
			ein = stdin.readLine();
		} while( ! ( ein.equalsIgnoreCase( s1 ) || ein.equalsIgnoreCase( s2 ) ) );
		
		return ein;
	}
	
	private static String eingabeMitTestK( String text, String s1, String s2 ) throws IOException
	{	String ein;
		BufferedReader stdin = new BufferedReader( new InputStreamReader( System.in ) );
		do
		{	System.out.print( text );
			ein = stdin.readLine();
		} while( ! ( ein.equalsIgnoreCase( s1 ) || ein.equalsIgnoreCase( s2 ) ) );
		
		return ein;
	}
	
	private static String eingabeMitTestW( String titel, String text )
	{	String[] optionen = { "Ja", "Nein" };
		     
		int i = JOptionPane.showOptionDialog( null,
									                 text,                // Fragetext
									                 titel,               // Titel
									                 JOptionPane.CANCEL_OPTION,
									                 JOptionPane.QUESTION_MESSAGE, // Icon
									                 null,optionen,optionen[0] );
		return ( i == 0 ) ? "j" : "n";
	}
	
	private static String zufallszahl3( int anzahlZiffern )
	{	int i, index;
		String erg = "", alleZahlen = "0123456789";
		
		if ( anzahlZiffern > 10 )
			anzahlZiffern = 10;
		else
			if ( anzahlZiffern < 1 )
				anzahlZiffern = 1;
		// Solange durchlaufen, bis alle Ziffern mit Zufallszahlen gefüllt
		for ( i = 0; i < anzahlZiffern; ++i )
		{	index = (int) ( Math.random() * ( 10 - i ) ); // Index für Zufallszahl von 0 bis 9 
																		 //  - i, da in jedem Durchlauf eine Ziffer wegfällt
			erg += alleZahlen.charAt( index ); // Ergebniszahl ergänzen
			
			// Index ist verbraucht, also zugehörige Ziffer aus alleZahlen entfernen
			alleZahlen = alleZahlen.substring( 0, index ) + alleZahlen.substring( index + 1 );
		}
		return erg;
	}
	
	private static int schwarz( String vor, String ein )
	{	int s = 0,
			 laenge = vor.length();		   
	   for ( int i = 0; i < laenge; ++i )
        if ( vor.charAt( i ) == ein.charAt( i ) )
        	s++;	   
	   return s;
	}
	
	private static int  weiss( String vor, String ein )
	{	int w = 0,
	  		 laengeVor = vor.length(),
	  		 laengeEin = ein.length();	// Eigentlich genügt eine Länge, da beide gleich lang sein müssten												
	   for ( int i = 0; i < laengeVor; ++i )
	      for ( int j = 0; j < laengeEin; ++j )
	         if ( i != j && vor.charAt( i ) == ein.charAt( j ) )
	         	w++;   
	   return w;

	}
	
	private static String inputBox( String text ) throws IOException
	{	if ( KONSOLE )
			return inputBoxK( text );
		else
			return inputBoxW( text );
	}	
	
	private static String inputBoxK( String text ) throws IOException
	{	BufferedReader stdin = new BufferedReader( new InputStreamReader( System.in ) );
		System.out.print( text + "\n    " ); // Eingabe direkt unter den zuvor eingegebenen Ziffern
		return stdin.readLine();
	}
	
	private static String inputBoxW( String text ) throws IOException
	{	return JOptionPane.showInputDialog( text + "\n    " );
	}

  	private static void outputBox( String text ) throws IOException
	{	if ( KONSOLE )
			outputBoxK( text );
		else
			outputBoxW( text );
	}
  	 	
  	private static void outputBoxK( String text ) throws IOException
	{	System.out.println( text + "\n    " );
	}
  	
  	/* Alternative: Fenster statt Konsole */
  	private static void outputBoxW( String text ) throws IOException
	{	JOptionPane.showMessageDialog( null, text );
	}
  	
  	private static boolean eingabeOK( String text, int maxStellen ) throws IOException
	{	int laenge;
	   boolean fehler;
	   
	   fehler = ! nurZiffern( text ); // Nur Ziffern erlaubt;
	   if ( fehler )
	   	outputBox( "Ihre Eingabe darf nur Ziffern enthalten" ); 
	   else
	   {  laenge = text.length(); // genau maxStellen Ziffern sind einzugeben
	      if ( laenge != maxStellen )
	      {	outputBox( "Ihre Eingabe muss aus " + maxStellen + " Ziffern bestehen" ); 
	         fehler = true;
	      }
	      else
	      {  fehler = doppelteZeichen( text ); // doppelte Ziffern verboten
	         if ( fehler ) 
	         	outputBox( "Ihre Eingabe enthält doppelte Ziffern" ); 
	      }
	   }
	   return ! fehler; // Eingabe ist OK, wenn kein Fehler erkannt wurde
	}
  	
  	private static boolean doppelteZeichen( String text )
	{	boolean doppelt;
	   int laenge, i;
	   
	   laenge = text.length();
	   doppelt = false;
	   
		int j;
//	   for ( i = 0; i < laenge && ! doppelt; ++i )
//	      for  ( j = 0; j < laenge && ! doppelt; ++j )
//	         if ( i != j && text.charAt( i ) ==  text.charAt( j ) )
//	         	doppelt = true;
	   	
		for ( i = 0; i < laenge && ! doppelt; ++i )
	      for  ( j = i + 1; j < laenge && ! doppelt ; ++j )
	      	if ( text.charAt( i ) ==  text.charAt( j ) )
      		  doppelt = true;	      	

		for ( i = 0; i < laenge && ! doppelt; ++i )
	   	doppelt = ( i != text.lastIndexOf( text.charAt( i ) ) );		

		return doppelt;
	}
  	
  	private static boolean nurZiffern( String ziffern )
	{	int laenge, i;
	   char eineZiffer; 
	   boolean ok;
	   
	   ok = true;
	   laenge = ziffern.length();
	   
	   for ( i = 0; i < laenge && ok; ++i )
	   {  eineZiffer = ziffern.charAt( i );
//	      if ( eineZiffer < '0' || eineZiffer > '9' ) 
//	      	ok = false;	 
	   	ok = eineZiffer >= '0' && eineZiffer <= '9';
	   }
	   
	   return ok;
	}
  	
  	private static String superhirn( int maxStellen, int maxVersuche ) throws IOException 
	{	String	vorgabe, 	// Zufallszahl des Computers
		 			eingabe, 	// Tipp des Spielers
		 			ausgabe, 	// Text für inputBox und Messagebox
		 			text;  		// Text für Messagebox
	   int schw;   		// Anzahl Ziffern an richtiger Position
	   int anzahlVersuche;
	   boolean ok;     	// Gibt an ob Eingabe fehlerfrei ist
	   
	   vorgabe = zufallszahl3( maxStellen ); // maxStellen zufällige, unterschiedliche Ziffern ermitteln;
	   anzahlVersuche = 1;
	   eingabe = "";
	   ausgabe = TITEL + "\n    *****\n" ; // Auszuliefernde Programmversion
//	   ausgabe = TITEL + "\n    " + vorgabe + "\n" ; // Testversion

	   do // Solange bis abgebrochen oder erraten oder maximale Versuchsanzahl erreicht
	   {  do  // Solange, bis abgebrochen oder Eingabe OK ist
	   	{	schw = 0;
	   		ok = true;
	         eingabe = inputBox( ausgabe + "Ihr " + anzahlVersuche + ". Versuch (" + maxStellen + " Ziffern)" ); 
	         
	         if ( eingabe != null && eingabe.length() != 0 )
	         		ok = eingabeOK( eingabe, maxStellen ); // Nicht abgebrochen, dann;
	                                                      // testen, ob Eingabe OK ist
	   	} while ( ! ok && eingabe.length() != 0 ); // Solange, bis abgebrochen oder Eingabe OK ist
	      
	   	if ( eingabe != null && eingabe.length() != 0 ) // Nur wenn nicht abgebrochen
	      {  schw = schwarz( vorgabe, eingabe ); // Richtige Positionen ermitteln
	         
	         // Ausgabe um neuen Versuch ergänzen und dabei richtige Positionen(schw)
	         // und richtige Ziffern an falscher Position (weiss(...)) angeben
	      	if ( anzahlVersuche < 10 )
	      		ausgabe += " ";
	      	ausgabe += anzahlVersuche + ") " + eingabe +
	                     "  S:" + schw +
	                     "  W:" + weiss( vorgabe, eingabe ) + "\n";
	         anzahlVersuche++;
	      }
	   // Solange bis abgebrochen oder erraten oder maximale Versuchsanzahl erreicht
	   } while ( eingabe != null && eingabe.length() != 0 && schw != maxStellen && anzahlVersuche <= maxVersuche );
	   
	   text = "***>" + vorgabe + "<*********" + ausgabe.substring( TITEL.length() + 10 );
		if ( schw != maxStellen ) // Nicht erraten
	   	text += ">>>>Verloren!<<<<<<\n" + "Die Vorgabe war\n";
	   else // erraten
	   	text += ">>>>Erraten!<<<<<<<\n";

		text += "***>" + vorgabe + "<*********";

		return text; // Text für die Ausgabe in Main() zurück liefern
	}
  	
  	public static void main(String[] args) throws IOException
	{	String text, jaNein;
   
		do
		{  text = superhirn ( MAX, MAX_VERSUCHE );
		 	jaNein = eingabeMitTest( text + "\nNochmal?", "j", "n", TITEL ); // Fenster
		} while ( jaNein.equalsIgnoreCase( "j" ) );
		
		outputBox( "Bye" );
	}
	
}
