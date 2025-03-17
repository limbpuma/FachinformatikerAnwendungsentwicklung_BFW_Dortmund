package Arrays;

public class Arrays_als_Parameter_7
{
	
	static int sumArray(int[] arr) {
	    // TODO: Schreibe eine Schleife, um alle Zahlen zu addieren.
		int summe = 0;
		for(int i = 0; i < arr.length; i++) {
			summe += arr[i];
		}
		return summe;
	  }

	  public static void main(String[] args) {
	    int[] zahlen = {3, 7, 1, 9, 2};
	    System.out.println("Die Summe der Elemente ist: " + sumArray(zahlen));
	  }
		

}
