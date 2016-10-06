import java.util.Random;
public class Lab_05
{
	public static void main(String[]args)
    {
		Random rand = new Random();
		int player = rand.nextInt(6)+1;
		System.out.println("The player rolled a .... " + player );
		int computer = rand.nextInt(6)+1;
		System.out.println("The computer rolled a .... " + computer);
	}
}   