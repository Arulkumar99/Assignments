class Compare
{
public static void main(String args[])
{
int a=65;
int b=56,c=63;
System.out.println(a>b?a:b);
System.out.println(a>b&&a>c);//true and true=true
System.out.println(a>b&&a<c);//true and false=true
System.out.println(a>b||a<c);
}
}