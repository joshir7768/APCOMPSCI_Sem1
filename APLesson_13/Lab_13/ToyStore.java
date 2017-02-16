import java.util.ArrayList;
import java.util.Arrays;

public class ToyStore
{
	
	private ArrayList<Toy> toyList;
	
	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}
	public ToyStore(String toys)
	{
		loadToys(toys);
	}
	
	public void loadToys(String ts)
	{
		toyList = new ArrayList<Toy>();
		ArrayList<String> toys = new ArrayList<String>(Arrays.asList(ts.split(", ")));
		for(int i = 0; i < toys.size(); i+=2)
		{
			String name = toys.get(i);
			String type = toys.get(i+1);
			
			Toy a = getThatToy(name);
			
			if(a == null) 
			{
				if(type.equals("AF")){
					toyList.add(new AFigure(name));
				}
				if (type.equals("Car")){
					toyList.add(new Car(name));
				}
				
			}
			else
				a.setCount(a.getCount()+1);
			
		}
	}
	
	public Toy getThatToy(String nm)
	{
		for(Toy b: toyList)
		{
			if(b.getName().equals(nm))
				return b;
		}
		return null;
	}

	public String getMostFrequentToy()
	{
		String name = "";
		int max = Integer.MIN_VALUE;
		for(Toy b : toyList)
		{
			if(max == b.getCount())
				name = "Equal counts of both " + name + " and " + b.getName();
			if(max < b.getCount())
			{
				max = b.getCount();
				name = b.getName();
			}
		}
		return name;
		
	}
	public String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		for (Toy a: toyList)
		{
			if(a.getType().equals("Car"))
				cars++;
			if(a.getType().equals("Action Figure"))
				figures++;
		}
		if(cars > figures)
			return "Cars";
		else if (figures > cars)
			return "Action Figure";
		else
			return "Equals amounts of action figures and cars!";
		
	}

	public String toString()
	{
		return toyList.toString();
	}

	

	

}