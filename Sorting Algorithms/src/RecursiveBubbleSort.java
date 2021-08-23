
public class RecursiveBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2,5,7,1,5,6};
		int n = arr.length;
		RBS(arr,n);
		
	}
	
    public static void RBS(int arr[], int n)
    {
    	
    	if(n==1)
    		return;
    	
    	for(int i =0;i<n-1;i++)
    	{
    		if(arr[i] > arr[i+1])
    		{
    			int temp = arr[i];
    			arr[i] = arr[i+1];
    			arr[i+1] = temp;
    		}
    		RBS(arr, n-1);
    	}
    	
    	for(int i = 0;i<n-1;i++)
		{
			System.out.println(arr[i]);
		}
    }

}
