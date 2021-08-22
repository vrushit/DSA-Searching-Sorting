
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2,5,7,1,5,6};
		selectionSortAlgo(arr);
		
	}
	
	public static void selectionSortAlgo(int arr[])
	{
		int n = arr.length;
		for(int i =0;i<n-1;i++)
		{
			int min = i;
			for(int j = i+1;j<n;j++)
			{
				if(arr[j] < arr[min])
				{
					min = j;
				}
			}
			
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;

		}
		
		for(int i = 0;i<n-1;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
