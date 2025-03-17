package Recursividad;

public class Recursividad2
{
	public static int sum ( int n )  
	 {	
	    if ( n == 0)
	       return 1;
	    else   
	    	return n + sum (n-1);
	    	
	 }	
			
	
	 public static void main( String[] args)
	 {
		int n = 3; 	
	    System.out.println("Die summe die ersten  " + n + " nummer sind: " + sum(n));
	 }
}
