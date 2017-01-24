import java.util.Scanner;
public class CarDriver
{
	public static void main(String[]args)
		{
			UserNames object = new UserNames("paint", "interior", "engine", "tires");
		
			System.out.println("Type in the car's color");
			String paint = kb.next();
			//keep on asking questions about the interior, engine and tires
			//keep the usernames object1 = new..
			//keep name: + object...
			
			UserNames object1 = new UserNames();
			System.out.println("Name: " + object1.getPaint());
		
		
		
		
		
		
			System.out.println("<<<<<<<<<<<<<<<<<< USER INFO >>>>>>>>>>>>>>>>>>>>");
			System.out.println("Name: " + object1.getfirstName() + " " + object1.getlastName());
		
			object.setUserName("pHandsome");
			System.out.println("<<<<<<<<<<<<<<<<<< USER INFO >>>>>>>>>>>>>>>>>>>>");
			System.out.println("Name: " + object.getfirstName() + " " + object.getlastName());
			System.out.println("User Name: " + object.getUserName());
		}	
}