import java.util.Scanner;
public class HumanDriver
{
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the hair color");
		String hair = kb.next();
		System.out.println("Please enter the eye color");
		String eyes = kb.next();
		System.out.println("Please enter the skin color");
		String skin = kb.next();
		
		HumanClass object = new HumanClass( hair, eyes, skin);
		
		System.out.println("My info :");
		System.out.println("Hair :" + object.getHair());
		System.out.println("Eyes:" + object.getEyes());
		System.out.println("Skin:" + object.getSkin());
		
		
		System.out.println("");
		
		
		object.setHES("black", "brown", "brown");
		
		System.out.println("Friend info :");
		System.out.println("Hair :" + object.getHair());
		System.out.println("Eyes:" + object.getEyes());
		System.out.println("Skin:" + object.getSkin());
		
		
	}
	
}