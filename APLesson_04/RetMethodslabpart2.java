import java.util.Scanner; //import Statement

public class RetMethodslabpart2
{
	public static void main(String[]args)
	{
		//new RetMethodslabpart2
		RetMethodslabpart2 subwoofer = new RetMethodslabpart2();
		//instantiate the new Scanner object "volume"
		Scanner volume = new Scanner(System.in);
		
		//prompt for user input
		System.out.println("What is the height in inches");
		double h = volume.nextDouble();

		System.out.println("What is the length in inches");
		double l = volume.nextDouble();
		
		System.out.println("What is the width in inches");
		double w = volume.nextDouble();
		
		Double box = subwoofer.volume(h, l, w);
		System.out.printf("The volume of your cube is %10.2f\n ", box);
	}
	
	public double volume(double h, double l, double w)
	{
		return(h * l * w)/ 1728.0;
	}
}