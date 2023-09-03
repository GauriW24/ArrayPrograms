package array_programs;
import java.util.*;
//method to find duplicate elements
public class freqOfArrayElements 
{
	public static void main(String[] args) 
	{
		int arr[] = {1,1,2,3,4,4};
		int freq=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check it's frequency:");
		int element = sc.nextInt();
		for(int i=0; i<arr.length; i++)
		{
			if(element == arr[i])
			{
				freq++;
			}
		}
		if(freq>1 || freq==1)
		{
			System.out.println("frequency of " + element + " is: " + freq);
			
		}
		else
			System.out.println("Element is not found in an array");
		sc.close();
	}
}
 