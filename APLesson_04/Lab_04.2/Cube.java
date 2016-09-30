import java.util.Scanner;
public class Cube
{
	static double l;
	static double surfaceArea;

	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the length");
		l = kb.nextDouble();
		calcSurf();
		method1();
	}
	
	public static void calcSurf()
	{
		surfaceArea = (6 * (l * l));
	}
	
	public static void method1()
	{
		System.out.printf("The surface area of a cube with " + l + " sides is " + "%10.5f\n" , surfaceArea);
	}
}