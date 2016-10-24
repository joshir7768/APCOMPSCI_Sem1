import java.util.Scanner;

public class PasswordProgram 
{
	static String username = "rachanaj";
	static String password = "Password";
	static Scanner kb;
	
	public static void main (String[]args)
	{
		kb = new Scanner(System.in);
		passCheck();		
		
	}
	public static void passCheck()
	{
		
		System.out.println("Username: ");
		String user = kb.next();
		System.out.println("Password: ");
		String pass = kb.next();
		
		if (user.equals (username) && pass.equals (password))
		{
			System.out.println("You are granted access");
		}
		else
		{
			if (user.equals(username))
				System.out.println("Your password is incorrect!");
			
			else if (user.equals(password))
				System.out.println("You username is incorret!");
				
			else
				System.out.println("Username and password are both incorrect!");
		}
		
	
		
	}
} 