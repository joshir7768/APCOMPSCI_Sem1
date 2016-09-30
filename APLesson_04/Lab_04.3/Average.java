import java.util.Scanner;
public class Average
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the first number");
		double num1 = kb.nextDouble();
		System.out.println("Please enter the second number");
		double num2 = kb.nextDouble();
		System.out.println("Please enter the third number");
		double num3 = kb.nextDouble();
		
		
		equation(num1, num2, num3);
		method1("The average of " + num1 + ", " + num2 + ", " + "and " + num3, equation(num1,num2,num3));
	}
	public static double equation(double num1, double num2, double num3)
	{
		return (num1 + num2 + num3) / 3;
	}
	
	public static void method1(String text, double average)
	{
		System.out.printf(text + "%10.5f\n " , average);
	}

}