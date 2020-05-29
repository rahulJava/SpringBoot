package DistinctPair;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PrintArrayPairs {
	public static void main(String args[]) {
		//prettyPrint(new int[] {3, 1, 4, 1, 5 }, 5);
		prettyPrint(new int[] { 2, 4, 7, 5, 9, 10, -1 }, 9);
	}

	/**
	 * * Given a number finds two numbers from an array so that * the sum is equal
	 * to that number k. * @param numbers * @param k
	 */
	public static void printPairsUsingTwoPointers(int[] numbers, int k) {
		if (numbers.length < 2) {
			return;
		}
		Arrays.sort(numbers);
		int left = 0;
		int right = numbers.length - 1;
		while (left < right) {
			int sum = numbers[left] + numbers[right];
			if (sum == k) {
				System.out.print("[" +numbers[left]+" ,"+ numbers[right]+"]");
				left = left + 1;
				right = right - 1;
			} else if (sum < k) {
				left = left + 1;
			} else if (sum > k) {
				right = right - 1;
			}
		}
	}
	
	
	public static void m1(int[] numbers, int k)
	{
		Arrays.sort(numbers);
		int left=0;
		int right=numbers.length-1;
		while(left<right)
		{
			int sum = numbers[left]+numbers[right];
			
			if(sum==k)
			{
				System.out.println(numbers[left]+" "+numbers[right]);
				left=left+1;
				right=right-1;
			}
			else if(sum<k)
			{
				left= left+1;
			}
			else if(sum>k)
			{
				right=right-1;
			}
		}
	}
	
	public static void m11(int [] numsbers, int k)
	{
		Set set = new HashSet();
		
		for(int value: numsbers)
		{
			int target = k - value;
			if(!set.contains(target))
			{
				set.add(value);
			}
			else
			{
				System.out.println("["+value+" "+target+"]");
			}
		}
	}
	
	 public static void printPairsUsingSet(int[] numbers, int n){
	        if(numbers.length < 2){
	            return;
	        }        
	        Set set = new HashSet(numbers.length);
	        
	        for(int value : numbers){
	            int target = n - value;
	            
	            // if target number is not in set then add
	            if(!set.contains(target)){
	                set.add(value);
	            }else {
	                System.out.printf("(%d, %d) %n", value, target);
	            }
	        }
	    }

	 public static void prettyPrint(int[] random, int k){
	        System.out.println( Arrays.toString(random));
	        System.out.println("All pairs in an array of integers"+ 
	        "whose sum is equal to a given value " + k);
	       // printPairsUsingTwoPointers(random, k);
	        m11(random, k);
	    }

}
