package array_programs;

public class anonymousArray 
{
	public static void sum(int a[])
	{
		int total =0;
		for(int i: a)
		{
			total +=i;
		}
		System.out.println("sum: " + total);
	}
	
	public static void main(String[] args) 
	{
		sum(new int[] {1,2,3,4});
	}
}
