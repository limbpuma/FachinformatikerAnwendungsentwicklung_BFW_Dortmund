package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Aufgabe10_01
{	
	
	public static void main (String[]args) throws NumberFormatException, IOException {
		BufferedReader inData = new BufferedReader(new InputStreamReader(System.in));

        int[] data = new int[10];

        // Lese die eingabe in der array
        System.out.println("Bitte geben Sie nacheinander 10 ganze Zahlen ein: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print("Wert " + (i + 1) + ": ");
            data[i] = Integer.parseInt(inData.readLine());
        }

        // ausgabe
        System.out.print("Ursprüngliches Array: ");
        for (int num : data) {
            System.out.print(num + " ");
        }
        System.out.println(); // 
		
       
		//Bitte geben Sie eine Zahl ein, nach der gesucht werden soll: 3
        System.out.print("Bitte geben Sie eine Zahl ein, nach der gesucht werden soll: ");
        int searchNumber = Integer.parseInt(inData.readLine());
        
        for(int i= 0; i < data.length;i++) {
        	System.out.println("data i : "+ i);
        	if (searchNumber == data[i]) {
        		System.out.println("gesuchte Zahl wurde am Index" + data[i]+ "= Position "+ data[i] + "gefunden.");
        	}else{
        		System.out.println("Die gesuchte Zahl wurde nicht gefunden.");
        	}
        }
	}
}
