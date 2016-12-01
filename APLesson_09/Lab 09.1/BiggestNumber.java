import java.util.Scanner;

public class BiggestNumber 
{
	
	static int[] numbers;
	public static void main (String[]args)
	{
		numbers = new int[10];
		FillArray();
		System.out.println("For the numbers... ");
		PrintArray();
		System.out.println("\nThe biggest number is... " +getBiggest());
		
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
			System.out.print(number + " ");
		}

	}	
	
	static int getBiggest()
	{
		int max = 0;
		for(int number : numbers)
		{
			if (number > max)
			{
				max = number;
			}
		}
		return max;
	}
}