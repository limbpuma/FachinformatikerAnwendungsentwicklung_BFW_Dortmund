package aufgaben;

/*
 Eine Bank verfährt nach der folgenden Regel: Wenn ein Kunde auf seinem Girokonto ein Guthaben von mehr als 1000$ oder auf seinem Sparkonto ein Guthaben von mehr als 1500$ hat, wird keine Scheckgebühr erhoben. Andernfalls wird eine Gebühr von 0.15$ erhoben. Schreiben Sie ein Programm, das nach dem Kontostand der beiden Konten fragt und dann ausgibt, ob eine Gebühr erhoben wird oder nicht.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Aufgabe14_1
{
		public static void main (String [] args) throws IOException{
		System.out.println("Scheckgebühr!!");

		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

		String inputOne, inputTwo;
		double girokonto, sparkonto, guthaben, gebuehr;

		System.out.println("Geben Sie Ihre Guthaben auf Ihre Girokonto: ");
		inputOne = scan.readLine();
		girokonto = Double.parseDouble(inputOne);

		System.out.println("Geben Sie Ihre Guthaben auf Ihre Sparkonto: ");
		inputTwo = scan.readLine();
		sparkonto = Double.parseDouble(inputTwo);
		
		if(girokonto > 1000 || sparkonto> 1000) {
			gebuehr = 0.15;
			System.out.println("wird eine Gebühr von" + gebuehr + "erhoben !");
		}
		
		//Aufgabe 1b — Scheckgebühr, soll mann nur komentieren.
		System.out.println("wird keine Scheckgebühr erhoben !");
		
	}

}
