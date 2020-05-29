
public class FindValueinInfiniteSortedArray 
{
	public static void main(String[] args) {
		int arr[] = new int[]{3, 5, 7, 9, 10, 90,  
                100, 130, 140, 160, 170}; 
int ans = findPos(arr,10); 

if (ans==-1) 
System.out.println("Element not found"); 
else
System.out.println("Element found at index " + ans); 
	}
	public static int findPos(int[] x ,int y  )
	{
		int low=0;
		int high =1;
		
		while(x[high]<y)
		{
			low=high;
			
			if(2*high < x.length-1)
			{
				high=2*high;
				
			}
			else
			{
				high = x.length-1;
			}
			
		}
		return BinarySearch(x,low, high,y);
	}
	public static int BinarySearch(int[] x, int low, int high, int y)
	{
		if(high>=low)
		{
		int mid = low+(high-low)/2;
		if(x[mid]==y)
			return mid;
		if(y>x[mid])
		{
			return BinarySearch(x, mid+1, high, y);
		}
		if(y<x[mid])
		{
			return BinarySearch(x, low, mid-1, y);
		}
	}
		return -1;
	}

}
