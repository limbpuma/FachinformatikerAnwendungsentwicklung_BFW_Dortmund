package aufgaben;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PowerPoint_U12
{
	public static void summe( int a, int b )throws IOException
	{ 	
		
		
	}
	// ---------------------------------------------------
	public static void main ( String[ ] args )throws IOException
	{ 
		
		System.out.println("Wie viele Ziffern soll Ihre Zahl haben? zwischen (1-10) ");
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		String input;
		int number, zuwahlZahl= 0, i=0;
		
		while(i < zuwahlZahl)
		{

		input = scan.readLine();
		zuwahlZahl = Integer.parseInt(input);
		zuwahlZahl++;
		
		}
		
	}
	


}
