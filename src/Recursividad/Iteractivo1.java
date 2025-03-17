package Recursividad;

public class Iteractivo1
{
	public static int fakultat (int n )  
	 {	
		
		
		int erbegnis = 1;
		
		for(int i=0;n>i;i++)
	    	erbegnis *= i;
	   
	    return erbegnis;
	 }	
			
	
	 public static void main( String[] args)
	 {	
	
		int n = 6; 	
	    System.out.println(fakultat(n));
	 }
}
