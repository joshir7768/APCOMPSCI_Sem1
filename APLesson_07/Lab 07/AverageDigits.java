import java.util.Scanner;
public class AverageDigits
{
	static int number;
	static int digits;
	static double average;
	
	public static void main(String[]args)
	{
		digits = 0; 
		average = 0;
		Scanner kb = new Scanner(System.in);
		System.out.println("Plese enter a number: ");
		number = kb.nextInt();
		avDigits();
		System.out.println("The average of the digits in " + number + " is " + average);
	
	}
	public static void avDigits()
	{
		int num = number;
		while(num > 0)
		{
			digits += 1;
			average += num % 10;
			num /= 10;
		} 
		average =((double)(average) / digits);
	}
}