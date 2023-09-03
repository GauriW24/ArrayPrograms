package array_programs;

public class transposeMatrix
{
	public static void main(String[] args) 
	{
		int originalArr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int transpose[][] = new int[3][3];
		System.out.println("Original matrix is: ");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(" " + originalArr[i][j]);
			}
			System.out.println();
		}
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				transpose[i][j] = originalArr[j][i];
			}
		}
		System.out.println("Transose matrix is: ");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(" " + transpose[i][j]);
			}
			System.out.println();
		}
	}
}
