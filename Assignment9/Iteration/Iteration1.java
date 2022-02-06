import java.util.ArrayList;
import java.util.Iterator;
public class Iteration1
	{
		public static void main(String[] args)
		{
		ArrayList<String> list=new ArrayList<String>();
		list.add("karna");
		list.add("bala");
		list.add("Thirumani");
		list.add("Krishna");
		Iterator<String> it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		}
	}

	


