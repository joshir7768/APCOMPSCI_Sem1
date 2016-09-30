import java.util.Scanner;
public class Rectangle
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the length");
		Double l = kb.nextDouble();
		System.out.println("Enter the width");
		Double w = kb.nextDouble();
		calcPerim(l,w);
		print(calcPerim(l,w));
	}
	
	public static double calcPerim(double l, double w)
	{
		return  (2 * l) + (2 * w);
	}
	
	public static void print(double perimeter)
	{
		System.out.println("Your rectangle is " + perimeter + "ft around");
	}
}