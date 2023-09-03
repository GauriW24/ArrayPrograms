package array_programs;

class arrayExSix
{
	public static void main(String args[])
	{
		int[] s = {10,20,30,40,50,60,70,80,90,100};
		
		int[] d = new int[5];
		
		System.arraycopy(s, 2, d, 0, 5);
		
//		System.out.println(d.length);
		for(int i=0; i<d.length; i++)
		{
			System.out.println(d[i]);
		}
	}
}

