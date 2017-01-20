import java.lang.Math.*;
public class Distance
{
	private int xOne, yOne, xTwo, yTwo;
	private double distance;
	
	public Distance()
	{
		xOne = 0;
		yOne = 0;
		xTwo = 0; 
		yTwo = 0;
		distance = 0;
	}
	
	public Distance(int xOne, int yOne, int xTwo, int yTwo)
	{
		xOne = xOne;
		yOne = yOne;
		xTwo = xTwo; 
		yTwo = yTwo;
		distance = 0;
	}
	
	public void setValues(int xOne, int yOne, int xTwo, int yTwo)
	{
		xOne = xOne;
		yOne = yOne;
		xTwo = xTwo; 
		yTwo = yTwo;
		distance = 0;
	}
	
	public double getDist()
	{
		distance = Math.sqrt((xTwo-xOne) * (xTwo - xOne) + (yTwo - yOne) * (yTwo - yOne));
		return distance; 
	}
	
}