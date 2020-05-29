

public class MaxDepth 
{

	 public int maxDepth(TreeNodee root) {
	        
	        if(root==null)
	            return 0;
	        return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
	    }
}
