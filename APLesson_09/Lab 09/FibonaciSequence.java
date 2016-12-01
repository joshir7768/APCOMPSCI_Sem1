import java.util.Scanner;

public class FibonaciSequence
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your starting number: ");
		int starting = kb.nextInt();
		
		System.out.println("Plsease enter your sequence size: ");
		int seq = kb.nextInt();
		
		int[] numbers = new int[seq];
		
		for(int i = 0; i < numbers.length; i++)
		{
			if ( (i == 0 ) || (i == 1) )
		       {
				   numbers[i] = starting;
			   }
			else
				{
					numbers[i] = numbers[i-1] + numbers[i-2];
				}
				
			System.out.println(" " + numbers[i] );
		}

	}	
}