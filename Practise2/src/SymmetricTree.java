

public class SymmetricTree 
{
	 public boolean isSymmetric(TreeNodee root) {
		 
		 if(root==null)
			 return true;
		 
		 TreeNodee root1=root;
		 
		 if(isFalse(root,root1))
		 {
			 return true;
		 }
		 return false;
		 
	 }
	 public boolean isFalse(TreeNodee root, TreeNodee root1)
	 {
		 if(root==null && root1==null)
		 {
			 return true;
		 }
		 if(root==null || root1==null)
		 {
			 return false;
		 }
		 if(root.val!=root.val)
		 {
			 return false;
		 }
		 return isFalse(root.left, root1.right) && isFalse(root.right, root1.left);
	 }

}
