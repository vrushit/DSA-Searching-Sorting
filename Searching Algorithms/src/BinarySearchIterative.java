
public class BinarySearchIterative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7,8};
		int x = 5;
		int result = LSalgo(arr, x);
		System.out.println(result);
		if(result == -1)
		{
			System.out.println("No Element Found in Array");
		}
		else {
			result = result+1;
			System.out.println("Element found at " + result);
		}

	}
	
	public static int LSalgo(int arr[],int x)
	{
		int l =0;
		int r = arr.length -1;
		while(l<=r)
		{
			int mid = (l + (r-1))/2;
			if(arr[mid] == x)
			{
				return mid;
			}
			
			if(arr[mid] < x)
			{
				l = mid+1;
			}
			else
			{
				r = mid-1;
			}
				
		}
		
		return -1;
	}

}
