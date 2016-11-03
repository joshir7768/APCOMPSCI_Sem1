import java.util.Scanner;
public class CountbyX
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your first number ");
		int first = kb.nextInt();
		System.out.println("Enter your second number ");
		int second = kb.nextInt();
		for(int i = first; i <= second; i+=2)
		{
			System.out.print(i + " ");
		}
	}
}