package array_programs;

import java.util.ArrayList;
import java.util.*;

public class addNewElement 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
//		int arr[] = {1,2,3,4,5,6};
//		int n = arr.length;
//		int index = 3;
//		
//		//insert element at ith index
//		int newArr[] = new int[n+1];
//		int j=0;
//		for(int i=0; i<n+1; i++)
//		{
//			if(i==index)
//			{
//				newArr[i] = 7;
//			}
//			else
//			{
//				newArr[i] = arr[j];
//				j++;
//			}
//		}
//		System.out.println("After adding value: ");
//		for(int i=0; i<newArr.length; i++)
//		{
//			System.out.println(newArr[i]);
//		}
		
		//override an array element
//		for(int i=0; i<arr.length; i++)
//		{
//			if(i==index)
//			{
//				arr[i] = 10;
//			}
//		}
//		System.out.println("Array after overriding element");
//		for(int i=0; i<arr.length; i++)
//		{
//			System.out.println(arr[i]);
//		}
		
		ArrayList<Integer> ele = new ArrayList<>();
		ele.add(10);
		ele.add(20);
		ele.add(30);
		ele.add(40);
		ele.add(50);
		System.out.println("Enter index to add an element");
		int index = sc.nextInt();
		System.out.println("Enter element to insert: ");
		int element = sc.nextInt();
		for(int i=0; i<5; i++)
		{
			if(index==i)
			{
				ele.add(index,element);
				break;
			}
		}
		for(int val: ele)
		{
			System.out.println(val);
		}
		
	}
}
