package array_programs;

public class arrayExFour
{
	
	void min(int arr[])
	{
		int min = arr[0];
		for(int i=1; i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min = arr[i];
			}
		}
		System.out.println(min);
	}
	
	public static void main(String args[])
	{
		//array declaration
		int array[] = {20,30,40,50,10};
		arrayExFour a = new arrayExFour();
		a.min(array);
		
		//passing anonymous array to method
		a.min(new int[] {20,30,10,5});
	}
}
