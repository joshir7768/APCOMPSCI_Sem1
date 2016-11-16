import java.util.Scanner;
public class Reverseword
{
	static String word1;
	static String word2;
	static String word3;
	static String word4;
	static String word5;
	static String stuff;
	
	public static void main(String[]args)
	{
		String[] words = new String[5];
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter first word: ");
		word1 = kb.nextInt();
		System.out.println("Enter second word: ");
		word2 = kb.nextInt();
		System.out.println("Enter third word: ");
		word3 = kb.nextInt();
		System.out.println("Enter fourth word: ");
		word4 = kb.nextInt();
		System.out.println("Enter fifth word: ");
		word5 = kb.nextInt();
		Reverse();
		System.out.println("In order... " + stuff );
		
		for(int i = 0; i < words.length; i++)
		{
			words [i] = kb.next();
		}
		
		for (String word : words)
		{
			System.out.println("\"" + word + "\" " );
		}
	}
	public static void Reverse()
	{
		
	}
}