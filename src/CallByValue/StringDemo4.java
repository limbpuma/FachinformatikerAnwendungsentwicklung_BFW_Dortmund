package CallByValue;

public class StringDemo4
{
	public static void main(String[]args) {
		String text = "Hallo";
		
		System.out.println("vorher: "+ text);
		
		textAender(text);
		
		System.out.println("Nachher: "+ text);
	}
	
	static void textAender(String str) {
		str = "Welt";
		System.out.println("In der Methode: "+ str);
	}
}
