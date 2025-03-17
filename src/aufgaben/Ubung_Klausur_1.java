package aufgaben;


public class Ubung_Klausur_1
{
	public static void main(String [] args) {
		String e = "1612";
		int i = 0;
		int m = Character.getNumericValue(e.charAt(i));
		
		
		
		
		 while ( i <= e.length()){
			 
			 int currentDigit = Character.getNumericValue(i);
			 
		 if (currentDigit == 1) {
		 m=1;
		 }
		 
		 i= i++;
		 System.out.print("m = " + m);
		 
		 }
		 
		
		
		
		
	}
}
