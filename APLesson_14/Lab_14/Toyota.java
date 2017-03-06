public class Toyota
{
	private double[] location;
	public Toyota()
	{
		location = new double[2];
	}
	public Toyota(double x, double y)
	{
		location = new double[2];
		location[0] = x;
		location[1]= y;
	}
	public int getID() 
	{
		return (int)(Math.random()*6)+1;
	}
	public void move(double x, double y)
	{
		location[0] += x;
		location[1] += y;
	}
	public double[] getLoc()
	{
		return location;
	}
	
}