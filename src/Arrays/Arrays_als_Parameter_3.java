package Arrays;

public class Arrays_als_Parameter_3
{
	
		  static void ausgeben(int[] x) {
		    for (int i = 0; i < x.length; i++)
		      System.out.print(x[i] + " ");
		    System.out.println();
		  }

		  public static void main(String[] args) {
		    int[] ar1 = {-20, 19, 1, 5, -1, 27, 19, 5};
		    int[] ar2 = {2, 4, 1, 2, 6, 3, 6, 9};

		    System.out.print("\nDas 1. Array ist: ");
		    ausgeben(ar1);

		    System.out.print("\nDas 2. Array ist: ");
		    ausgeben(ar2);
		  }
		

}
