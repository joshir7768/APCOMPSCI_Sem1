import java.util.Scanner;
public class Factorial
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number ");
		int number  = kb.nextInt();
		int factorial = 1;
		for(int needed = 1; needed <= number; needed++)
		{
			factorial = factorial * needed;
		}
		System.out.println("the factorial is" + factorial );
		
		
	}
}