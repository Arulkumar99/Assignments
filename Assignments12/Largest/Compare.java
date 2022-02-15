import java.util.Arrays;
public class Compare 
{
	void show()
	{
  int[] cat={78,45,23,121,90};
  int max=Arrays.stream(cat).max().getAsInt();
  System.out.println("largest in given array:"+max);
	}
public static void main(String[] args)
{
	Compare c=new Compare();
	c.show();
	
}
}