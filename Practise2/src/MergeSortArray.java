import java.util.Arrays;

public class MergeSortArray 
{
	public static void main(String[] args) {
	}
	
	public static int[] mergeArrays(int[] arr1, int[] arr2, int n1, 
            int n2, int[] arr3) 
{ 
	
		int length=n1+n2;
		 arr3 = new int[length];
		int i=0,j=0,k=0;
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		while(i<n1 && j< n2)
		{
			if(arr1[i]<arr2[j])
			{
				arr3[k++]=arr1[i];
			}
			else
			{
				arr3[k++]=arr2[j];
			}
		}
		if(i<arr1.length)
		{
			arr3[k]=arr1[i];
			i++;
			k++;
		}
		if(j<arr1.length)
		{
			arr3[k]=arr1[j];
			j++;
			k++;
		}
		return arr3;
		
}

}
