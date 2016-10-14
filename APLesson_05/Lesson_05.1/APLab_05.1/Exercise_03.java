import java.util.Scanner;
public class Exercise_03
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your letter grade for math? ");
		String math = kb.next();
		System.out.println("What is your letter grade for science? ");
		String science = kb.next();
		System.out.println("what is your letter grade for History? ");
		String History = kb.next();
		System.out.println("what is your letter grade for P.E? ");
		String PE = kb.next();
		System.out.println("What is your letter grade for English? ");
		String English = kb.next();
		System.out.println("what is your letter grade for Computer Science? ");
		String ComputerScience = kb.next();
		System.out.println("What is your letter grade for Economics? ");
		String Economics = kb.next();
		
		double gPoints = calcPoints(science) + calcPoints(math) + calcPoints(History) + calcPoints(PE) + calcPoints(English) + calcPoints(ComputerScience) + calcPoints(Economics);
		double gpa = gPoints/7;
		System.out.println("Your GPA is " + gpa);
		
	}
	
	public static double calcPoints(String grade)
	{
		double gradePoints = 0;
		if (grade.equals("A"))
			gradePoints =  4.0;
		if (grade.equals("B"))
			gradePoints = 3.0;
		if (grade.equals("C"))
			gradePoints = 2.0;
		if (grade.equals("D"))
			gradePoints = 1.0;
		if (grade.equals("F"))
			gradePoints = 0.0;
		
		return gradePoints;
	   
	   
	}
}