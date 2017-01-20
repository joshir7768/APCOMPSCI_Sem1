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
	
	public static void main(String[]args)
	{
		UserNames object = new UserNames("proHndsm", "Professor", "Handsome");
		
		System.out.println("<<<<<<<<<<<<<<<<<< USER INFO >>>>>>>>>>>>>>>>>>>>");
		System.out.println("Name: " + object.getfirstName() + " " + object.getlastName());
		System.out.println("User Name: " + object.getUserName());
		
		UserNames object1 = new UserNames();
		
		System.out.println("<<<<<<<<<<<<<<<<<< USER INFO >>>>>>>>>>>>>>>>>>>>");
		System.out.println("Name: " + object1.getfirstName() + " " + object1.getlastName());
		System.out.println("User Name: " + object1.getUserName());
		
		object.setUserName("pHandsome");
		System.out.println("<<<<<<<<<<<<<<<<<< USER INFO >>>>>>>>>>>>>>>>>>>>");
		System.out.println("Name: " + object.getfirstName() + " " + object.getlastName());
		System.out.println("User Name: " + object.getUserName());
	}
}