import java.util.Scanner;
public class Rectangle
{
	//declaring only
	static double length;
	static double width;
	
	public static void main(String[]args)
	{
		//initializing length and width here
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the length");
		length = kb.nextDouble();
		System.out.println("Please enter the width");
		width = kb.nextDouble();
		equation();
		method1();
	}
	
	public static double equation()
	{
		return (2 * length) + (2 * width);
	}
	
	public static void method1()
	{
		System.out.println("Your rectangle is " + equation() + " sq ft around.");
	}
}