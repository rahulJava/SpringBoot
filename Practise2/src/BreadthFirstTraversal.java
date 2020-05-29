import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstTraversal {
	
	public void levelOrderTraversal(TreeNode root)
	{
		
		List<List<TreeNode>> list = new ArrayList<List<TreeNode>>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.offer(root);
		
		while(!queue.isEmpty())
		{
			int size =queue.size();
			List<TreeNode> list1 = new ArrayList();
			for(int i=0;i<size;i++)
			{
				TreeNode curr=queue.remove();
				list1.add(curr);
				if(curr.left!=null)
				{
					queue.offer(curr.left);
				}
				if(curr.right!=null)
				{
					queue.offer(curr.right);
				}
			}
			list.add(list1);
			
		}
	}

}
