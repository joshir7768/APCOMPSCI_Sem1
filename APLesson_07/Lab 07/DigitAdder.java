import java.util.Scanner;
public class DigitAdder
{
	static int number;
	static int sum = 0;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Plese enter a number: ");
		number = kb.nextInt();
		sumDigits();
		System.out.println(number + " has " + sum + " digits. ");
	
	}
	public static void sumDigits()
	{
		int num = number;
		while(num > 0)
		{
			sum += num % 10;
			num /= 10;
		} 
	}
}