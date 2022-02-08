import java.util.ArrayList;
public class Convert
{
public static void main(String[] args)
 {
ArrayList<String> cars=new ArrayList<String>(); //creating array list
cars.add("Audi");
cars.add("Tata");
cars.add("Benz");
cars.add("Bmw");
System.out.println(cars);
String[] bike=cars.toArray(new String[0]); //convert to Array
for(String s:bike)
{
	System.out.println(s);
}
}
}