package array_programs;

public class rotateRight 
{
	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,4,5};
		int n=3 ;
		System.out.println("original array");
		for(int val: arr)
			System.out.print(" "+ val);
		
		for(int i=0; i<n; i++)
		{
			int j, last = arr[arr.length-1];
			for(j=arr.length-1; j>0; j--)
			{
				arr[j] = arr[j-1];
			}
			arr[0] = last;
		}
		
		System.out.println("After rotation: ");
		for(int val: arr)
		{
			System.out.print(" "+val);
		}
	}
}
