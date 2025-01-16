package aufgaben;

public class Aufgabe2_3
{

	public static void main(String[] args)
	{

		double grad = 30;
		double bogenmass = grad * Math.PI / 180;
		double quadrat = 2;

		double ergebnis = Math.pow(Math.sin(bogenmass), quadrat) + Math.pow(Math.cos(bogenmass), quadrat);

		System.out.println("Der bogenmass von " + grad + " grad" + "\ngibt einer ergebnis von: " + ergebnis);

	}
}