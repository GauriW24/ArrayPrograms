package array_programs;

public class matrixEquality 
{
	public static void main(String[] args) 
	{
		//method 1
//		int a[][] = {{1,0,0},{0,1,0},{0,0,1}};
//		int count=0;
//		int b[][] = {{1,1,0},{0,1,0},{0,0,1}};
//		for(int i=0;i<3;i++)
//		{
//			for(int j=0; j<3; j++)
//			{
//				if(a[i][j] == b[i][j])
//					count++;
//			}
//		}
//		if(count==9)
//			System.out.println("Both matrix are equal..");
//		else
//			System.out.println("Both matrix are not equal");
		
		//method 2
		
		int a[][] = {{1,0,0},{0,1,0},{0,0,1}};
		int b[][] = {{1,0,0},{0,1,0},{0,0,1}};
		boolean flag=true;
		int row1, col1, row2, col2;
		row1 = a.length; //3
		col1 = a[0].length; //3
		row2 = b.length;	//3
		col2 = b[0].length;	//3
		if(row1!=row2 || col1!=col2)
			System.out.println("Matrices are not equal..");
		else
		{
			for(int i=0; i<row1; i++)
			{
				for(int j=0;j<col1; j++)
				{
					if(a[i][j] != b[i][j])
					{
						flag=false;
						break;
					}
				}
			}
		}
		if(flag)
			System.out.println("Matrices are equal...");
		else
			System.out.println("Matrices are not equal...");
		
	}	
}
