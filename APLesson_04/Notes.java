import java.util.Scanner;
public class Notes
{
	static int first;
	static int second;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter first number");
		first = kb.nextInt();
		System.out.println("Enter the second number");
		second = kb.nextInt();
		subtract();
		print();
	}
	
	public static int subtract()
	{
		return first - second;
	}
	
	public static void print()
	{
		System.out.println(first + " - " + second + " equals to " + subtract());
	}
}