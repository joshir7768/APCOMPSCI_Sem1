import java.util.Scanner;
public class Reverseword
{	
	static String[] words;
	public static void main(String[]args)
	{
		String [] words = new String[5];
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter 5 words: ");
		
		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
		
		System.out.println("In order... ");
		for (String word : words)
		{
			System.out.println("\"" + word + "\" " );
		}
		System.out.println("In reverse...");
		Reverse(words);
	}
	public static void Reverse(String [] words)
	{
		for(int i = words.length-1; i >= 0; i--)
		{
			System.out.println(words[i]);
		}
		
	}
}