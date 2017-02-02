public class Coin extends Money
{
	private double weight;
	
	public Coin()
	{
		super();
		this.weight = 0;
	}
	
	public Coin(String n, double w, double v)
	{
		name = n;
		weight = w;
		value = v;
	}
	
	public String toString()
	{
		return "Weight: " + weight + "g\n" +
				"Your" + name + "is worth $" + value + ".\n";
	}
}