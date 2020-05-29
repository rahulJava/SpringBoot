import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) 
    {
        List<List<Integer> >list = new ArrayList();
        
        if(nums==null || nums.length<2)
            return list;
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length-2;i++)
        {
           if(i>0)
            {
            while(i<nums.length-2 &&nums[i]==nums[i-1])
                i++;
            }
            int l=i+1;
            int r=nums.length-1;
            while(l<r)
            {
                if(nums[i]+nums[l]+nums[r]==0)
                {
                    List<Integer> l1 = new ArrayList();
                    l1.add(nums[i]);
                    l1.add(nums[l]);
                    l1.add(nums[r]);
                    
                    list.add(l1);
                    l++;
                    r--;
                    while(l<r & nums[l]==nums[l-1])
                        l++;
                    while(l<r & nums[r]==nums[r+1])
                        r--;
                }
                else if(nums[i]+nums[l]+nums[r]<0)
                {
                    l++;
                }
                else
                    r--;
            }
         
        }
        return list;
    }
}