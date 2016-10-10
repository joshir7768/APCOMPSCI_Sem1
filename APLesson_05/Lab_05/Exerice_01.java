import java.util.Random;

public class Lab_05
{
	static int player;
	static int computer; 
	static String winner;
	
	public static void main(String[]args)
    {
		Random rand = new Random();
		player = rand.nextInt(7)+1;
		computer = rand.nextInt(7)+1;

		diceRoll();
		
		System.out.println("You rolled a " + player );
		System.out.println("Computer rolled a " + computer );
		System.out.println("And the winner is " + winner );

	}
	
	
	public static void diceRoll()
	{
		if (player > computer) 
		     winner = "player";
	    if (computer > player ) 
		     winner = "computer";
	}
	
}   