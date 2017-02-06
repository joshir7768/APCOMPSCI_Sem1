public class Bill
{
	private String name;
	private String face;
	private double value;
	
	public Bill()
	{
		name = "";
		face = "";
		value = 0;
		
	}
	
	public Bill(String n, String f,double v)
	{
		name = n; 
		face = f;
		value = v;
		
	}
	
	public String toString()
	{
		return "Face: " + face  + "\n" +
				"Your" + name + "is worth $" + value + ".\n";
	}
}