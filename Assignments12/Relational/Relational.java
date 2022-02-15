package c;

import java.util.Scanner;

public class Relational
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the first number");
	int a=s.nextInt();
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the first number");
	int b=s1.nextInt();
	if(a>b) {
		System.out.println("a is greater");
		}
	else
	{
		System.out.println(" b is greater");
	}
}
}
