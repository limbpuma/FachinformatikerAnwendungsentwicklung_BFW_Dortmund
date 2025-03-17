package CallByValue;

public class ReturnDemo5
{
	public static void main (String[]args) {
		int wert = 5;
		System.out.println("Vorher: "+ wert);
		
		wert = verdoppeln(wert);
		
		System.out.println("Nachher: "+ wert);
	}
	
	static int verdoppeln(int x) {
		x = x +2;
		return x;
	}
}
