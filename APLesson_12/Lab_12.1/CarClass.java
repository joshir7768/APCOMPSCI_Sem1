public class CarClass
{
	private String p, i, e, t;
	
	public CarClass()
	{
		p = ""; 
		i = "";
		e = "";
		t = "";
	}
	
		public CarClass( String paint, String interior, String engine, String tires)
	{	
		p = paint; 
		i = interior;
		e = engine;
		t = tires;
	}
	
	public void setCustom( String paint, String interior, String engine, String tires)
	{	
		p = paint; 
		i = interior;
		e = engine;
		t = tires;
	}
	
	public String getPaint()
	{
		return p;
	}
	
	public String getInterior()
	{
		return i;
	}
	
	public String getEngine()
	{
		return e;
	}
	
	public String getTires()
	{
		return t;
	}
	
	
	
	
}