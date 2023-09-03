package array_programs;

public class sparseMatrix 
{
	public static void main(String[] args) 
	{
		int arr[][] = {{4,0,0},{0,5,0},{5,9,6}};
		int size = ((arr[0].length) * (arr.length))/2;
		int count=0;
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				if(arr[i][j]==0)
					count++;
			}
		}
		if(count>size)
			System.out.println("It is a sparse matrix");
		else
			System.out.println("It is not a sparse matrix");
	}
}
