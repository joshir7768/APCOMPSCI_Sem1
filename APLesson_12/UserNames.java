public class UserNames
{
	//instance variables
	private String userName, firstName, lastName;
	
	//Default Constructor
	public UserNames()
	{
		//defalut values for instance vars
		userName = "";
		firstName = "";
		lastName = "";
	}
	
	//Constrctor with params
	public UserNames(String uName, String fName, String lName)
	{
		userName = uName; 
		firstName = fName;
		lastName = lName;
	}
	
	//Modifiers
	public void setUserName(String uName)
	{
		userName = uName;
	}
	
	//Accessors
	public String getUserName()
	{
		return userName;
	}
	
	public String getfirstName()
	{
		return firstName;
	}
	
	public String getlastName()
	{
		return lastName;
	}
	
	
}