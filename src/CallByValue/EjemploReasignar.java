package CallByValue;

public class EjemploReasignar
{
	public static void main(String[]args) {
		int [] data = {10,20,30};
		
		System.out.println("Antes de reasignar: ");
		imprimirArray(data);
		
		nuevoArray(data);
		
		System.out.println("Despues de reasignar: ");
		// Observa si cambia algo en 'data'
		imprimirArray(data);
	}
	
	static void nuevoArray(int[]arr) {
		// Arr es una copia de la regerencia
		// Al reasignarla, No se modifica la referencia en 'main'
		arr = new int [] {99,99,99};
		// Y por lo tanto, no afecta al array original
	}
	
	static void imprimirArray(int[]arr) {
		for (int i: arr) {
			System.out.println();
		}
	}
}
