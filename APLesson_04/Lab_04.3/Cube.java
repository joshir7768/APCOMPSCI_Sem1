import java.util.Scanner;
public class Cube
{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the length");
		double l = kb.nextDouble();
		
		
		equation(l);
		method1("The surface area of a cube with " + l + " sides is ", equation(l));
	}
	
	public static double equation (double l)
	{
		return (6 * (l * l));
	}
	
	public static void method1(String text, double surfaceArea )
	{
		System.out.printf(text + "%10.5f\n" , surfaceArea);
	}
}