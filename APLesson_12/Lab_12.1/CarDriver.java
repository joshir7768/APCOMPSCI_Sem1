import java.util.Scanner;
public class CarDriver
{
    public static void main(String[]args)
    {        
        Scanner kb = new Scanner(System.in);
        System.out.println("Type in the car's color");
        String paint = kb.nextLine();
        System.out.println("Type in the car's interior");
        String interior = kb.nextLine();
        System.out.println("Type in the car's engine");
        String engine = kb.nextLine();
        System.out.println("Type in the car's tires");
        String tires = kb.nextLine();
        
        CarClass object = new CarClass(paint, interior, engine, tires);
        System.out.println(object);
        
        object.setCustom("red", "tan leather", "V8", "sport");
        System.out.println(object);
    }        
}   
