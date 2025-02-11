package aufgaben;

public class AufgabeLoop
{
	public static void main (String []args) {
		int count, sum;
		sum = 0;

		for ( count = 0; count <= 5; count++ )
			
		{
		  sum = sum + count ;
		  System.out.print( count + " " );
		  System.out.println( sum + " " );
		}

		System.out.println( "sum is: " + sum );
		System.out.println( "count is: " + count );
	}
}
