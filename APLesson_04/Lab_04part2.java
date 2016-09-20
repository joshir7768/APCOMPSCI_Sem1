import java.util.Scanner;
public class Lab_04part2
{
	public static void main(String[]args)
	{
		//new Lab_04part2 object 
	
		//new Scanner object
		Scanner kb = new Scanner(System.in);
		
		//6 sets of variables - 1 for each item
		System.out.println("Enter your first name: ");
		String firstname = kb.next();
		
		System.out.println("Enter your last name: ");
		String lastname = kb.next();
		
		System.out.println("Enter your title: ");
		String title = kb.next();
		kb.nextLine();
		
		System.out.println("Enter the school site: ");
		String site = kb.nextLine();
		
		System.out.println("Enter the school year: ");
		String year = kb.next();

        System.out.println("What is your subject?");
        String subject = kb.next();

		
		Lab_04part2 form = new Lab_04part2();
		
        System.out.println("********************************************");
		//do this for all 6 items
		form.format(site, year);
		form.format(firstname, lastname);
		form.format(title, subject);
		
		System.out.println("********************************************");
	}
	public void format(String item, String output)
	{
		System.out.printf("%20s   %10s*\n*" , item, output);
	}
}