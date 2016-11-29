import java.util.Scanner;
public class Firstletter
{
	public static void main(String[]args)
	{
		String[] letters = new String[5];
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter 5 ltters: ");
		
		for(int i = 0; i < letters.length; i++)
		{
			letters[i] = kb.next();
		}
		
		System.out.println(First(letters));
	}
	public static String First(String[] words)
	{
		String firstletters = "";
		for (String word : words)
		{
			firstletters += word.substring(0,1) + " ";
		}
		
		return firstletters;
	}
}