package Methoden;

public class MethodeZwei
{
	// Methode, die den Durchschnitt, die höchste und die niedrigste Zahl berechnet
	public void analysiereZahlen(int [] zahlen) {
		if (zahlen == null || zahlen.length== 0) {
			System.out.println("Die Zahlenliste ist leer oder ungültig.");
			return;
		}
		int summe = 0;
		int hoechste = zahlen[0];
		int niedrigste = zahlen[0];
		
		// Schleife, um die Summe, die hochste und die niedrigste Zahl zu berechnen
		for (int zahl : zahlen) {
			summe += zahl;
			if(zahl > hoechste) {
				hoechste = zahl;
			}
			if(zahl < niedrigste) {
				niedrigste = zahl;
			}
		}
		
		// Durchsnitt berechnen
		double durchschnitt = (double) summe / zahlen.length;
		
		// Ergebnisse ausgeben
		System.out.println("Die hoechste Zahl ist: " + hoechste);
		System.out.println("Die niedrigste Zahl ist: " + niedrigste);
		System.out.println("Die durchschnitt Zahl ist: " + durchschnitt);	
	}

	// Hauptmethode, um die Methode zu testen
	public static void main (String []args) {
		MethodeZwei beispiel = new MethodeZwei();
		
		// Beispielzahlen
		int [] zahlen = { 12, 45, 67, 23, 9, 54, 32 };
		
		// Methode aufrufen
		beispiel.analysiereZahlen(zahlen);
		
	}
	
}
