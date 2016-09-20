public class Lab_04
{
	public static void main(String[]args)
	{
		Lab_04 form = new Lab_04();
		
		System.out.println("<<<<<<<<<<<<<<<_Receipt_>>>>>>>>>>>>>>>");
		
		String word1 = "Cheese Sandwich .....";
		double number1 = 4.50;
		
		form.format(word1, number1);
		
		String word2 = "French Fries .....";
		double number2 = 2.88;
		
		form.format(word2, number2);
		
		String word3 = "Soda..... ";
		double number3 = 1.63;
		
		form.format(word3, number3);
		
		System.out.println(" ");
		
		String word4 = "Subtotal: .....";
		double number4 = 9.01;
		
		form.format(word4, number4);
		
		String word5 = "Tax: .....";
		double number5 = 0.63;
		
		form.format(word5, number5);
		
		String word6 = "Total: .....";
		double number6 = 9.64;
		
		form.format(word6, number6);
		
		System.out.println(" ");
		System.out.println("_______________________________________");
		System.out.println("* Thank you for your support *");
	}
	
	public void format(String word, double number)
	{
		System.out.printf("\n* %20s %10.2f" , word, number);
	}
}