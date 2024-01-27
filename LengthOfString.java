package com.DayFour;
import java.util.*;
public class LengthOfString {
	static Scanner sc = new Scanner(System.in);
	static String name;
	public static void main(String []args)
	
	{
		
		String resName = userInput();
		int res = checkLength();
		System.out.println(res);
		
		
	}
	private static String userInput()
	{
		System.out.print("Enter a String ");
		name = sc.next();
		return name;
	}
	private static int checkLength()
	{
		int length=0;
		for(char a:name.toCharArray())
		{
			length ++;
		}
		return length;
	}
	

}
