package array_programs;

public class thirdLargestEle 
{
	public static void main(String[] args)
	{
		int arr[] = {10,20,30,40};
		int len = arr.length, temp = 0, n=3;
		for(int i=0; i<len; i++)
		{
			for(int j=i+1; j<len; j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		//third largest
		System.out.println(arr[arr.length-3]);
		
		//second largest
		System.out.println(arr[arr.length-2]);
	}
}
