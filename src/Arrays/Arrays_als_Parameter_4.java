package Arrays;

public class Arrays_als_Parameter_4
{
	static int addiereElemente(int[] arr) {
		  int summe = 0;
		  for (int j = 0; j < arr.length; j++)
		    summe += arr[j];
		  return summe;
		}

		public static void main(String[] args) {
		  int[] ar1 = {-20, 19, 1, 5, -1, 27, 19, 5};
		  System.out.println("Die Summe der Elemente ist: " + addiereElemente(ar1));
		}

}
