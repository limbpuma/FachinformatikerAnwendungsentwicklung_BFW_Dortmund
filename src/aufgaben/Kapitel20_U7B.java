package aufgaben;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Kapitel20_U7B
{	
	public static void main (String [] args)throws IOException
	{
			BufferedReader stdin = new BufferedReader( new InputStreamReader( System.in ) );
		
					
			int number;
			
			String	eingabe, // Benutzereingabe
						strZahl; // Eine Zahl aus der Eingabe
			
			char zeichen; // Ein Zeichen aus der Eingabe		
			
			System.out.println( "Bitte geben Sie beliebig viele durch Leerzeichen getrennte positive ganze Zahlen ein: " );			
			eingabe = stdin.readLine();
			number = Integer.parseInt(eingabe);
			
			
			for (int i = 0; i < eingabe.length(); i++) {
				System.out.print(number + (" "));

				for (int j = 0; j < number; j++) {

					System.out.print("X");
				}
			}
			
	}
}
