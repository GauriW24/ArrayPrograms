package array_programs;

public class arrayExFive
{	
	public static void main(String args[])
	{
		//multidimentional array declaration
		//int[][] array;
		
		//instantiate an array
		int array[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(array[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
