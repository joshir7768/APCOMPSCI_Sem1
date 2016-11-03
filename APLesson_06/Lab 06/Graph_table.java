import java.util.Scanner;
public class Graph_table
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter an integer. ");
		int integer = kb.nextInt();
		System.out.println("Enter the size of the table. ");
		int table = kb.nextInt();
		
		for(int i = 1; i <= table; i++ )
		{
			System.out.printf(i + "|" + i * integer + "\n");
		}
	}
}