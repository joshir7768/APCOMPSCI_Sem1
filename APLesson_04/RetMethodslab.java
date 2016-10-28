import java.util.Scanner;
public class RetMethodslab
{
	public static void main(String[]args)
	{
		RetMethodslab loan = new RetMethodslab();
		Scanner kb = new Scanner(System.in);
	
	    System.out.println("Please enter the principal. ");
		double P = kb.nextDouble(); 
		
	    System.out.println("Please enter the number of times the loan is compounded per year.  ");
		double n  = kb.nextDouble(); 
		
		System.out.println("Please enter the rate.  ");
		double r = kb.nextDouble(); 
		
		System.out.println("Please enter the life of the loan in a year.  ");
		double t = kb.nextDouble();
	
		
		double pay = loan.monthpayment(P,n,r,t);
		double math = Math.pow(n,t);
		System.out.printf("The total monthly payment is %10.2f\n", pay );
		
	}
	
	public double monthpayment(double P, double n, double r, double t)
	{
		return (P*Math.pow(1 + r / n, n * t ) / (12 * t) );
	}
}


