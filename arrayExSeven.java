package array_programs;
/*
public class arrayExSeven 
{
	public static void main(String[] args) 
	{
		int array1[] = {10,20,30,40,50};
		System.out.println("Original array is:");
		for(int i=0; i<array1.length; i++)
		{
			System.out.println(array1[i]);
		}
		
		//printing/ creating clone of an array
		int cloneArray[] = array1.clone();
		System.out.println("Clone array is:");
		for(int i=0; i<cloneArray.length; i++)
		{
			System.out.println(cloneArray[i]);
		}
		
		System.out.println("Are both array and clone of an array are equal?");
		
		System.out.println(array1 == cloneArray);
		
		System.out.println("array1: " + array1);
		System.out.println("cloneArray: "+cloneArray);
//		for(int i=0; i<array1.length;i++)
//		{
//			System.out.println(array1[i] == cloneArray[i]);
//		}
		
	}
}
*/

public class arrayExSeven 
{
	public static void main(String[] args) 
	{
		int array1[][] = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("Original array is:");
		for(int i=0; i<array1.length; i++)
		{
			for(int j=0; j<array1.length; j++)
			{
				System.out.print(array1[i][j]);
			}
			System.out.println();
		}
		
		//printing/ creating clone of an array
		int cloneArray[][] = array1.clone();
		System.out.println("Clone array is:");
		for(int i=0; i<cloneArray.length; i++)
		{
			for(int j=0; j<cloneArray.length; j++)
			{
				System.out.print(cloneArray[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("Are both array and clone of an array are equal?");
		
		System.out.println(array1 == cloneArray);
		
		System.out.println("array1: " + array1);
		System.out.println("cloneArray: "+cloneArray);
		
		for(int i=0; i<array1.length;i++)
		{
			for(int j=0; j<array1.length; j++)
			{
				System.out.println(array1[i][j] == cloneArray[i][j]);
			}
			
		}
		
	}
}