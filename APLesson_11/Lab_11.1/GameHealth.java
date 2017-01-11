import java.util.Scanner;
public class GameHealth
{
	static String[] health;
	static int HEALTHLOAD = 6;
	static int healthCount;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String turn = "";
		int damage = 0; //controls of damage is + or -
		int amount = 0; //controls the amount of damage 
		healthCount = 6; 
		health = new String[HEALTHLOAD];
		
		while(!turn.equals("Q") && healthCount > 0)
		{
			System.out.println("Your turn! Hit Enter when ready:");
			String prompt = kb.next();
			turn = prompt;
			damage = (int)(Math.random()*2)+1;
			amount = (int)(Math.random()*6)+1;
			System.out.print(takeDamage(damage, amount));
			printClip();
			
		}
		System.out.println("You died!!! ");
		
	}
	
	public static void takeDamege(int damage, int amount)
	{
		if (damage == 1)
		{
			amount -= healthCount;
			
			return"Taking " + amount + " damage!";
		}
		
		else
		{
			if (healthCount + amount < HEALTHLOAD)
			{
				amount += healthCount;
			}
			else
			{
				healthCount = HEALTHLOAD;
			}
			return "Power Up " + amount + " !";
		}
	}
	
	
	public static void printClip()
	{
		String output = "Health:" + "/t";
		for(int i = 0; i < HEALTHLOAD ; i++)
		{
			if(i < healthCount)
			{
				health[i] = "@";
			}
			else
			{
				health[i] = "[]";
				health[i] += output;
			}
			System.out.println(output);
		}
	}
}