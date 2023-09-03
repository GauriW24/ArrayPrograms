package array_programs;
import java.util.Arrays;
import java.util.Scanner;

public class copyOfArray 
{
	public static void main(String[] args) 
	{
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements");
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		int copy[] = Arrays.copyOf(arr, 5);
		System.out.println("copied array is: ");
		for(int i=0; i<copy.length; i++)
		{
			System.out.println(copy[i]);
		}
		sc.close();
	}
}
