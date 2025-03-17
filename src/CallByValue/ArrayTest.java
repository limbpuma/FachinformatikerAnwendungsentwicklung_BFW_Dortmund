package CallByValue;

public class ArrayTest
{
	public static void main(String[]args) {
		int [] zahlen = {1,2,3,4,5};
		System.out.println("Vorher: "+ zahlen[0]);
		changeArray(zahlen);
		System.out.println("Nachher: "+ zahlen[0]);// ACHTUNG!
	}
	
	static void changeArray(int[]arr) {
		arr[0] = 99; // Ändert das Original-Array!
	}
}

/*
Vorher: 1
Nachher: 99
*/