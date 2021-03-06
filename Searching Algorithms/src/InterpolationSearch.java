
public class InterpolationSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int x = 12;
		int n = arr.length;
		int result = InterpolationSearchAlgo(arr, 0, n-1, x);
		
		if(result != -1)
		{
			System.out.println("Element found at: " + result);
		}
		else {
			System.out.println("Element not found");
		}
		
		
	}
	
	public static int InterpolationSearchAlgo(int arr[], int lo, int hi, int x)
	{
		int pos;
		
		if(lo <= hi && x >= arr[lo] && x<= arr[hi])
		{
			pos = lo + (((hi-lo)/(arr[hi] - arr[lo]))* (x - arr[lo]));
			
			if(arr[pos] == x)
				return pos;
			
			if(arr[pos] < x)
				return InterpolationSearchAlgo(arr, pos+1, hi, x);
			
			if(arr[pos] > x)
				return InterpolationSearchAlgo(arr, lo, pos-1, x);
		
		}
		
		return -1;
	}

}
