package array_programs;
import java.util.ArrayList;
import java.util.Scanner; 
public class find_target_element_in_array 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
//		int arr[] = {1,2,3,4,5,6,7,8,9,10};
//		int flag=0;
//		System.out.println("Enter element to find in an array: ");
//		int targetElement = sc.nextInt();
		
//		for(int i=0; i<arr.length; i++)
//		{
//			if(targetElement == arr[i])
//			{
//				System.out.println(targetElement +" is present in an array.");
//				flag=1;
//				break;
//			}
//		}
//		if(flag==0)
//		{
//			System.out.println(targetElement +" is not "
//					+ "present in an array.");
//		}
		
		ArrayList<Integer> ele = new ArrayList<>();
		for(int i=1; i<6; i++)
		{
			ele.add(i);
		}
		System.out.println("Enter index to get element from arraylist: ");
		int index = sc.nextInt();
		if(index >1 && index <6)
			System.out.println("element at position "+ index + " is " + ele.get(index));
		else
			System.out.println("Enter invalid index.");
	}
}




