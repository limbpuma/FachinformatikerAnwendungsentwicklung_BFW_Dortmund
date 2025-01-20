package aufgaben;

public class Aufgabe2_3
{

	public static void main(String[] args)
	{

		double grad = 30,
		bogenmass = grad * Math.PI / 180,
		quadrat = 2,
		
		sinx = Math.sin(bogenmass),
		cosx = Math.cos(bogenmass);
		
		
		double ergebnis = Math.pow(sinx, quadrat) + Math.pow(cosx, quadrat);

		System.out.println("Der bogenmass von " + grad + " grad" + "\ngibt einer ergebnis von: " + ergebnis);

	}
}