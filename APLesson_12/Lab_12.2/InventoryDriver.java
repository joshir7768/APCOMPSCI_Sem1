import java.util.Scanner;
public class InventoryDriver
{
    public static void main(String[]args)
    {        
        Scanner kb = new Scanner(System.in);
		
		
		//user input for item name
		System.out.println("Enter item Name: ");
		String itemName = kb.next();
		//user input for item manufacturer
		System.out.println("Enter manufacturer of the item: ");
		String manufacturer = kb.next();
		
        System.out.println("Will you be entering category and price information? ");
		String response = kb.next();
		
		InventoryItem item1;
		
		if(response.equals("n"))
		{
			item1 = new InventoryItem(itemName, manufacturer); 
		}
		else
		{
			System.out.println("cateory: ");
			String c = kb.next();
			System.out.println("price: ");
			double p = kb.nextDouble();
			item1 = new InventoryItem(itemName, manufacturer, c, p);
		}
		System.out.println(item1);
     
    }        
} 