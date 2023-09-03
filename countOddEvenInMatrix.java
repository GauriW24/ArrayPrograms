package array_programs;

public class countOddEvenInMatrix 
{
	public static void main(String[] args) 
	{
		int arr[][] = {{4,2,6},{1,3,5},{9,8,30}};
		int rows, cols,evenCount=0, oddCount=0;
		rows = arr.length;
		cols = arr[0].length;
		
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				if(arr[i][j]%2==0)
					evenCount++;
				else
					oddCount++;
			}
		}
		
		System.out.println("Even Numbers frequency is: " + evenCount);
		
		System.out.println("Odd Numbers frequency is: " + oddCount);
	}
}
