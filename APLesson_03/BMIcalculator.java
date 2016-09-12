import java.util.Scanner; //import Statement

public class BMIcalculator 
{
    public static void main(String[]args)
    {
        //instantiate the new scanner object "keyboard"
        Scanner keyboard = new Scanner(System.in);
        
        //prompt for user input
        System.out.println("What is your height in meters? ");
        
        String height = keyboard.next();
        
        //prompt for user input
        System.out.print("What is your weight in kilograms? ");
        
        String weight = keyboard.next();
        
        Double  w = Double.valueOf(weight);

        System.out.println("Your weight is " + w);
        
        Double  h = Double.valueOf(height);

        System.out.println("Your height is " + h);
        
        Double bmi = (w / (h * h));
        
        // System.out.println("BMI Is"  + weight / (height * height) );
        
        System.out.format("Your BMI is " + bmi );
    }
}

