package array_programs;

public class multidimentionalMul
{
	public static void main(String[] args) 
	{
		int arr[][] = {{1,1,1},{2,2,2},{3,3,3}};
		int arr2[][] = {{1,1,1},{2,2,2},{3,3,3}};
		int mult[][] = new int[3][3];
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr2.length; j++)
			{
				mult[i][j] = 0;
				for(int k=0; k<mult.length; k++)
				{
					mult[i][j] += arr[i][k] * arr2[k][j];
				}
				System.out.print(mult[i][j] + " ");
			}
			System.out.println();
		}
	}
}
