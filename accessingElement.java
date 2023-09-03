package array_programs;
import java.util.*;
public class accessingElement
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int index;
		System.out.println("Enter index to access element on it: ");
		index = sc.nextInt();
		
		if(index<=arr.length)
		{
			for(int i=0; i<arr.length; i++)
			{
				if(index == i)
				{
					System.out.println("Element at " + i + " th index is: " + arr[i]);
					break;
				}
				
			}
		} 
		else
		{
			System.out.println("Index not found..");
		}
		sc.close();
		
	}
}
