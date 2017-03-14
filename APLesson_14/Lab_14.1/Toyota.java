public class Toyota extends TheCar
{
	private double[] location;
	private double x;
	private double y;
	
	public Toyota()
	{
		location = new double[2];
	}
	
	public Toyota(String car)
	{
		location = new double[2];
		location[0] = Double.parseDouble(car.substring(0,1));
		location[1] = Double.parseDouble(car.substring(3));
	}
	
	public int getID()
	{
		return (int) (Math.random() * 1000000) + 1;
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