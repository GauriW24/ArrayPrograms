package array_programs;

public class IdentityMatrix {

	public static void main(String[] args)
	{
		
		int rows=3, cols=3;
		boolean flag = true;
		int a[][] = {{1,0,0},{0,1,0},{0,0,1}};
		
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				System.out.print(" " + a[i][j]);
			}
			System.out.println();
		}
		
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				if(i==j && a[i][j] != 1)
				{
					flag = false;
					break;
				}
				 if(i != j && a[i][j] != 0){    
                     flag = false;    
                     break;    
                 }    
			}
		}
		if(flag)
		{
			 System.out.println("Given matrix is an identity matrix");
		}
		else
		{
			 System.out.println("Given matrix is not an identity matrix");
		}
	}
}
