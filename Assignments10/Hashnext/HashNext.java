    import java.util.ArrayList;
	import java.util.Iterator;
	public class HashNext
	{
   public static void main(String[] args)
	 {
	ArrayList<String> cars=new ArrayList<String>(); //creating array list
	cars.add("Audi");
	cars.add("Tata");
	cars.add("Benz");
	cars.add("Bmw");
	Iterator<String> itr=cars.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	}
	}


