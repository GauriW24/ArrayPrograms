package array_programs;

//addition of two matrices

public class arrayExEight 
{
	public static void main(String[] args) 
	{
		int arr1[][] = {{1,2,3},{4,5,6}};
		
		int arr2[][] = {{7,8,9},{10,11,12}};
		//matrix 1
		System.out.println("Matrix 1: ");
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(" "+arr1[i][j]);
			}
			System.out.println();
		}
		
		//matrix2
		System.out.println("Matrix 2:");
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(" "+arr2[i][j]);
			}
			System.out.println();
		}
		
		int c[][] = new int[2][3];
		
		System.out.println("Addition: ");
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<3; j++)
			{
				c[i][j] = arr1[i][j] + arr2[i][j];
				System.out.print(" "+c[i][j]);
			}
			System.out.println();
		}
		
	}
}
