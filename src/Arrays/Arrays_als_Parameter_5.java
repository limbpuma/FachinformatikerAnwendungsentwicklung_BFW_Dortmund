package Arrays;

public class Arrays_als_Parameter_5
{
	
		  static void printArray(int[] arr) {
		    // TODO: Schreibe eine Schleife, um das Array auszugeben.
			  for(int i = 0; i < arr.length; i++) {
				  System.out.print(arr[i] + " ");
			  }
		    
		  }

		  public static void main(String[] args) {
		    int[] zahlen = {3, 7, 1, 9, 2};
		    printArray(zahlen);
		  }
		

}
