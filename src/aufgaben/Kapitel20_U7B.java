package aufgaben;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Kapitel20_U7B
{	
	public static void main (String [] args)throws IOException
	{
			BufferedReader stdin = new BufferedReader( new InputStreamReader( System.in ) );
		
					
			int i, j,k, number;
			
			String	eingabe, // Benutzereingabe
						strZahl; // Eine Zahl aus der Eingabe
			
			char zeichen; // Ein Zeichen aus der Eingabe		
			
			System.out.println( "Bitte geben Sie beliebig viele durch Leerzeichen getrennte positive ganze Zahlen ein: " );			
			eingabe = stdin.readLine();
			
			
			if ( eingabe.charAt( eingabe.length() - 1 ) != ' ' )
				eingabe += " "; // eingabe = eingabe + " "
			
			strZahl = "";
			
			for ( i = 0 ; i < eingabe.length(); ++i ) // Die komplette Eingabe durchlaufen
			{	zeichen = eingabe.charAt( i ); // das i-te Zeichen

				if ( zeichen != ' ' ) // kein Leerzeichen, dann Zahl noch nicht zuende
					strZahl += zeichen; // Also Zeichen an bisherige Ziffern hängen
				else // Zahl zu Ende
				{	
					for (j = 0; j < eingabe.length(); j++) {
						System.out.print(zeichen + (" "));

						for (k = 0; k < zeichen; k++) {

							System.out.print("X");
						}
					}
				}
			
				
			}
			
	}
}
