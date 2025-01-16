package aufgaben;

public class Aufgaben2_2 {
	public static void main(String[] args)
	{

		double sinx = 0.5235;
		double cosx = 0.5235;
		double quadrat = 2;

		double ergebnis = Math.pow(Math.sin(sinx), quadrat) + Math.pow(Math.sin(cosx), quadrat);

		/* ergebnis => Math.sin( sinx ) * Math.sin( sinx ) + Math.sin( cosx ) *
		 Math.sin( cosx );
		*/
		
		System.out.println("\tSinus: " + sinx + "\n\tCosinus: " + cosx + "\n\tErgebnis: " + ergebnis);
	}

}
