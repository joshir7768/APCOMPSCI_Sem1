import java.util.Scanner; 

public class Exerice_02
{
	public static void main(String[]args)
	{
		Exerice_02 receipt = new Exerice_02();
		
		Scanner kb = new Scanner(System.in);
		System.out.println("What is the first item? ");
		String item1 = kb.next();
		System.out.println("What is the first item's price? ");
		double price1 = kb.nextDouble();
		System.out.println("What is the second item? ");
		String item2 = kb.next();
		System.out.println("what the second item's price ");
		double price2 = kb.nextDouble();
		System.out.println("What is the third item? ");
		String item3 = kb.next();
		System.out.println("What i the third item's price? ");
		double price3 = kb.nextDouble();
		System.out.println("What is the fourth item? ");
		String item4 = kb.next();
		System.out.println("what is the fourth item's price? ");
		double price4 = kb.nextDouble(); 
		
		double subtotal = price1 + price2 + price3 + price4;
		double discount = calcDisc(subtotal);
		double tax = subtotal * 0.08;
		double total = subtotal - discount + tax;
		
		System.out.println("<<<<<<<<<<<<<<<<<<receipt>>>>>>>>>>>>>>>>>>>");
		receipt.format(item1, price1);
		receipt.format(item2, price2);
		receipt.format(item3, price3);
		receipt.format(item4, price4);
		receipt.format("Subtotal: ", subtotal);
		receipt.format("Discount: ", discount);
		receipt.format("Tax: ", tax);
		receipt.format("total: ", total);
		System.out.println("________________________________________________");
		System.out.println("                   Thank you                     ");
		
		
	}
	
	public static double calcDisc(double sub)
	{
		if (sub >= 2000)
			return sub * 0.15;
		return 0.0;
	}	
	
	public static void format(String item, double price)
	{
		System.out.printf("%20s...............$%.2f\n", item, price);
	}
}






