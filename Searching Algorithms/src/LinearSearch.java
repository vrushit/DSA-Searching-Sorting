
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int arr[] = {1,4,6,5,7,8};
	int n = 4;
	int m = 19;
	int result = LinearSearchAlgo(arr,m);
	if(result == -1)
	{
		System.out.println("Element not present in the Array");
	}
	else {
		result = result+1;
		System.out.println("Element found at " + result);
	}
	
		

	}
	
	public static int LinearSearchAlgo(int arr[], int n)
	{
		int i;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i] == n)
			{
				return i;
			}
		}
		return -1;
	}

}
