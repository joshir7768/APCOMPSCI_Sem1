public abstract class GameSystems
{
	//instance variables
	private String platform;
	private int serialNo;
	
	//constructors
	public GameSystems()
	{
		this.platform = "";
		this.serialNo = 0;
	}
	
	//constructors with params
	public GameSystems(String p)
	{
		this.platform = p;
		this.serialNo = (int)(Math.random()*7)+1;
	}
	
	//Accessors
	public String getPlatform()
	{
		return platform;
	}
	
	public int getSerialNo()
	{
		return serialNo;
	}
}