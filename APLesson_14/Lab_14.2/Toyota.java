public class Toyota extends TheCar
{
	public Toyota(String car)
	{
		location = new double[2];
		String[] coords = car.split(", ");
		location[0] = Double.parseDouble(coords[0]);
		location[1] = Double.parseDouble(coords[1]);
	}	
}