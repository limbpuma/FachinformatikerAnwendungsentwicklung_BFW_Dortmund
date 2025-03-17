package CallByValue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjemploUserInput
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader inData = new BufferedReader(new InputStreamReader(System.in));
		int [] data = new int[5];
		
		// 1. Pedir datos al usuario
		for (int i = 0; i < data.length; i++) {
			System.out.println("Ingrese un numero para la posicion "+ i + ": ");
			data[i] = Integer.parseInt(inData.readLine());
		}
		
		// 2. Mostrar el array original
		System.out.println("Array original: ");
		imprimirArray(data);
		
		// 3. Pedir indice y nuevo valor
		System.out.println("Ingrese el indice que quiere reemplazar (0 - 4): ");
		int index = Integer.parseInt(inData.readLine());
		
		System.out.println("Ingrese el nuevo valor: ");
		int nuevoValor = Integer.parseInt(inData.readLine());
		
		// 4. Llamar a un metodo que modifique
		reemplazarValor(data, index, nuevoValor);
		
		// 5. Mostrar array resultante
		System.out.println("Array modificado: ");
		imprimirArray(data);
	}
	
	static void reemplazarValor(int [] arr, int idx, int val) {
		
		System.out.println("Direccion de memoria de arr: "+ arr);
		System.out.println("Direccion de memoria de data (en main): "+ arr);
		
		
		if(idx >= 0 && idx < arr.length) {
			arr[idx] = val; // Estoy si afecta el array en main
		}
	}
	
	static void imprimirArray(int[]arr) {
		for(int num:arr) {
			System.out.println(num+" ");
			System.out.println();
		}
	}
}
