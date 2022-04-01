package average;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		
		int[] arr=new int[] {15,25,18,14};
		 int sum=0;
		 int ave,n=4;
		 for(int i=0;i<arr.length;i++)
			
		 {
			 sum=sum+arr[i];
		 }
		                ave=sum/n;
				  System.out.println("Average of the age array :" +ave);
		
}
}
