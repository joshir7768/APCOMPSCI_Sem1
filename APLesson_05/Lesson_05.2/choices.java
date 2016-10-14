import java.util.Scanner;
public class choices
{
	public  static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Would you like to ..." +
		                    "\n 1. Do a Math Problem" + 
							"\n 2. Answer a question");
		int mathOrWords = kb.nextInt();
		if(mathOrWords == 1)
		{
			System.out.println("What is 2 * 2?");
			int mathAnswer = kb.nextInt();
			if (mathAnswer == 4)
		}
	}
}