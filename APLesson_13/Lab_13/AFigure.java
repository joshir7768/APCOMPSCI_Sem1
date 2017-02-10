public class AFigure extends Toy
{
	private String AFigure;
	
	public AFigure()
	{
		super();
		this.AFigure = "";
	}
	
	public AFigure(String n, String af)
	{
		super(n);
		this.AFigure = af;	
	}
	
	public String getType()
	{
		return "Action Figure";
	}
	
	public String toString()
	{
		return "Action Figure: " + AFigure  + "\n" +
				super.toString();
	}
}