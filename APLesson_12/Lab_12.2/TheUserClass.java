public class TheUserClass
{
   private String firstName;
   private String lastName;
   private String avatar;
   private int userID;
   
 
   
   public TheUserClass()
	{
		firstName = "";
		lastName = "";
		avatar = "";
		userID = 0;
 
	}
	
	public TheUserClass(String fN, String lN)
	{
		firstName = fN;
		lastName = lN;
		avatar = "Undefined";
		userID = (int)(Math.random() * 1000000) + 1;
 
	}
	
	
	
	public TheUserClass(String fN, String lN, String av)
	{
		firstName = fN;
		lastName = lN;
		avatar = av;
		userID = (int)(Math.random() * 1000000) + 1;
	}
	
	public String getfirstName()
	{
		return firstName;
	}
	
	public String getlastName()
	{
		return lastName;
	}
	
	public String getavatar()
	{
		return avatar;
	}
	public int getuserID()
	{
		return userID;
	}
	
	
	public String toString()
	{
		return "Customer Info...\nFirst Name: " + firstName +
                           "\nLast Name: " + lastName +
							"\nAvatar: " + avatar +
                           "\nUser ID#: " + userID;
	}
	
	
}