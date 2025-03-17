package CallByValue;

public class CallyValueArrayBeispiel
{
	class ArrayAendernTest {
	    static void setElementZero(int[] x, int index) {
	        if (index < x.length) {
	            x[index] = 0;
	        }
	    }

	    public static void main(String[] args) {
	        int[] arr = {27, 19, 34, 5, 12};
	        System.out.println("Vorher:");
	        ausgeben(arr);

	        setElementZero(arr, 0);
	        System.out.println("Nachher:");
	        ausgeben(arr);
	    }

	    static void ausgeben(int[] x) {
	        for (int j : x) {
	            System.out.print(j + " ");
	        }
	        System.out.println();
	    }
	}

}
