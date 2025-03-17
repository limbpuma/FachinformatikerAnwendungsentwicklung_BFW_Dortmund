package Recursividad;

public class recursividad1
{
	public static int fakultat ( int n )  
	 {	
	    if ( n == 0)
	       return 1;
	    else   
	    	return n * fakultat (n-1);
	 }	
			
	
	 public static void main( String[] args)
	 {
		int n = 6; 	
	    System.out.println( fakultat( n));
	 }
}
