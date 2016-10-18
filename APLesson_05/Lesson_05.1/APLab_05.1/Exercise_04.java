import java.util.Scanner;
public class Exercise_04
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your height? ");
		double height = kb.nextDouble();
		System.out.println("What is your weight? ");
		double weight = kb.nextDouble();
		
		double part1 = (height / height); 
		double BMI = (weight * 703) * part1;
        String category = (calcBMI(BMI));
		System.out.println("Your BMI is " + BMI);
		System.out.println("You are " + category );
		
	
	}
	
	public static String calcBMI(double BMI)
	{
	
		if(BMI < 18.5)
			return  "Underweight";
		else if (BMI < 25)
			return "Normal";
		else if (BMI < 30)
			return "Overweight";
		else if (BMI < 35)
			return "Obese";
		else if (BMI < 40)
			return "Very Obese";
		else if (BMI > 40)
			return "Morbidly Obese";
		
		return "";
	}
	
	
}