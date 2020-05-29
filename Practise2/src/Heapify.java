package Practise;

public class Heapify {

	public static void main(String[] args) {
		int[] arr= {1,4,3,5,98,67};
		Heapify heap = new Heapify();
		heap.sort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
		
	}
	public void sort(int[] arr)
	{
		int n = arr.length;
		
		for(int i=n/2-1;i>=0;i--)
	{
		heapify(arr,arr.length-1,i);
	}
		for(int i = n-1;i>=0;i--)
		{
			int temp=arr[0];
			
			arr[0]=arr[i];
			arr[i]=temp;
			heapify(arr,i,0);
			
		}
		
	}
	
	public void heapify(int arr[], int n,int i)
	{
		int largest=i;
		int l=2*i+1;
		int r=2*i+2;
		
		if(l<n&& arr[l]>arr[largest])
		{
			largest=l;
		}
		if(r<n && arr[r]>arr[largest])
		{
			largest=r;
		}
		if(largest!=i)
		{
			int temp=arr[i];
			arr[i]=arr[largest];
			arr[largest]=temp;
			heapify(arr,n,largest);
			
		}
	}

}
