package array_programs;

public class sumOfEachRowCol 
{
	public static void main(String[] args) 
	{
		int a[][] = {{1,2,3},{56,80,12},{8,7,5}};
		int rows, cols;
		int sum;
		rows = a.length;
		cols = a[0].length;
		
		//original matrix
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				System.out.print(a[i][j]);
			}
		}
		
		//sum of rows
		System.out.println("sum of rows: ");
		for(int i=0; i<rows; i++)
		{
			sum=0;
			for(int j=0; j<cols; j++)
			{
				sum = sum + a[i][j];
			}
			System.out.println(sum);
		}
		//sum of columns
		System.out.println("sum of columns: ");
		for(int i=0; i<rows; i++)
		{
			sum=0;
			for(int j=0; j<cols; j++)
			{
				sum = sum + a[j][i];
			}
			System.out.println(sum);
		}
	}
}