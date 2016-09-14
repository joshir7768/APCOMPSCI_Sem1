import java.util.Scanner; //import Statement

public class BMIcalculator 
{
    public static void main(String[]args)
    {
        //instantiate the new scanner object "keyboard"
        Scanner keyboard = new Scanner(System.in);
        
        //prompt for user input
        System.out.println("What is your height in inches? ");
        
        double h = keyboard.nextDouble();
        
        //prompt for user input
        System.out.print("What is your weight in pounds? ");
        
        double w = keyboard.nextDouble() ;

        
        double bmi = ((w * 703) / (h * h));
        
        // System.out.println("BMI Is"  + 703 * weight / (height * height) );
        
        System.out.println("Your BMI is " + bmi );
    }
}

