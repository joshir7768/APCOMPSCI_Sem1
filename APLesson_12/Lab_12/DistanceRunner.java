import java.util.Scanner;
public class DistanceRunner
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("x1");
		int x1 = kb.nextInt();
		
		System.out.println("y1");
		int y1 = kb.nextInt();
		
		System.out.println("x2");
		int x2 = kb.nextInt();
		
		System.out.println("y2");
		int y2 = kb.nextInt();
		
		//using the constructor...
		Distance object = new Distance(x1, y1, x2, y2);
		System.out.println("distance = " + object.getDist());
		//using the modifier once the object is created...
		object.setValues(500, 23, 450, 180);
		System.out.println("distance = " + object.getDist());
		
	}
}