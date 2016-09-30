import java.util.Scanner;
public class Average
{
	static double num1;
	static double num2;
	static double num3;
	static double average;
	
	
	public static void main(String[]args)
	{
		//initializing length and width here
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the first number");
		num1 = kb.nextDouble();
		System.out.println("Please enter the second number");
		num2 = kb.nextDouble();
		System.out.println("Please enter the third number");
		num3 = kb.nextDouble();
		equation();
		method1();
	}
	
	public static void equation()
	{
		average = (num1 + num2 + num3) / 3;
	}
	
	public static void method1()
	{
		System.out.printf("The average of " + num1 + ", " + num2 + ", " + "and " + num3 + " is" + "%10.5f\n " , average); 
	}
}