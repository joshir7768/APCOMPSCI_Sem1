import java.util.Scanner;
public class Circle
{
	//declaring only
	static double radius;

	
	public static void main(String[]args)
	{
		//initializing length and width here
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the radius");
		radius = kb.nextDouble();
		calcArea();
		method1();
	}
	
	public static double calcArea()
	{
		return (3.14159 * ( radius * radius));
	}
	
	public static void method1()
	{
		System.out.printf("The area of a circle with a radius of " + radius + " is " + "%10.5f\n" , calcArea());
	}
}