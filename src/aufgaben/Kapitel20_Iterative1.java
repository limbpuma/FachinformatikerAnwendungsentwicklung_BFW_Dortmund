package aufgaben;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kapitel20_Iterative1
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

		String eingabe, // Zum Einlesen der Tastatureingaben
				sZahl, jaNein; // eine in der Eingabe gefundene Zahl
		char zeichen; // ein Zeichen aus der Eingabe
		int zahl, // Wert der eingegebenen Zahl
				i, j, number;
		boolean questionLoop = false;
	

		
					System.out.print("Bitte Zahl kleiner 10 eingeben (e = Ende):");
					eingabe = stdin.readLine();
					number = Integer.parseInt(eingabe);
					if (eingabe.charAt(eingabe.length() - 1) != ' ')
						eingabe += " ";
					sZahl = "";
					
					if(number > 0 & number < 10) {
						
							for (i = 0; i < eingabe.length(); ++i) {
								zeichen = eingabe.charAt(i);
								if (zeichen != ' ')
									sZahl += zeichen;
								else {
									zahl = Integer.parseInt(sZahl);
									System.out.print(sZahl + "\t");

									for (j = 0; j < zahl; ++j)
										System.out.print("X");

									System.out.println();
									sZahl = "";
								}
							}
	
					}else {
						System.out.println("Fehlerhafte Eingabe:");
					}
					
					
					
					
				}
				
				
			

			
			
			
			
}
