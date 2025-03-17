package Arrays;

public class Arrays_als_Parameter_2
{
	
		  // Methode, die ein Array ausgibt
		  static void ausgeben(int[] x) {
		    for (int i = 0; i < x.length; i++)
		      System.out.print(x[i] + " ");
		    System.out.println();
		  }

		  public static void main(String[] args) {
		    int[] ar1 = {-20, 19, 1, 5, -1, 27, 19, 5};
		    int[] ar2 = {20, -19, -1, -5, 1, -27, -19, -5};
		    System.out.print("\nDas Array ist: ");
		    ausgeben(ar1); // Methode wird aufgerufen
		    System.out.print("\nDas Array ist: ");
		    ausgeben(ar2);
		  }
		

}
