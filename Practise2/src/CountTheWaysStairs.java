import java.util.ArrayList;
import java.util.List;

public class CountTheWaysStairs 
{
	List<List<Integer>> list = new ArrayList<List<Integer>>();
	public static void main(String[] args)
	{
		int n=4;
	
		
		System.out.println(findStepCombinations(n));
		
 	}
	public static int findStepCombinations(int n)
	{
		
		if(n==1||n==0)
		{
			return 1;
		}
		else if(n==2)
			return 2;
		else
			return findStepCombinations(n-3)+
			findStepCombinations(n-2)+
			findStepCombinations(n-1);
		
	}
	 public static int findStep(int n) 
	    { 
		 List<Integer> list = new ArrayList();
	        if (n == 1 || n == 0)  
	            return 1; 
	        else if (n == 2)  
	            return 2; 
	       
	        else
	            return findStep(n - 3) +  
	                   findStep(n - 2) + 
	                   findStep(n - 1);     
	    } 
	      
}
