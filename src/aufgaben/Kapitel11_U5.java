package aufgaben;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kapitel11_U5
{
	public static void main (String [] args)throws IOException {
		System.out.println("Aufgabe 2");
	BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

	String input1;
	double a, b;
	
	
	
	System.out.println("Bitte geben Sie die Länge");
	input1 = scan.readLine();
	b = Integer.parseInt(input1);
	
	a=Math.sqrt(Math.pow(b, 2)/2);

	System.out.println(a);
	
	}
}
