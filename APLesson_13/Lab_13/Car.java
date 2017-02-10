public class Car extends Toy
{
	private String Car;
	
	public Car()
	{
		super();
		this.Car = "";
	}
	
	public Car(String n, String car)
	{
		super(n);
		this.Car = car;	
	}
	
	public String getType()
	{
		return "Car";
	}
	
	public String toString()
	{
		return "Car: " + Car  + "\n" +
				super.toString();
	}
}