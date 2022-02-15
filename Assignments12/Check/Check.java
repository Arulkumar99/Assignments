import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Check 
{
	public static void main(String[] args) throws Exception
	{
  char a;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	a=(char) br.read();
	if(a>65 && a<90)
	{
		System.out.println("The input is uppercase");
		
	}
	else if(a>=97 && a<=122)
	{
		System.out.println("The input is lowercase");
	}
	else if(a>=48 && a<=57)
	{
		System.out.println("The input is digit");
	}
	else
	{
		System.out.println("the given input is Symbol");
	}
}
}
