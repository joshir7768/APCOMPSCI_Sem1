import java.util.Scanner;

public class choices 
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Would you like to..." + 
		                    "\n 1. Do a Math Priblem" + 
							"\n 2. Answer a question");
		int mathOrWords = kb.nextInt();
		if(mathOrWords == 1)
		{
			System.out.println("Wat is 2 * 2? ");
			int mathAnswer = kbnextInt();
			if(mathAnswer == 4)
			{
				System.out.println("Correct");
			}
			else 
			{
				System.out.println("No! Wrong! You lose!");
			}
			
		    else
		{
			System.out.println("Who said th phrase \"Whatever you are, be a good one.\"?");
			kb.nextLine();
			String wordAnswer = kb.nextLine();
			if wordAnswer.equals("Abraham Lincoln")
			{
				System.out.println("Correct!");
			}
			else
			{
				System.out.println("No! Wrong! YOu lose!");
			}
				
		}
	}
}
