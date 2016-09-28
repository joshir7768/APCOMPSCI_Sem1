import java.util.Scanner;
public class Cube
{
	//declaring only
	static double length;

	
	public static void main(String[]args)
	{
		//initializing length and width here
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the length");
		length = kb.nextDouble();
		calcSurf();
		method1();
	}
	
	public static double calcSurf()
	{
		return (6 * (length *length));
	}
	
	public static void method1()
	{
		System.out.printf("The surface area of a cube with " + length + " sides is " + "%10.5f\n" , calcSurf());
	}
}