package Methoden;

public class Grundlagen {

    // 1. Eine Methode ohne Parameter und ohne Rückgabewert
    public void sageHallo() {
        System.out.println("Hallo, Welt!");
    }

    // 2. Eine Methode mit einem Parameter und ohne Rückgabewert
    public void grussePerson(String name) {
        System.out.println("Hallo, " + name + "!");
    }

    // 3. Eine Methode mit zwei Parametern und einem Rückgabewert
    public int addiereZahlen(int zahl1, int zahl2) {
        return zahl1 + zahl2;
    }

    // 4. Eine Methode, die eine Schleife verwendet
    public void zahleBisZehn() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    } // Hier fehlte die schließende Klammer für die Methode

    // 5. Eine Methode, die eine Bedingung verwendet
    public String istGeradeOderUngerade(int zahl) {
        if (zahl % 2 == 0) {
            return "Gerade";
        } else {
            return "Ungerade";
        }
    }

    // Hauptmethode, um die anderen Methoden zu testen
    public static void main(String[] args) {
        Grundlagen beispiel = new Grundlagen(); // Hier war der Klassenname falsch geschrieben

        // Methode 1 aufrufen
        beispiel.sageHallo();

        // Methode 2 aufrufen
        beispiel.grussePerson("Anna");

        // Methode 3 aufrufen und das Ergebnis ausgeben
        int summe = beispiel.addiereZahlen(5, 3);
        System.out.println("Die Summe ist: " + summe);

        // Methode 4 aufrufen
        beispiel.zahleBisZehn();

        // Methode 5 aufrufen und das Ergebnis ausgeben
        String ergebnis = beispiel.istGeradeOderUngerade(7); // Hier war ein Punkt statt eines Leerzeichens
        System.out.println("Die Zahl ist: " + ergebnis);
    }
}