import java.util.Scanner;
public class Circle
{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the radius");
		Double r = kb.nextDouble();
		calcArea(r);
		method1(calcArea(r));
	}
	
	public static double calcArea(double r)
	{
		return (3.14159 * ( r * r));
	}
	
	public static void method1(double Area)
	{
		System.out.printf("The area of a circle with a radius of " + r + " is " + "%10.5f\n" , Area);
	}
}