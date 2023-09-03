package array_programs;

public class subtractMatrix 
{
	public static void main(String[] args) 
	{
		int ArrayOne[][] = {{10,20,30},{40,50,60},{70,80,90}};
		int ArrayTwo[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int subArray[][] = new int[3][3];
		System.out.println("ArrayOne: ");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(" " + ArrayOne[i][j]);
			}
 			System.out.println();
		}
		System.out.println("ArrayTwo: ");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(" " + ArrayTwo[i][j]);
			}
			System.out.println();
		}
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				subArray[i][j] = ArrayOne[i][j] - ArrayTwo[i][j]; 
			}
		}
		System.out.println("subtracted array: ");
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(" " + subArray[i][j]);
			}
			System.out.println();
		}
		
	}
}
