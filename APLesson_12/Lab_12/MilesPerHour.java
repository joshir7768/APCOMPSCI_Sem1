import java.lang.Math.*;
public class MilesPerHour
{
	//instance variables
	private int distance, hours, minutes;
	private double mph;
	
	//defalut values for instance vars
	public MilesPerHour()
	{
		distance = 0;
		hours = 0;
		minutes = 0; 
		mph = 0;
	}
	
	//Constrctor with params
	public MilesPerHour(int d, int h, int m )
	{
		distance = d;
		hours = h;
		minutes = m; 
		mph = 0;
	}
	
	//Modifiers
	public void setValues(int d, int h, int m )
	{
		distance = d;
		hours = h;
		minutes = m; 
		mph = 0;
		
	}
	
	//Accessors
	public int getDist()
	{
		return distance;
	}
	
	public int getHours()
	{
		return hours;
	}
	
	public int getMins()
	{
		return minutes;
	}
	
	public double getMPH()
	{
		mph =  Math.round(distance / (hours + minutes / 60.0));
		return mph;
	}
	
	
}