
public class FindValueFromSorted 
{
	public static void main(String[] args) {
	
		
	}
	public static int findpos(int[] x, int y)
	{
		int low =0;
		int high=1;
		
		while(x[high]<y)
		{
			low=high;
			
			if(2*high<x.length-1)
			{
				high=2*high;
				
			}
			else
			{
				high=x.length-1;
			}
		}
		return BinarySearch(x, low,high,y);
	}
	public static int BinarySearch(int[] x,int low, int high,int y)
	{
		if(high>=low)
		{
			int mid = low+(high-low)/2;
			if(x[mid]==y)
				return  mid;
			else if(y>x[mid])
			{
				return BinarySearch(x, mid+1, high, y);
			}
			else if(y<x[mid])
			{
				return BinarySearch(x, low, mid-1, y);
			}
			
		}
		return -1;
	}

}
