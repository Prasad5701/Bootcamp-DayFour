package com.DayFour;
import java.util.*;
public class Calculator {
	int numOne=10,numTwo=5;
	static int a=10, b=30;
	public static void main(String []args)
	{
		addition();
		substraction(a,b);
		int res = multiplication(a,b);
		System.out.println("Result of Multipliation : "+res);
		Calculator obj = new Calculator();
		int data = obj.division();
		System.out.println("Result of Division : "+data);
			
		
	}
	
	private int division()
	{
		return numOne/numTwo;
	}
	private static int multiplication(int p,int q)
	{
		return p/q;
	}
	private static void substraction(int x,int y)
	{
		int r = x-y;
		System.out.println("Substraction is : "+r);
	}
	private static void addition()
	{
		int a =10,b=20,c;
		c=a+b;
		System.out.println("Addition is : "+c);
		
	}

}
