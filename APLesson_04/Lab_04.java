import java.util.Scanner;
public class Lab_04
{
	public static void main(String[]args)
	{
		Lab_04 form = new Lab_04();
		Scanner kb = new Scanner(System.in);
	
	    System.out.println("Please enter your first item. ");
		String word1 = kb.nextLine();
		System.out.println("Enter the price for this item. ");
		double number1 = kb.nextDouble(); 
		
		kb.nextLine();
		
	    System.out.println("Please enter your second item. ");
		String word2 = kb.nextLine();
		System.out.println("Enter the price for this item. ");
		double number2 = kb.nextDouble(); 
		
		kb.nextLine();
		
		System.out.println("Please enter your third item. ");
		String word3 = kb.nextLine();
		System.out.println("Enter the price for this item. ");
		double number3 = kb.nextDouble(); 
		
		kb.nextLine();
		
		double subtotal = number1 + number2 + number3;
		double tax = subtotal * 0.08;
		double total = subtotal + tax;
		
		
	    System.out.println("<<<<<<<<<<<<<<<_Receipt_>>>>>>>>>>>>>>>");
		System.out.println(" ");
		form.format(word1, number1);
		form.format(word2, number2);
		form.format(word3, number3);
		form.format("Subtotal: " , subtotal);
		form.format("Tax: " , tax);
		form.format("Total: " , total );
		System.out.println(" ");
		System.out.println("_______________________________________");
		System.out.println("* Thank you for your support *");
	}
	
	public void format(String word, double number)
	{
		System.out.printf("\n* %20s %10.2f" , word, number);
	}
}