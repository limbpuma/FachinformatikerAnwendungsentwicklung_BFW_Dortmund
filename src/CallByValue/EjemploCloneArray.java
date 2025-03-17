package CallByValue;

public class EjemploCloneArray
{
	public static void main(String[] args)
	{
		int[] original = {1,2,3,4,5};
		int[] copia = original.clone();
		
		// Modificamos el array copiado
		copia[0]=99;
		
		System.out.println("Original: ");
		imprimirArray(original);
		System.out.println("Copia: ");
		imprimirArray(copia);
	}
	
	static void imprimirArray(int[]arr) {
		for(int num:arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
}
