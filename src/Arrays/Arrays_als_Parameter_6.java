package Arrays;

public class Arrays_als_Parameter_6
{
	
		  static int findMax(int[] arr) {
		    // TODO: Schreibe eine Schleife, um das größte Element zu finden.
			  int max = arr[0]; // Startwert: erstes Element
			  for (int i = 1; i < arr.length; i++) { // Schleife beginnt ab Index 1
			      if (arr[i] > max) {
			        max = arr[i]; // Wenn aktuelles Element größer ist, speichern wir es
			      }
			    }
			    return max;
		  }

		  public static void main(String[] args) {
		    int[] zahlen = {3, 7, 1, 9, 2};
		    System.out.println("Das größte Element ist: " + findMax(zahlen));
		  }
		

}
