    import java.util.*;
	import java.util.Iterator;
	 class Map1 
	{
	public static void main(String[] args)
	{
	Map<Integer,String> m=new HashMap<Integer,String>();
	m.put(02,"karthi");
	m.put(01,"sugan");
	m.put(04,"vijiyan");
	m.put(03,"Tharun");
	Set<Map.Entry<Integer,String>>set=m.entrySet();
	Iterator<Map.Entry<Integer,String>> itr=set.iterator();
	while(itr.hasNext())
	{
	Map.Entry<Integer,String> e=itr.next();
	System.out.println(e.getKey()+"  "+e.getValue());
	}
	}
	}


