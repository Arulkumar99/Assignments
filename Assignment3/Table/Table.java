import java.util.*;
class Table
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any Number:");
	int n=sc.nextInt();
int i,c;
for(i=1;i<=10;i++)
{
c=i*n;	
System.out.println(i+"*"+n+"="+c);
}
}
}