package array_programs;

import java.util.Arrays;
import java.util.Collections;

public class sortArray 
{
	public static void main(String[] args)
	{ 
//		int arr[] = {5,9,3,7,6,0};
//		int temp = 0;
//		for(int i=0; i<arr.length; i++)
//		{
//			for(int j=i+1; j<arr.length; j++)
//			{
//				if(arr[i]<arr[j])
//				{
//					temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
//		System.out.println("Sorted array is:");
//		for(int val: arr)
//		{
//			System.out.println(val);
//		}
		
		//using sort method 
		//Arrays.sort(arr);
		
		//sort descending using collections
		Integer arr[] = {1,2,3,4,5};
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
	}
}
