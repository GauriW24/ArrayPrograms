package array_programs;

//import java.util.ArrayList;
//import java.util.Collections;

//class reverseArray
//{
//	public static void main(String args[])
//	{
//		int arr[] = {10,20,30,40,50};
//		int len = arr.length;
//		int revArr[] = new int[len];
//		System.out.println("Original array:");
//		for(int i=0; i<arr.length; i++)
//			System.out.println(arr[i]);
//		for(int i=0; i<arr.length; i++)
//		{
//			len--;
//			revArr[len] = arr[i];
//		}
//		System.out.println("reverse array:");
//		for(int i=0; i<revArr.length; i++)
//			System.out.println(revArr[i]);
//	}
//}

//method 2
//
//class reverseArray
//{
//	public static void main(String args[])
//	{
//		ArrayList<Integer> ele = new ArrayList<Integer>();
//		for(int i=1; i<5; i++)
//		{
//			ele.add(i);
//			System.out.println(i);
//		}
//		System.out.println();
//		Collections.reverse(ele);
//		for(int i: ele)
//		{
//			System.out.println(i);
//		}
//		
//	}
//}


class reverseArray
{
	public static void main(String args[])
	{
		int arr[] = {1,2,3,4,5,6,7};
		int i=0, j=arr.length-1;
		while(i<j)
		{
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j--;i++;
		}
		for(int k=0; k<arr.length; k++)
		{
			System.out.println(arr[k]);
		}
		
	}
}


































