 package array_programs;
//single dimensional array

public class arrayExOne 
{
	public static void main(String[] args) 
	{
		//array declaration
		int[] array;
//		int []array1;
//		int array2[];
		
		//array instantiation
		array = new int[10];
		System.out.println("Array length: " + array.length);
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
		array[4]=50;
		array[5]=60;
						
		for(int i=0; i<=6; i++)
		{
			System.out.println("Array elements: " + array[i]);
		}
		
		//hence proved array length can be fixed in size.f
		System.out.println("Array length: " + array.length);
	}
	
}
