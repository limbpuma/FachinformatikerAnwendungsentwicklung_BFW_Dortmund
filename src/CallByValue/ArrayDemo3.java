package CallByValue;

public class ArrayDemo3
{
	public static void main (String[]args) {
		
		int [] zahlen = { 1,2,3,4,5};
		System.out.println("Vorher: " + zahlen[1]);
		
		arraAendern(zahlen);
		
		System.out.println("Nachher: "+ zahlen[1]);
		
	}
	
	
	static void arraAendern(int[]arr) {
		arr[1] = 99; // Andern das Original Array, weil die Referenz übergeben würde
	}
}

/*
Objetivo: Demostrar que se copia la referencia del array, no el array mismo.
*/