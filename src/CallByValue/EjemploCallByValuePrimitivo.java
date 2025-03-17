package CallByValue;

public class EjemploCallByValuePrimitivo
{
	public static void main(String[]args) {
		int zahl = 10;
		System.out.println("Antes de doblar: "+ zahl);
		verdoppeln(zahl);
		
		// zahl deberia seguir siendo 10
		System.out.println("Despues de doblar: " + zahl);
	}
	
	// Este metodo recibe una copia del entero (Call-ByValue)
	static void verdoppeln(int x) {
		x = x*2;
		System.out.println("Dentro del metodo verdoppeln: "+ x);
	}
}
