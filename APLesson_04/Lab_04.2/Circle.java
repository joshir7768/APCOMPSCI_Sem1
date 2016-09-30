import java.util.Scanner;
public class Circle
{
	static double r;
    static double Area;
	
	public static void main(String[]args)
	{
		//initializing length and width here
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the radius");
		r = kb.nextDouble();
		calcArea();
		method1();
	}
	
	public static void calcArea()
	{
		Area = (3.14159 * ( r * r));
	}
	
	public static void method1()
	{
		System.out.printf("The area of a circle with a radius of " + r + " is " + "%10.5f\n" , Area);
	}
}