package tree;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class Flower
{
public static void main (String[] args)
{
HashSet<String> m=new HashSet<String>(); //creating Hasset
	m.add("Audi");
	m.add("Tata");
	m.add("Benz");
	m.add("Bmw");
	System.out.println(m);
	Set<String> tset=new TreeSet<String>(m);
	System.out.println(tset);  
}
}

