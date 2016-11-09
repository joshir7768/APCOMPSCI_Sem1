import java.util.Scanner;
public class Underscores
{
	static String sentence;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a sentence: ");
		sentence = kb.nextLine();
		System.out.println(under(sentence));
	}
	public static String under(String sent)
	{
		while(sent.indexOf(" ") >= 0)
		{
			return under(sent.substring(0, sent.indexOf(" ")) +"_"+ sent.substring(sent.indexOf(" ") +1));
		}
		return sent;
	}
}