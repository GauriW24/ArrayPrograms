package array_programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class removeDuplicateEle 
{
	public static void main(String[] args) 
	{
		//brute method
//		int arr[] = {1,2,2,1,6,5,6,7};
//		for(int i=0; i<arr.length; i++)
//		{
//			for(int j = i+1; j<arr.length; j++)
//			{
//				if(arr[i] == arr[j])
//					System.out.println(arr[i]);
//				
//			}
//		}
		
		//by using hashset
//		ArrayList<Integer> list = new ArrayList<>();
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		list.add(40);
//		list.add(10);
//		list.add(60);
//		list.add(20);
//		list.add(60);
//		System.out.println("List is: " + list);
//		Set<Integer> set = new HashSet<>(list);
//		System.out.println(set);
		
		//using hashmap
		/*int arr[] = {1,2,3,2,5,6,5,9,2};
		HashMap<Integer, Boolean> mp = new HashMap<>();
		for(int i=0; i<arr.length; i++)
		{
			if(mp.get(arr[i])==null)
				System.out.println(arr[i] + " ");
			
			mp.put(arr[i], true);
		}*/ 
		
	}
}