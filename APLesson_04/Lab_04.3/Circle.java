import java.util.Scanner;
public class Circle
{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the radius");
		double r = kb.nextDouble();
		
		
		equation(r);
		method1("The area of a circle with a radius of " + r + " is" , equation(r) );
	}
	
	public static double equation (double r)
	{
		return (3.14159 * ( r * r));
	}
	
	public static void method1(String text, double Area)
	{
		System.out.printf(text + "%10.5f\n" , Area);
	}
}