package CallByValue;

public class EjemploCallByValueArray
{
	public static void main(String[]args) {
		int [] data = {1,2,3,4,5};
		
		System.out.println("Array original: ");
		imprimirArray(data);
		
		modificarPrimerElemento(data);
		
		// Observa que el primer elemento cambio a 99
		System.out.println("Array despues de modificarPrimer Elemento: ");
		imprimirArray(data);
	}
	
	static void modificarPrimerElemento(int[]arr) {
		// arr es una copia de la referencia,
		// pero sigue apuntandfo al mismo objeto en memoria
		arr[0] = 99;
	}
	
	static void imprimirArray(int[]arr) {
		for(int i:arr) {
			System.out.println(i+" ");
		}
	}
}
