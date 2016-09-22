public class RetMethodslab
{
	public static void main(String[]args)
	{
		RetMethodslab loan = new RetMethodslab();
		int P = 30000;
		int n = 4;
		double r = 0.4;
		int t = 2; 
		double ln = loan.monthpayment(P, n, r, t);
		double math = Math.pow(n, t); 
		System.out.printf("Your total monthly payment is %10.2f\n", ln);
	}
	
	public double monthpayment(int P, int n, double r, int t)
	{
		return (P*Math.pow(1 + r / n, n * t ) );
	}
}