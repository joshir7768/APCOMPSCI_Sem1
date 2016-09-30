import java.util.Scanner;
public class Rectangle
{
	static double l,w;
	static double perimeter;
	
	public static void main(String[]args)
	{
		//initializing length and width here
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the length");
		l = kb.nextDouble();
		System.out.println("Please enter the width");
		w = kb.nextDouble();
		equation();
		method1();
	}
	
	public static void equation()
	{
		perimeter = (2 * l) + (2 * w);
		//use l and w directly
	}
	
	public static void method1()
	{
		System.out.printf("Your rectangle is " + "%10.5f\n" , perimeter , " sq ft around.");
	}
}