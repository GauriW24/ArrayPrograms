package array_programs;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteElement
{
	public static void main(String[] args) 
	{
		//delete array element by index
//		int arr[] = {1,2,3,4,5,6};
//		int position = 3, length = arr.length;
//		for(int i=position; i<length-1; i++)
//		{
//			arr[i] = arr[i+1];
//			System.out.println(" " + arr[i]);
//		}
//		
//		length = length - 1;
//		
//		System.out.println("After deleting..");
//		
//		for(int i = 0; i<length; i++)
//		{
//			System.out.println(arr[i]);
//		}
		
		//using element
//		int arr[] = {1,2,3,4,5,6};
//		int element = 3, length = arr.length;
//		System.out.println("Original array");
//		
//		for(int i = 0; i<length; i++)
//		{
//			System.out.println(arr[i]);
//		}
//		
//		System.out.println("After deleting " + element + " : ");
//		
//		for(int i = 0; i<length; i++)
//		{
//			if(element == arr[i])
//				continue;
//			System.out.println(arr[i]);
//		}
		
		//using remove() in collections
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> ele = new ArrayList<>();
		
		for(int i=10; i<15; i++)
		{
			ele.add(i);
		}
		System.out.println("Original array: ");
		for(int val: ele)
			System.out.println(val);
		
//		System.out.println("Enter index to delete element on that index: ");
//		int index = sc.nextInt();
//		ele.remove(index);
		
		System.out.println("Enter element to be deleted: ");
		int element = sc.nextInt();
		ele.remove(element);
		
		System.out.println("after deleting array: ");
		for(int val: ele)
			System.out.println(val);
	}
}




















