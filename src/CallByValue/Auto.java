package CallByValue;

public class Auto
{
		String modell;
		Auto(String modell){
			this.modell = modell;
		}
	
		
	public class ObjectTest {
		public static void main (String[]args) {
			Auto meinAuto = new Auto("BMW");
			System.out.println("Vorher: "+ meinAuto.modell);// Wird jetzt "Audi" sein!
			
			modellAendern(meinAuto);
			
			System.out.println("Nachher: "+ meinAuto.modell);
		}
	}
	
	static void modellAendern(Auto auto) {
		auto.modell = "Audi"; // Andert das Original-Objekt
	}
}
