
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {2,5,7,1,5,6};
		BubbleSort(arr);
	}

	public static void BubbleSort(int arr[])
	{
		
		int n = arr.length;
		
		boolean swap;
		
		for(int i = 0;i<n-1;i++)
		{
			swap = false;
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swap = true;
				}
			}
			if(swap == false)
			{
				break;
			}
			
		}
		
		for(int i = 0;i<n-1;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
