
public class MaximumSumSubArray {
	 public int maxSubArray(int[] nums) {
		 
		 int maxEndingHere=nums[0];
		 int maxSeenSofar=nums[0];
		 
		 for(int i=1;i<nums.length;i++)
		 {
			 maxEndingHere=Math.max(maxEndingHere+nums[i],nums[i]);
			 maxSeenSofar=Math.max(maxEndingHere, maxSeenSofar);
		 }
		 return maxSeenSofar;
	 }

}
