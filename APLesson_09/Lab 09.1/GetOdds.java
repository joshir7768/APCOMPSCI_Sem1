import java.util.Scanner;

public class GetOdds
{
	
	static int[] numbers;
	public static void main (String[]args)
	{
		numbers = new int[10];
		FillArray();
		System.out.println("For the numbers... " + numbers );
		PrintArray();
		System.out.println("\nThe numbers " +getOdds() + " are odd numbers");
		
	}
	static void FillArray()
	{
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random()*100) +1;
		}
	}	
	
	static void PrintArray()
	{
		for(int number : numbers)
		{
			System.out.print(number + ", ");
		}

	}	
	
	static String getOdds()
	{
		String odds = " ";
		for(int number : numbers)
		{
			if (number % 2 == 1)
			{
				odds += number;
			}
		}
		return odds;
	}
}