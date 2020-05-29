package Practise;
class QuickSort
{
	public static void main(String[] args) {
		
		int[] arr= {1,4,2,8,45,90,3};
		QuickSort qs = new QuickSort();
		qs.sort(arr,0,arr.length-1);
		qs.print(arr);
	}
	public void sort(int[] x , int low, int high)
	{
		if(low<high)
		{
			int partition = partition(x,low,high);
			sort(x,low,partition-1);
			sort(x,partition+1,high);
		}
		
	}
	public int partition(int[] arr, int low, int high) {
		
		int pivot = arr[high];
		int i=low-1;
		for(int j=low;j<high;j++)
		{
			if(arr[j]<=pivot)
				
			{
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		return i+1;
		
	}
	public void print(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
	}
}