import java.util.Scanner; //import Statement

public class calculator
{
	public static void main(String[]args)
	{
		//instantiate the new scanner object "keyboard"
        Scanner keyboard = new Scanner(System.in);
        
        //prompt for user input
		System.out.println("What is the first number? ");
		
		String firstnumber = keyboard.next();
		
		Double first = Double.valueOf(firstnumber);
		
		//prommpt for user input 
		System.out.println("What is the symbol of operation? ");
		
		String ope1 = keyboard.next();
		
		//prompt for user input 
		System.out.println("What is the next number? ");
		
		String secondnumber = keyboard.next();
		
		Double second = Double.valueOf(secondnumber);
		
		Double ans = 0.0; 
		
		if(ope1.equals("+")) {ans = first + second;}
		if(ope1.equals("-")) {ans = first - second;}
		if(ope1.equals("*")) {ans = first * second;}
		if(ope1.equals("/")) {ans = first / second;}
		
		System.out.println("The answer is " + ans);
		
	}
}