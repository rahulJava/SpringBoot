

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class PathSum {
	
public List<List<Integer>> pathSum(TreeNodee root, int sum) {
        
        List<List<Integer>> LeafList= new ArrayList<List<Integer>>();
        
        if(root==null)
        {
            return LeafList;
        }
        
        dfs(root, sum, LeafList,new ArrayList<Integer>());
        
        return LeafList;
        
    }
    
    public void dfs(TreeNodee root, int sum, List<List<Integer>> leafList, List<Integer> sol)
    {
    
        if(root==null)
            return;
        sol.add(root.val);
        
        if(root.left==null && root.right==null && sum==root.val)
        {
            leafList.add(new ArrayList<Integer>(sol));
        }
        
        if(root.left!=null)
        {
            dfs(root.left, sum-root.val,leafList, sol);
            sol.remove(sol.size()-1);
        }
        if(root.right!=null)
        {
            dfs(root.right,sum-root.val,leafList,sol);
            sol.remove(sol.size()-1);
        }
    }

}
