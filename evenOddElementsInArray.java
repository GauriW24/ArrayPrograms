package array_programs;

public class evenOddElementsInArray 
{
	//even odd elements in array
	public static void main(String[] args) 
	{
		int arr[] = {2,4,3,6,5,9,50};
		for(int i=0; i<arr.length; i++)
			System.out.println(arr[i]);
		
		System.out.println("Even elements in an array: ");
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
				System.out.println(arr[i]);
		}
		
		System.out.println("Odd elements in an array: ");
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2!=0)
				System.out.println(arr[i]);
		}
	}
}
