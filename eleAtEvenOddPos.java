package array_programs;

import java.util.ArrayList;
import java.util.Scanner;

public class eleAtEvenOddPos 
{
	public static void main(String[] args) 
	{
		//elements at even position
//		int arr[] = {1,2,3,4,5,6,7,8,9,10};
//		System.out.println("Original array is: ");
//		for(int i=0; i<arr.length; i++)
//		{
//				System.out.println(arr[i]);
//		}
//		
//		System.out.println("Elements at even position is: ");
//		for(int i=0; i<arr.length; i++)
//		{
//			if(i%2==0)
//			{
//				System.out.println(arr[i]);
//			}
//		}
		
		//elements at odd position
		
//		for(int i=0; i<arr.length; i++)
//		{
//			if(i%2!=0)
//			{
//				System.out.println(arr[i]);
//			}
//		}
		
		ArrayList<Integer> ele = new ArrayList<>();
		System.out.println("Original array is: ");
		for(int i=1; i<10; i++)
		{
				ele.add(i);
		}
		System.out.println(ele);
		System.out.println("Elements at even position is: ");
//		element at even position
//		for(int i=0; i<10; i++)
//		{
//			if(i%2==0)
//				System.out.println(ele.get(i));
//		}
		//element at odd position
		for(int i=0; i<10; i++)
		{
			if(i%2!=0)
				System.out.println(ele.get(i));
		}
		
	}
}
