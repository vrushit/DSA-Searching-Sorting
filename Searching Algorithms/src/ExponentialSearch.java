import java.util.Arrays;

public class ExponentialSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = { 1,2,3,4,5,6,7,8,9};
		int x1 = 3;
		int x2 = 8;
		
		int result1 = ExponentialSearchAlgo(arr, x1);
		int result2 = ExponentialSearchAlgo(arr, x2);
		
		System.out.println(result1);
		System.out.println(result2);


	}
	
	public static int ExponentialSearchAlgo(int arr[], int x)
	{
		int n = arr.length;
		
		if(arr[0] == x)
			return 0;
		
		int i=1;
		while(i<n && arr[i] <=x)
			i = i*2;
		
		return Arrays.binarySearch(arr,  i/2, Math.min(i, n-1), x);
		
	}

}
