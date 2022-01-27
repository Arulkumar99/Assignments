package concat;

public class ReverseString {

	public static void main(String[] args) {
	String s1="Beautiful";
	int size=s1.length();
	System.out.println("The String is:"+s1+"");
	System.out.println("String length is:"+size+"");
	for(int i=0;i<size;i++)
	{
	System.out.println(s1.charAt(s1.length()-i-1));
	}

	}

}
