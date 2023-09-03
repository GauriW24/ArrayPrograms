package array_programs;

class sumOfArrayElements
{
	public static int sumOfElements(int arr[])
	{
		int sum=0;
		for(int i=0; i<arr.length; i++)
		{
			sum = sum + arr[i];
		}
		return sum;
	}
}

public class sumOfArrElements {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int result = sumOfArrayElements.sumOfElements(arr);
		System.out.println(result);
	}

}
