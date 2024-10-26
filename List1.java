package pack1;

import java.util.ArrayList;

public class List1 
{

	public static void main(String[] args) 
	{
	    ArrayList<String> cars = new ArrayList<String>();
	    cars.add("BMW");
	    cars.add("Volvo");
	    cars.add("Audi");
	    cars.add("Benz");
	    cars.add("Lexsus");
	    cars.add("Honda");
	    cars.set(0, "Swift");
	    //cars.clear();
	    for (String i : cars) 
	    {
	      System.out.println(i);
	    }
	}
	

}
