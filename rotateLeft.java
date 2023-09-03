package array_programs;

public class rotateLeft 
{
	public static void main(String[] args) 
	{
		int n=2; 
		int arr[] = {1,2,3,4,5,6,7,8,9};
		System.out.println("Original array is:");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(" " + arr[i]);
		}
		
		for(int i=0; i<n; i++)
		{
			int first,j;
			first = arr[0];
			for(j=0; j<arr.length-1; j++)
			{
				arr[j] = arr[j+1];
			}
//			System.out.println("j" + j);
			arr[j] = first;
		}
		System.out.println("\nAfter left shifting of an element");
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(" " + arr[i]);
		}
	}
}
