//import Facebook.MaximumProductSubArray;

public class MaximumProductsSubArray 
{
	public static void main(String[] args) {
		int num[]= {-2,-5,-2,-4,3};
		//MaximumProductSubArray max = new MaximumProductSubArray();
		int n=maxProduct(num);
		System.out.println(n);
	}
	 public static int maxProduct(int[] nums) 
	    {
		 int positive =1;
		 int negative =1;
		 int res=1;
		 
		 for(int i=0;i<nums.length;i++)
		 {
			 if(nums[i]>0)
			 {
				 positive=Math.max(positive*nums[i], nums[i]);
				 negative=negative*nums[i];
			 }
			 else
			 {
				 int temp=negative;
				 negative=Math.min(positive*nums[i],nums[i]);
				 positive=temp*nums[i];
				 
			 }
		 }
		 res=Math.max(res, positive);
		 res=Math.max(res,negative);
		 return res;
		 
	    }

}
