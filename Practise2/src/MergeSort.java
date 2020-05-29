package Practise;

public class MergeSort {
	public static void main(String[] args) {
		
		int[] x= {23,56,3,6,8,1,8,45};
		sort(x,0,x.length-1);
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+" :");
		}
	}
	public static void sort(int[]x,int low , int high)
	{
		if(low<high)
		{
			int mid =(low+high)/2;
			
			sort(x,low,mid);
			sort(x,mid+1,high);
			merge(x,low,mid,high);
		}
	}
	public static void merge(int[] x,int low,int mid,int high)
	{
		int n1= mid-low+1;
		int n2= high-mid;
		
		int[] temp1= new int[n1];
		int[] temp2= new int[n2];
		
		for(int i=0;i<n1;i++)
		{
			temp1[i]= x[low+i];
		}
		for(int j=0;j<n2;j++)
		{
			temp2[j]=x[mid+1+j];
		}
		
		int i=0,j=0;
		int k=low;
		
		while(i<n1 && j<n2)
		{
			if(temp1[i]<=temp2[j])
			{
				x[k]=temp1[i];
				i++;
			}
			else
			{
				x[k]=temp2[j];
				j++;
			}
			k++;
		}
		while(i<n1)
		{
			x[k]=temp1[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			x[k]=temp2[j];
			j++;
			k++;
		}
	}
	

	

}
