import java.util.Scanner; //import Statement

public class RudeAI
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		System.out.println("What is your name? ");
		
		String teacher = keyboard.next();
		
		System.out.println(teacher + " is a cool name but are you a boy or a girl?");
		
		//prompt for user input
		System.out.println("How old are you?");
		
		String tacher = keyboard.next();
		
		System.out.println("Wow! You are really old!," + teacher);
		
		//prompt for user input
		System.out.println("What do you do for fun?");
		
		String techer = keyboard.next();
		
		System.out.println("I thought only nerds like to " + techer );
		
		//prompt for user input
		System.out.println("What kind of music do you like?");
		
		String tcher = keyboard.next();
		
		System.out.println("...Not to be rude " + teacher + " but " + tcher + " is terrible");
		
		//prompt for user input
		System.out.println("How many siblings do you have?");
		
		String ttcher = keyboard.next();
		
		System.out.println(ttcher + " Really? I hope the rest of the family is better looking.");
		
		//prompt for user input
		System.out.println("what do you want to be when you grow up?");
		
		String teaacher = keyboard.next();
		
		System.out.println("Well, with the information you have provided, I can gaurantee that you will never be a " + teaacher);
		System.out.println("Good luck!");
	}
}