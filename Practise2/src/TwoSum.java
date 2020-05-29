import java.util.HashMap;

public class TwoSum {
	public static void findPairs(int arr1[], int arr2[], int n, int m, int x) {
// Insert all elements of first array in a hash 
		HashMap<Integer, Integer> s = new HashMap<Integer, Integer>();
		int count =0;
		for (int i = 0; i < n; i++) {
			if(s.containsKey(arr1[i]))
			{ 
				count++;
				continue;
			}
			else {
			s.put(arr1[i], 0);
			}
		}
// Subtract sum from second array elements one 
// by one and check it's present in array first 
// or not 
		for (int j = 0; j < m; j++)
		{
			if (s.containsKey(x - arr2[j]))
				count++;
				//System.out.println(x - arr2[j] + " " + arr2[j]);
				System.out.println(count);
	}
	}

	/* Driver program to test above function */
	public static void main(String[] args) {
		int arr1[] = { 1,2,2 };
		int arr2[] = { 2,3 };
		int x = 4;

		findPairs(arr1, arr2, arr1.length, arr2.length, x);
	}

}
