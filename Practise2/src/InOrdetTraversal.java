import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrdetTraversal 
{
	  public List<Integer> inorderTraversal(TreeNode root) {
		  List<Integer> list = new ArrayList<>();
		  
		  if(root==null)
		  {
			  return list;
		  }
		  
		  Stack<TreeNode> stack = new Stack<TreeNode>();
		  TreeNode curr=root;
		  
		  while(curr!=null|| !stack.isEmpty())
		  {
			  while(curr!=null)
			  {
				  stack.push(curr);
				  curr=curr.left;
			  }
			  
			  curr=stack.pop();
			  list.add(curr.val);
			  curr=curr.right;
		  }
		  return list;
	  }
	 
}
