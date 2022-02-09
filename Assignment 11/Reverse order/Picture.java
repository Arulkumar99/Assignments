import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class Picture
{
public static void main(String[] args)
	{
	ArrayList<String> cars=new ArrayList<String>();
	cars.add("Audi");
	cars.add("ferari");
	cars.add("benz");
	cars.add("jaguar");
	System.out.println(cars);
	Collections.sort(cars);
	System.out.println(cars);
	Collections.reverse(cars);
	System.out.println(cars);
	}
}

