import java.util.Scanner;
public class FindTheZs
{
	static String [] words;
	public static void main(String[]args)
	{
		words= new String[5];
		fillArray();
		System.out.print("For the words...");
		printArray(words);
		System.out.println("Only " + hasZ(words)+ " contains the letter z.");
	}

	public static void fillArray()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter 5 words... ");
		for (int i = 0; i < words.length; i++)
		{
			words[i]= kb.next();

		}
	}
	
	public static void printArray(String[] words)
	{
		for(String word : words)
		{
			System.out.println(word);
		}
	}
	
	public static String hasZ(String[] words)
	{
		String zs = "";
		for(String word : words)
		{
			if (word.indexOf("z") >= 0)
			{
				zs += word + " ";
			}
	
		}
		return zs;
	}
}