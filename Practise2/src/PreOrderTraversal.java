import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderTraversal 
{
	 public List<Integer> preorderTraversal(TreeNode root) {
		 
		 List<Integer> list = new ArrayList();
		 if(root==null)
		 {
			 return list;
		 }
		 
		 Stack<TreeNode > stack = new Stack<TreeNode>();
		 
		 while(!stack.isEmpty())
		 {
			 TreeNode currNode = stack.pop();
			 list.add(currNode.val);
			 if(currNode.right!=null)
			 {
				 stack.push(currNode.right);
			 }
			 if(currNode.left!=null)
			 {
				 stack.push(currNode.left);
			 }
		 }
		 return list;
	 }

}
