
public class JumpSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {0,1,1,2,3,5,8,13,21,34};
		int x = 5;
		int result = JumpSearchAlgo(arr, x);
		if(result == -1)
		{
			System.out.println("No Match Found");
		}
		else {
			result +=1;
			System.out.println("Match Found at : " + result);
		}
		System.out.println((int)Math.floor(Math.sqrt(6)));
			
	}
	
	public static int JumpSearchAlgo(int arr[], int x)
	{
		int n = arr.length;
		
		int prev = 0;
		
		int step = (int)Math.floor(Math.sqrt(n));
		
		while(arr[Math.min(step,  n)-1] < x)
		{
			prev = step;
			step += (int)Math.floor(Math.sqrt(n));
			if(prev >= n)
			{
				return -1;
			}
		}
		
		while(arr[prev] < x)
		{
			prev++;
			
			if(prev == Math.min(step, n))
				return -1;
		}
		
		if(arr[prev] == x)
			return prev;
				
		return -1;
	}

}
