package com.DayFour;
import java.util.*;
public class MovieRating {
	public static void main(String[]args)
	{
		int[][]arr = {{4,7,6},{4,9,9},{2,4,3},{5,8,7}};
		avg(arr);
		
	}
	public static void avg(int[][]arr)
	{
		int i =0;
		while(i<arr.length)
		{
			int num = arr[i][0]+arr[i][1] +arr[i][2];
			int avg =num/3;
			i++;
			System.out.println(avg + " " + i);
			
		}
		
	}
}
