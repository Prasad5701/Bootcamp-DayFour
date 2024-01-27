package com.DayFour;
import java.util.*;
public class FibonacciSeries {
	static int a = 0;
	static int b = 1;
	
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Size : ");
		int size = sc.nextInt();
		fibonacci(size);
	}
	
	
	public static void fibonacci(int size) {
		
		int arr[]=new int[size];
		int i;
		arr[0]=a;
		arr[1]=b;
		for(i=2;i<size;i++)
		{
			int op = a+b;		
			arr[i] = op;
			
			a=b;
			b=op;
			
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
