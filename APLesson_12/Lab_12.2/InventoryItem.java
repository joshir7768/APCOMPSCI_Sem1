import java.util.Scanner;
public class InventoryItem
{
	private String name;
	private String manufacturer; 
	private String category; 
	private int UPC;
	private double price;
	
	public InventoryItem()
    {
        name = "";
		manufacturer = "";
        category = "";
		price = 0;
		UPC = (int)(Math.random()*10000000);
    }

    public InventoryItem(String n, String m)
    {   
        name = n;
		manufacturer = m;
        category = "";
		price = 0;
		UPC = (int)(Math.random()*10000000);
    }
    
    public InventoryItem(String n, String m, String c, double p)
    {   
        name = n;
		manufacturer = m;
        category = c;
		price = p;
		UPC = (int)(Math.random()*10000000);
    }
	
	  public String getName()
    {
        return name;
    }
    
    public String getManu()
    {
        return manufacturer;
    }
    
    public String getCategory()
    {
        return category;
    }
    
    public double getUPC()
    {
        return UPC;
    }
	
	public double getPrice()
    {
        return price;
    }
    
    public String toString()
    {
        return "Item name: " + name+ 
               "\nManufacturer: " + manufacturer+
               "\nUPC: " + UPC+
               "\nCategory: " + category+
			   "\nPrice: " + price;
    }
    
    
    
}


