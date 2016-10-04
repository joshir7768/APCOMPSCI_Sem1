import java.util.Scanner;
public class Circle
{
	static double r;
	static double Area;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the radius");
		r = kb.nextDouble();
		calcSurf();
		method1();
		
		
	}
	
	public static void calcSurf()
	{
		Area = (3.14159 * ( r * r));
	}
	
	public static void method1()
	{
		System.out.printf(" The area of the circle with the radius of " + r + " is " + " %10.5f\n" , Area);
	}
}