class Breakint
{
public static void main(String args[])
{
int a=3425;
//int d1=a/100000%10;
//int d2=a/10000%10;
int d3=a/1000%10;
int d4=a/100%10;
int d5=a/10%10;
int d6=a%10;
System.out.println("Entered Number is:"+a);
System.out.println(d3+","+d4+","+d5+","+d6);
}
}