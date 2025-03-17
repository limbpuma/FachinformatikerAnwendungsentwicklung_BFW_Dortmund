package CallByValue;

public class CallyValuePrimitiveBeispiel
{
	class AendernTest {
	    static void zero(int x) {
	        x = 0;
	    }

	    public static void main(String[] args) {
	        int zahl = 27;
	        System.out.println("Vorher: " + zahl);

	        zero(zahl);
	        System.out.println("Nachher: " + zahl);
	    }
	}

}
/*
Primitiven Typen (int, double, etc.) werden per Call-By-Value übergeben und nicht verändert.
Arrays sind Objekte, deshalb wird ihre Referenz übergeben, sodass ihre Elemente geändert werden können.
Arrays müssen Element für Element kopiert werden, da sonst nur die Referenz überschrieben wird.
Methoden wie setAlleZero() oder kopieren() helfen, Arrays effizient zu modifizieren.

*/