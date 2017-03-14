public class Honda extends TheCar
{
	public Honda(double[] coords)
	{
		location = coords;
	}
	public int getID() 
	{
		return ID;
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