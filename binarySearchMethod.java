package array_programs;
import java.util.Arrays;
import java.util.Scanner;

public class binarySearchMethod {

	//binarySearch() - to search element in an array
 	public static void main(String[] args) 
 	{
		int a[] = {10,20,30,40,50,60,70,80,90,100};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element to be searched: ");
		int ele = sc.nextInt();
		
		int indexOfSearchedElement = Arrays.binarySearch(a, ele);
		
		if(indexOfSearchedElement < 0)
		{
			System.out.println("Element is not in an array");
		}
		else
			System.out.println("Element is at " + indexOfSearchedElement + " index");
		
		System.out.println(a.getClass().getName());
		
		
	}

}
