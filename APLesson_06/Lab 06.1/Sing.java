import java.util.Scanner;
public class Sing
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		sing("Na", 4);
		sing("Na", 4);
		sing("Hey", 3);
		sing("Googbye!",0 );
		
	}
	public static void sing(String word, int number)
	{
		for(int i = 0; i <= number; i++)
		{
			System.out.print(word + " ");
		}
		System.out.println();
	}
	
}